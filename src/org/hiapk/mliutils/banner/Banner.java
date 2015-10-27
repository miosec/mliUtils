package org.hiapk.mliutils.banner;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

public class Banner extends ViewPager {
	/**
	 * xml创建默认调用
	 * 
	 * @param context
	 * @param attrs
	 */
	public Banner(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	/**
	 * 代码创建默认调用
	 * 
	 * @param context
	 */
	public Banner(Context context) {
		super(context);
	}

	/**
	 * 
	 * @param context
	 *            上下文
	 * @param isFullScrenn
	 *            是否全屏
	 * @param Resolution
	 *            分辨率,如果全屏则为""
	 * @param ImgUrlOrDrawable
	 *            图片url链接集合或图片资源链接集合
	 * @param StartButtonUrlOrDrawable
	 *            开始按钮图片URl链接或图片资源链接
	 * @param PageCount
	 *            页面数
	 */
	public Banner(Context context, boolean isFullScrenn, String Resolution, int AnimationStyle, int PageCount,
			ArrayList<String> ImgUrlOrDrawable, String StartButtonUrlOrDrawable, Class<?> dst) {
		super(context);// 调用默认代码创建构造方法
		if (isFullScrenn) {// 判断是否全屏

		} else {
		}
	}
}
