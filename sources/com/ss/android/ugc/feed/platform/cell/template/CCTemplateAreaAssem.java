package com.ss.android.ugc.feed.platform.cell.template;

import X.C224868s6;
import X.C51029K0z;
import X.C57092Lx;
import X.C61447O9r;
import X.C77123UOp;
import X.C79045V0n;
import X.KL2;
import X.Q8U;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CCTemplateAreaAssem extends FeedBaseAssem<CCTemplateAreaAssem> {
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cpz;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = getContainerView().findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        Context context;
        TextView textView;
        Resources resources;
        String string;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        String str = null;
        if (C224868s6.LIZLLL(item.getAweme())) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.view_rootview);
            if (_$_findCachedViewById != null && (findViewById6 = _$_findCachedViewById.findViewById(R.id.niu)) != null) {
                findViewById6.setVisibility(8);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.b7z);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            if (item.getAweme().getCcTemplateInfo() != null && !item.getAweme().getCcTemplateInfo().getMusic_copyright()) {
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.view_rootview);
                if (_$_findCachedViewById3 != null && (findViewById5 = _$_findCachedViewById3.findViewById(R.id.b81)) != null) {
                    findViewById5.setVisibility(0);
                }
            } else {
                View _$_findCachedViewById4 = _$_findCachedViewById(R.id.view_rootview);
                if (_$_findCachedViewById4 != null && (findViewById2 = _$_findCachedViewById4.findViewById(R.id.b81)) != null) {
                    findViewById2.setVisibility(8);
                }
            }
            if (item.getAweme().getCcTemplateInfo() != null && item.getAweme().getCcTemplateInfo().getUsage() > 0 && (context = getContext()) != null && context.getResources() != null) {
                View _$_findCachedViewById5 = _$_findCachedViewById(R.id.view_rootview);
                if (_$_findCachedViewById5 != null && (findViewById4 = _$_findCachedViewById5.findViewById(R.id.b83)) != null) {
                    findViewById4.setVisibility(0);
                }
                View _$_findCachedViewById6 = _$_findCachedViewById(R.id.view_rootview);
                if (_$_findCachedViewById6 == null || (textView = (TextView) _$_findCachedViewById6.findViewById(R.id.b83)) == null) {
                    return;
                }
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.tjh)) != null) {
                    str = Q8U.LIZIZ(new Object[]{C77123UOp.LJJIIJ(item.getAweme().getCcTemplateInfo().getUsage())}, 1, string, "format(this, *args)");
                }
                textView.setText(str);
                return;
            }
            View _$_findCachedViewById7 = _$_findCachedViewById(R.id.view_rootview);
            if (_$_findCachedViewById7 == null || (findViewById3 = _$_findCachedViewById7.findViewById(R.id.b83)) == null) {
                return;
            }
            findViewById3.setVisibility(8);
            return;
        }
        View _$_findCachedViewById8 = _$_findCachedViewById(R.id.view_rootview);
        if (_$_findCachedViewById8 != null && (findViewById = _$_findCachedViewById8.findViewById(R.id.niu)) != null) {
            findViewById.setVisibility(0);
        }
        View _$_findCachedViewById9 = _$_findCachedViewById(R.id.b7z);
        if (_$_findCachedViewById9 == null) {
            return;
        }
        _$_findCachedViewById9.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FrameLayout.LayoutParams layoutParams;
        Aweme aweme;
        CCTemplateInfo ccTemplateInfo;
        o.LJIIIZ(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.b7x);
        TextView textView2 = (TextView) view.findViewById(R.id.b82);
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
            textView.setText(ccTemplateInfo.getAuthorName());
            textView2.setText(ccTemplateInfo.getTemplate_desc());
        }
        View findViewById = view.findViewById(R.id.b83);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(KL2.LIZJ(view.getContext(), 4.0f));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        Integer LJI = C79045V0n.LJI(R.attr.dg, context);
        if (LJI != null) {
            gradientDrawable.setColor(LJI.intValue());
        }
        findViewById.setBackground(gradientDrawable);
        findViewById.setVisibility(8);
        if (C224868s6.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.bottomMargin = LIZ;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
