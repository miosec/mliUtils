package org.hiapk.mliutils.banner;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public class Banner extends ViewPager {
	/**
	 * xml����Ĭ�ϵ���
	 * 
	 * @param context
	 * @param attrs
	 */
	public Banner(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * ���봴��Ĭ�ϵ���
	 * 
	 * @param context
	 */
	public Banner(Context context) {
		super(context);
	}

	/**
	 * 
	 * @param context
	 *            ������
	 * @param isFullScrenn
	 *            �Ƿ�ȫ��
	 * @param Resolution
	 *            �ֱ���,���ȫ����Ϊ""
	 * @param ImgUrlOrDrawable
	 *            ͼƬurl���Ӽ��ϻ�ͼƬ��Դ���Ӽ���
	 * @param StartButtonUrlOrDrawable
	 *            ��ʼ��ťͼƬURl���ӻ�ͼƬ��Դ����
	 * @param PageCount
	 *            ҳ����
	 */
	public Banner(Context context, boolean isFullScrenn, String Resolution, int AnimationStyle, int PageCount,
			ArrayList<String> ImgUrlOrDrawable, String StartButtonUrlOrDrawable, Class<?> dst) {
		super(context);// ����Ĭ�ϴ��봴�����췽��
		if (isFullScrenn) {// �ж��Ƿ�ȫ��

		} else {
		}
	}
}
