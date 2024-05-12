package X;

import Y.ACListenerS27S0100000_7;
import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gxm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43222Gxm {
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC45930I0w LIZLLL;
    public final InterfaceC88472Yns<AbstractC43208GxY, C76800UCe> LJ;
    public boolean LJFF;
    public C138635cJ LJI;
    public final Handler LJII;
    public boolean LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public long LJIIJ;
    public final C162656Zx LJIIJJI;
    public final C119624mk LJIIL;
    public final ImageView LJIILIIL;
    public final C8HD LJIILJJIL;
    public final C72434Sbm LJIILL;
    public final FrameLayout LJIILLIIL;
    public final C82722WdK LJIIZILJ;
    public final TuxTextView LJIJ;
    public final TuxTextView LJIJI;
    public final FrameLayout LJIJJ;

    public final C138635cJ LIZ() {
        C138635cJ c138635cJ = this.LJI;
        if (c138635cJ != null) {
            return c138635cJ;
        }
        o.LJIJI("mPresenter");
        throw null;
    }

    public final void LIZLLL() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        ValueAnimator valueAnimator = this.LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.end();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            ofFloat.setDuration(8000L);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 70));
            this.LJIIIZ = ofFloat;
        }
        ValueAnimator valueAnimator2 = this.LJIIIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        C82722WdK c82722WdK = this.LJIIZILJ;
        c82722WdK.getClass();
        FTB.LIZIZ(new C43223Gxn(c82722WdK));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r4 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L85
            X.5cJ r0 = r7.LIZ()
            r0.LIZLLL()
            r7.LIZLLL()
            android.os.Handler r2 = r7.LJII
            Y.ARunnableS43S0100000_7 r1 = new Y.ARunnableS43S0100000_7
            r0 = 155(0x9b, float:2.17E-43)
            r1.<init>(r7, r0)
            r2.post(r1)
            X.7qh r5 = new X.7qh
            r5.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r5.LIZ
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "personal_homepage"
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZJ
            java.lang.String r2 = r0.getCreationId()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r5.LIZ
            java.lang.String r0 = "group_id"
            r1.put(r0, r2)
            X.I0w r0 = r7.LIZLLL
            java.lang.String r2 = r0.getUid()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r5.LIZ
            java.lang.String r0 = "author_id"
            r1.put(r0, r2)
            X.Yp3 r4 = X.C88545Yp3.LIZIZ
            java.lang.String r3 = ""
            if (r4 == 0) goto L4d
            java.lang.String r2 = r4.LJ()
            if (r2 != 0) goto L50
        L4d:
            r2 = r3
            if (r4 == 0) goto L58
        L50:
            boolean r0 = r4.isConnected()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L58:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r2, r1)
            if (r4 == 0) goto L69
            java.lang.String r1 = r4.LIZIZ()
            if (r1 != 0) goto L6c
        L69:
            r1 = r3
            if (r4 == 0) goto L72
        L6c:
            java.lang.String r0 = r4.LJIILJJIL()
            if (r0 != 0) goto L83
        L72:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r1, r3)
            org.json.JSONObject r1 = r5.LJ()
            java.lang.String r0 = "video_play"
            X.FMX.LJIILJJIL(r0, r1)
        L80:
            r7.LJFF = r8
            return
        L83:
            r3 = r0
            goto L72
        L85:
            boolean r0 = r7.LJIIIIZZ
            if (r0 == 0) goto Lb1
            r3 = 0
            r7.LJIIIIZZ = r3
            android.animation.ValueAnimator r0 = r7.LJIIIZ
            if (r0 == 0) goto L93
            r0.end()
        L93:
            X.WdK r2 = r7.LJIIZILJ
            android.os.Handler r0 = r2.LJLLI
            r0.removeCallbacksAndMessages(r6)
            android.os.Handler r1 = r2.LJLLI
            Y.ARunnableS50S0100000_14 r0 = r2.LJLLILLLL
            r1.removeCallbacks(r0)
            int r1 = r2.getChildCount()
        La5:
            if (r3 >= r1) goto Lb1
            android.view.View r0 = r2.getChildAt(r3)
            r2.LIZ(r0)
            int r3 = r3 + 1
            goto La5
        Lb1:
            X.5cJ r0 = r7.LIZ()
            r0.LIZJ()
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43222Gxm.LIZJ(boolean):void");
    }

    public final void LIZIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        C135315St c135315St = new C135315St(videoPublishEditModel.getVideoEditorType());
        if (nLEModel != null) {
            c135315St.LJIIZILJ = nLEModel;
        }
        c135315St.LJIJ = videoPublishEditModel.nleData;
        this.LJI = c135315St;
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C162016Xl.LIZ(context, this.LIZIZ, this.LJIIJJI, LIZ(), videoPublishEditModel, "");
        C162656Zx c162656Zx = this.LJIIJJI;
        int intValue = ((Number) C162016Xl.LIZIZ(this.LIZJ).getFirst()).intValue();
        int intValue2 = ((Number) C162016Xl.LIZIZ(this.LIZJ).getSecond()).intValue();
        if (c162656Zx == null) {
            return;
        }
        Context context2 = c162656Zx.getContext();
        int LIZIZ = C81184Vtc.LIZIZ(context2);
        int LJ = C81184Vtc.LJ(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int LIZJ = C81184Vtc.LIZJ(context2);
        C157236Fb c157236Fb = C157236Fb.LIZ;
        if (LIZJ != c157236Fb.LIZLLL()) {
            c157236Fb.LIZJ(LIZJ);
        }
        if (LIZIZ * 9 > LJ * 16) {
            LIZIZ = c157236Fb.LJFF();
        }
        if (C141525gy.LIZ(intValue, intValue2)) {
            int i = (intValue * LIZIZ) / intValue2;
            layoutParams.width = i;
            layoutParams.height = LIZIZ;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = (LJ - i) / 2;
        } else {
            layoutParams.width = LJ;
            int i2 = (intValue2 * LJ) / intValue;
            layoutParams.height = i2;
            layoutParams.topMargin = AnonymousClass030.LIZJ(LIZIZ, i2, 2, 0);
            layoutParams.leftMargin = 0;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        c162656Zx.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43222Gxm(View view, LifecycleOwner lifecyclerOwner, VideoPublishEditModel item, InterfaceC45930I0w interfaceC45930I0w, InterfaceC88472Yns<? super AbstractC43208GxY, C76800UCe> eventHandler) {
        o.LJIIIZ(lifecyclerOwner, "lifecyclerOwner");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(eventHandler, "eventHandler");
        this.LIZ = view;
        this.LIZIZ = lifecyclerOwner;
        this.LIZJ = item;
        this.LIZLLL = interfaceC45930I0w;
        this.LJ = eventHandler;
        this.LJFF = true;
        this.LJII = new Handler(C16880lQ.LLJJJJ());
        View findViewById = view.findViewById(R.id.i1m);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.previewSurface)");
        this.LJIIJJI = (C162656Zx) findViewById;
        View findViewById2 = view.findViewById(R.id.d7g);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.feed_item_img_avatar)");
        this.LJIIL = (C119624mk) findViewById2;
        View findViewById3 = view.findViewById(R.id.d7h);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.feed_item_img_more)");
        this.LJIILIIL = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mbi);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_music)");
        this.LJIILJJIL = (C8HD) findViewById4;
        View findViewById5 = view.findViewById(R.id.d7j);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…d_item_music_cover_block)");
        this.LJIILL = (C72434Sbm) findViewById5;
        View findViewById6 = view.findViewById(R.id.grk);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.music_cover_container)");
        this.LJIILLIIL = (FrameLayout) findViewById6;
        View findViewById7 = view.findViewById(R.id.h3s);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.notes_layout)");
        this.LJIIZILJ = (C82722WdK) findViewById7;
        View findViewById8 = view.findViewById(R.id.mq0);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.tv_username)");
        this.LJIJ = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.m4n);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.tv_desc)");
        this.LJIJI = (TuxTextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.d7c);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.feed_item_bottom_block)");
        this.LJIJJ = (FrameLayout) findViewById10;
        if (TextUtils.isEmpty(item.nleData)) {
            NLEEditor nLEEditor = C135215Sj.LIZIZ(item, false).LJI().LJIIJ;
            nLEEditor.LIZJ();
            item.nleData = nLEEditor.LJIIIIZZ();
            LIZIZ(nLEEditor.LJ(), item);
        } else {
            LIZIZ(null, item);
        }
        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 203), view);
    }
}
