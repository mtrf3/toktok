package com.ss.android.ugc.aweme.captionsheet;

import X.AC1;
import X.AEB;
import X.AEG;
import X.ActivityC45651qj;
import X.C235119Kp;
import X.C2U8;
import X.C79045V0n;
import X.C7MY;
import X.C9KF;
import X.EnumC25835ABz;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LandscapeCaptionPanelFragment extends CaptionsPanelFragment {
    public final Map<Integer, View> LJLLL;

    public LandscapeCaptionPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final boolean Al() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void Il() {
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void Ll() {
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
        Integer valueOf = Integer.valueOf(R.id.i04);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.i04)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final AEG Kl() {
        return new AEG(new AEB("", true, false, false, false, null, null, null, Integer.valueOf(C7MY.LIZIZ(4)), 0, null, 5116));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZ(getTitle());
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZJ(0);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void Ml() {
        String str;
        super.Ml();
        Aweme aweme = xl().LIZ.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C2U8.LIZ(new AC1(str, false));
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void Nl() {
        String str;
        super.Nl();
        Aweme aweme = xl().LIZ.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C2U8.LIZ(new AC1(str, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeCaptionPanelFragment(int i) {
        super(0);
        EnumC25835ABz type = EnumC25835ABz.LANDSCAPE_CAPTIONS;
        o.LJIIIZ(type, "type");
        this.LJLLL = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment
    public final void Ol(Context context) {
        o.LJIIIZ(context, "context");
        context.setTheme(R.style.h1);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final View Hl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View Hl = super.Hl(inflater, viewGroup);
        Hl.setBackground(null);
        return Hl;
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment, com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.gwu);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = C7MY.LIZIZ(44);
        }
        View findViewById2 = view.findViewById(R.id.i04);
        if (findViewById2 != null) {
            findViewById2.setPadding(findViewById2.getPaddingStart(), C7MY.LIZIZ(6), findViewById2.getPaddingEnd(), findViewById2.getPaddingBottom());
        }
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final ViewGroup wl(ViewGroup viewGroup, ActivityC45651qj activityC45651qj) {
        LinearLayout linearLayout = new LinearLayout(activityC45651qj);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(C7MY.LIZIZ(375), -1));
        Integer LJI = C79045V0n.LJI(R.attr.ed, activityC45651qj);
        if (LJI != null) {
            linearLayout.setBackgroundColor(LJI.intValue());
        }
        return linearLayout;
    }
}
