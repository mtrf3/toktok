package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MUn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56893MUn extends C56906MVa {
    public final View LJLIL;
    public final C119624mk LJLILLLLZI;
    public final TextView LJLJI;
    public final SY4 LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;

    @Override // X.C56906MVa, X.MVV
    public final int getRootId() {
        return R.id.h5p;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    public C56893MUn(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.notification_head)");
        C119624mk c119624mk = (C119624mk) findViewById2;
        this.LJLILLLLZI = c119624mk;
        View findViewById3 = view.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.h4i);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.notification_button)");
        SY4 sy4 = (SY4) findViewById4;
        this.LJLJJI = sy4;
        this.LJLJJL = "";
        this.LJLJJLL = "";
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            MVR.LIZ(c119624mk, MVP.AVATAR, 0.0f);
        } else {
            C56812MRk.LIZ(findViewById);
            C7FA.LIZIZ(c119624mk);
        }
        C7FA.LIZIZ(sy4);
        C16880lQ.LJJIZ(sy4, this);
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJJJJIZL(c119624mk, this);
        sy4.getLayoutParams().width = C56812MRk.LIZIZ(this.mContext);
        new TutorialVideoViewModel();
        o.LJIIIIZZ(view.getContext(), "itemView.context");
    }

    public final void M(String str) {
        if (TextUtils.isEmpty(this.LJLJJL)) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLJJL);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLILLLLZI);
        applyContentColor(c96533qb, this.LJLJI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L5;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            X.EF7.LIZIZ()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> Lb
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> Lb
            if (r0 != 0) goto L29
        Lb:
            X.MGN r0 = X.MGN.LJLILLLLZI
            boolean r0 = r0.isStandardUIEnable()
            if (r0 != 0) goto L29
            X.AKb r2 = new X.AKb
            android.view.View r1 = r5.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r0 = 2131833361(0x7f113211, float:1.9299802E38)
            r2.LJIIIIZZ(r0)
            r2.LJIIJ()
            return
        L29:
            java.lang.String r0 = r5.LJLJJLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L97
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r4 = r0.getCurUserId()
            java.lang.String r0 = "top_message_keva_repo"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "current_show_time_"
            java.lang.String r2 = defpackage.i0.LJFF(r0, r4)
            long r0 = java.lang.System.currentTimeMillis()
            r3.storeLong(r2, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "clicked_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 1
            r3.storeInt(r1, r0)
            X.O0e r2 = X.C61200O0e.LIZLLL()
            java.lang.String r1 = r5.LJLJJLL
            X.1g6 r0 = new X.1g6
            r0.<init>(r1)
            java.lang.String r0 = r0.LIZJ()
            r2.LJII(r0)
            java.lang.String r0 = "enter_teach_video"
            r5.M(r0)
            java.lang.Class<X.MUq> r0 = X.InterfaceC56896MUq.class
            java.lang.Object r1 = X.C54366LVi.LIZ(r0)
            X.MUq r1 = (X.InterfaceC56896MUq) r1
            java.lang.String r0 = ""
            if (r1 == 0) goto L97
            r1.LJII(r0)
            r1.LIZJ(r0)
            r1.LJFF(r0)
            r1.LJIIJ(r0)
            r1.LJIIIIZZ(r0)
            r1.LJI(r0)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56893MUn.onClick(android.view.View):void");
    }
}
