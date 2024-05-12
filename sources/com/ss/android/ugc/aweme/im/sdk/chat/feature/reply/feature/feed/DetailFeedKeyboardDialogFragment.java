package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import X.C111024Xi;
import X.C4YG;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC92953kp;
import Y.ARunnableS37S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DetailFeedKeyboardDialogFragment extends Hilt_DetailFeedKeyboardDialogFragment {
    public static final /* synthetic */ int LJZL = 0;
    public InterfaceC92953kp LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment, com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final int wl() {
        return R.layout.b1x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x007c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "click_media_dm_reply_msg") == false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView Gl() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment.Gl():com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment
    public final void Dl() {
        C111024Xi reply_input_container = (C111024Xi) _$_findCachedViewById(R.id.iwa);
        o.LJIIIIZZ(reply_input_container, "reply_input_container");
        this.LJLJI = reply_input_container;
        C4YG msg_et = (C4YG) _$_findCachedViewById(R.id.gnm);
        o.LJIIIIZZ(msg_et, "msg_et");
        this.LJLJJL = msg_et;
        this.LJLJJLL = (TuxIconView) _$_findCachedViewById(R.id.jv_);
        View send_btn = _$_findCachedViewById(R.id.jo1);
        o.LJIIIIZZ(send_btn, "send_btn");
        this.LJLJL = send_btn;
        ViewGroup panel_container = (ViewGroup) _$_findCachedViewById(R.id.hho);
        o.LJIIIIZZ(panel_container, "panel_container");
        this.LJLJJI = panel_container;
    }

    public final void Il(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ViewPropertyAnimator animate = _$_findCachedViewById(R.id.iwa).animate();
        animate.alpha(0.0f);
        animate.translationY(300.0f);
        animate.setDuration(130L);
        animate.withEndAction(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment, com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onActivityCreated(r10)
            android.view.View r0 = r9.getView()
            r5 = 0
            if (r0 == 0) goto Lec
            android.content.Context r6 = r0.getContext()
        Le:
            if (r6 != 0) goto L48
        L10:
            android.os.Bundle r1 = r9.getArguments()
            if (r1 == 0) goto L3c
            r0 = 2131371537(0x7f0a2611, float:1.8363112E38)
            android.view.View r2 = r9._$_findCachedViewById(r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r0 = "hint"
            java.lang.CharSequence r0 = r1.getCharSequence(r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.toString()
            r2.setHint(r0)
        L2e:
            java.lang.String r0 = "text"
            java.lang.CharSequence r1 = r1.getCharSequence(r0)
            if (r1 == 0) goto L3c
            int r0 = r1.length()
            if (r0 != 0) goto L3d
        L3c:
            return
        L3d:
            r2.setText(r1)
            int r0 = r2.length()
            r2.setSelection(r0)
            goto L3c
        L48:
            android.view.View r1 = r9.getView()
            if (r1 == 0) goto Le7
            r0 = 2131366097(0x7f0a10d1, float:1.8352078E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 == 0) goto Le8
            r0 = 2131366098(0x7f0a10d2, float:1.835208E38)
            android.view.View r8 = r4.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 2131364134(0x7f0a0926, float:1.8348096E38)
            android.view.View r2 = r4.findViewById(r0)
        L67:
            android.view.View r1 = r9.getView()
            if (r1 == 0) goto L74
            r0 = 2131368848(0x7f0a1b90, float:1.8357658E38)
            android.view.View r5 = r1.findViewById(r0)
        L74:
            X.48i r7 = X.C49R.LIZ
            int r0 = r7.LIZLLL
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r6)
            if (r0 == 0) goto L87
            int r0 = r0.intValue()
            if (r4 == 0) goto L87
            r4.setBackgroundColor(r0)
        L87:
            int r0 = r7.LJIIIZ
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r6)
            if (r0 == 0) goto Le5
            int r3 = r0.intValue()
        L93:
            if (r8 == 0) goto L98
            r8.setColorFilter(r3)
        L98:
            if (r2 != 0) goto Lc8
        L9a:
            if (r5 != 0) goto La5
        L9c:
            if (r4 == 0) goto L10
            X.4XY r0 = new android.view.View.OnClickListener() { // from class: X.4XY
                static {
                    /*
                        X.4XY r0 = new X.4XY
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.4XY) X.4XY.LJLIL X.4XY
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4XY.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4XY.<init>():void");
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4XY.onClick(android.view.View):void");
                }
            }
            X.C16880lQ.LJIIJ(r0, r4)
            goto L10
        La5:
            X.4Vt r2 = new X.4Vt
            r2.<init>()
            int r0 = r7.LIZLLL
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r6)
            r2.LIZ = r0
            r1 = 9
            java.lang.Float r0 = X.C61328O5c.LIZJ(r1)
            r2.LJIIIIZZ = r0
            java.lang.Float r0 = X.C61328O5c.LIZJ(r1)
            r2.LJIIIZ = r0
            android.graphics.drawable.Drawable r0 = r2.LIZ(r6)
            r5.setBackground(r0)
            goto L9c
        Lc8:
            int r0 = X.C1045248i.LIZ(r7)
            android.graphics.drawable.Drawable r0 = X.C04270Et.LIZIZ(r6, r0)
            r2.setBackground(r0)
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            if (r2 != 0) goto Lda
            goto L9a
        Lda:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.<init>(r3, r0)
            r2.setColorFilter(r1)
            goto L9a
        Le5:
            r3 = 0
            goto L93
        Le7:
            r4 = r5
        Le8:
            r8 = r5
            r2 = r5
            goto L67
        Lec:
            r6 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputFragment, android.view.View.OnClickListener
    public final void onClick(View view) {
        Il(new AqS148S0200000_1(this, view, 12));
    }

    public static final /* synthetic */ void Hl(DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment, View view) {
        super.onClick(view);
    }
}
