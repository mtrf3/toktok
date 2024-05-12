package com.ss.android.ugc.aweme.captionsheet;

import X.ACF;
import X.ACW;
import X.ACZ;
import X.C109824Ss;
import X.C221108m2;
import X.C234509Ig;
import X.C235119Kp;
import X.C62822Ol8;
import X.C79045V0n;
import X.C86670Xzu;
import X.EnumC252729vw;
import X.EnumC25835ABz;
import X.FMX;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TranscriptPanelFragment extends BaseCaptionSheetFragment {
    public View LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final Map<Integer, View> LJLJLLL;

    public TranscriptPanelFragment() {
        this(0);
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ACZ Il() {
        String str;
        String str2;
        String str3;
        String str4;
        String num;
        String enterFrom = Jl().getEnterFrom();
        String str5 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        if (Jl().X7()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        String LJIIJJI = C86670Xzu.LJIIJJI(Jl().getAweme());
        String LJIILL = C86670Xzu.LJIILL(Jl().getAweme());
        Aweme aweme = Jl().getAweme();
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        Aweme aweme2 = Jl().getAweme();
        if (aweme2 == null || (str3 = aweme2.getAuthorUid()) == null) {
            str3 = "";
        }
        Integer LJIJJ = C86670Xzu.LJIJJ(Jl().getAweme());
        if (LJIJJ != null && (num = LJIJJ.toString()) != null) {
            str5 = num;
        }
        if (ACW.LIZ() == EnumC25835ABz.TRANSCRIPT) {
            str4 = "caption";
        } else {
            str4 = "caption_setting";
        }
        return new ACZ(enterFrom, str, LJIIJJI, LJIILL, str2, str3, str5, str4);
    }

    public final ACF Jl() {
        return (ACF) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final String getTitle() {
        return (String) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    public final C235119Kp createNavActions() {
        FragmentManager childFragmentManager;
        Integer LJI;
        C235119Kp createNavActions = super.createNavActions();
        createNavActions.LIZLLL = true;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            createNavActions.LIZJ(LJI.intValue());
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null && childFragmentManager.LJJJJIZL() == 0) {
            C234509Ig c234509Ig = new C234509Ig();
            c234509Ig.LIZ(EnumC252729vw.SECONDARY);
            String leftNavigationTitle = (String) this.LJLJLJ.getValue();
            o.LJIIIIZZ(leftNavigationTitle, "leftNavigationTitle");
            c234509Ig.LIZJ = leftNavigationTitle;
            c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 62));
            createNavActions.LIZLLL(c234509Ig);
        }
        return createNavActions;
    }

    public TranscriptPanelFragment(int i) {
        EnumC25835ABz type = EnumC25835ABz.TRANSCRIPT;
        o.LJIIIZ(type, "type");
        this.LJLJLLL = new LinkedHashMap();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1057));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1055));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1056));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r8 != null) goto L40;
     */
    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Hl(android.view.LayoutInflater r20, android.view.ViewGroup r21) {
        /*
            r19 = this;
            java.lang.String r0 = "inflater"
            r4 = r20
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r2 = r19
            android.view.View r3 = r2.LJLJJL
            r14 = 0
            if (r3 == 0) goto L1e
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L1d
            X.C16880lQ.LJLLL(r3, r1)
        L1d:
            return r3
        L1e:
            r0 = 2131559131(0x7f0d02db, float:1.8743597E38)
            r5 = 0
            r1 = r21
            android.view.View r4 = X.C16880lQ.LLLLIILL(r4, r0, r1, r5)
            r2.LJLJJL = r4
            r0 = 2131367039(0x7f0a147f, float:1.8353989E38)
            android.view.View r3 = r4.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L3f
            android.content.Context r11 = r2.getContext()
            if (r11 != 0) goto L40
        L3b:
            r0 = -1
            r3.addView(r14, r0, r0)
        L3f:
            return r4
        L40:
            X.NzF r10 = X.C61149NzF.LIZIZ
            androidx.lifecycle.Lifecycle r12 = r2.getLifecycle()
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.o.LJIIIIZZ(r12, r0)
            X.ACF r0 = r2.Jl()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto Le1
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r8 = X.C86670Xzu.LJIIIIZZ(r0)
        L59:
            X.NzG r13 = new X.NzG
            X.ACF r0 = r2.Jl()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L69
            java.lang.String r14 = r0.getAid()
        L69:
            java.lang.String r7 = ""
            if (r14 != 0) goto L6e
            r14 = r7
        L6e:
            if (r8 == 0) goto L76
            java.lang.String r15 = r8.getLanguageCode()
            if (r15 != 0) goto L77
        L76:
            r15 = r7
        L77:
            X.Y01 r0 = X.Y01.LIZIZ
            java.lang.String r16 = r0.LJJIIZI()
            X.ACF r0 = r2.Jl()
            androidx.lifecycle.LiveData r0 = r0.u()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L93
            int r17 = r0.intValue()
            if (r17 >= 0) goto L95
        L93:
            r17 = 0
        L95:
            X.ACb r6 = new X.ACb
            if (r8 == 0) goto L9f
            java.lang.String r1 = r8.getVersionType()
            if (r1 != 0) goto La2
        L9f:
            r1 = r7
            if (r8 == 0) goto Lb0
        La2:
            long r8 = r8.getClaSubtitleId()
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto Ldf
        Lb0:
            r6.<init>(r1, r7)
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            X.ACL r14 = new X.ACL
            r14.<init>(r2)
            X.ACZ r15 = r2.Il()
            X.ACa r1 = X.C25836ACa.LJLJJI
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto Lcd
            boolean r5 = X.AnonymousClass636.LJIILJJIL(r0)
        Lcd:
            float r2 = r1.LJLILLLLZI
            X.ACa r1 = new X.ACa
            r0 = 1
            r1.<init>(r5, r2, r0)
            X.AD1 r17 = X.AD1.LJLJJI
            r16 = r1
            android.view.View r14 = r10.LIZJ(r11, r12, r13, r14, r15, r16, r17)
            goto L3b
        Ldf:
            r7 = r0
            goto Lb0
        Le1:
            r8 = r14
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.captionsheet.TranscriptPanelFragment.Hl(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ACZ Il = Il();
        HashMap hashMap = new HashMap();
        hashMap.put("lingo_time_ms", String.valueOf(System.currentTimeMillis()));
        hashMap.put("enter_from", Il.LJLIL);
        hashMap.put("use_transl", Il.LJLILLLLZI);
        hashMap.put("subtitle_type", Il.LJLJI);
        hashMap.put("subtitle_source_lang", Il.LJLJJI);
        hashMap.put("group_id", Il.LJLJJL);
        hashMap.put("author_id", Il.LJLJJLL);
        hashMap.put("item_duration", Il.LJLJL);
        hashMap.put("enter_method", Il.LJLJLJ);
        FMX.LJIIL("subtitle_panel_show_2", hashMap);
    }
}
