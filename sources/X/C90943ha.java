package X;

import Y.ACListenerS36S0200000_1;
import Y.IDObjectS0S0101000;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90943ha {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final TuxSheet LJ;
    public final List<Float> LJFF;
    public final List<C90953hb> LJI;

    public C90943ha(Context context, Aweme aweme, String enterFrom, String from) {
        CharSequence LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(from, "from");
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = enterFrom;
        this.LIZLLL = from;
        C235119Kp c235119Kp = new C235119Kp();
        List<Float> LJJIJIIJI = C47261Igj.LJJIJIIJI(Float.valueOf(2.0f), Float.valueOf(1.5f), Float.valueOf(1.0f), Float.valueOf(0.5f));
        this.LJFF = LJJIJIIJI;
        this.LJI = new ArrayList();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 835));
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = C29822Bn8.LIZ(context, R.string.jsz, "context.resources.getStr…g(R.string.playbackspeed)");
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        ASL asl = new ASL();
        asl.LIZ.LJLLL = c235119Kp;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        Iterator<Float> it = LJJIJIIJI.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            if (floatValue == 1.0f) {
                LIZIZ = linearLayout.getResources().getText(R.string.p1);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(floatValue);
                LIZ.append('x');
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            o.LJIIIIZZ(LIZIZ, "if (option == 1.0f) layo…Normal) else \"${option}x\"");
            C90953hb c90953hb = new C90953hb(this.LIZ);
            if (floatValue == 1.0f) {
                c90953hb.LJLJI.setChecked(true);
            }
            c90953hb.setSpeedValue(floatValue);
            c90953hb.setSpeedText(LIZIZ.toString());
            c90953hb.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS36S0200000_1(this, c90953hb, 32)));
            linearLayout.addView(c90953hb);
            ((ArrayList) this.LJI).add(c90953hb);
        }
        float LIZIZ2 = IFH.LIZIZ(this.LIZIZ);
        Iterator<View> it2 = C78924UyG.LIZLLL(linearLayout).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it2;
            if (iDObjectS0S0101000.hasNext()) {
                C90953hb c90953hb2 = (C90953hb) ((View) iDObjectS0S0101000.next());
                if (c90953hb2.getSpeedValue() == LIZIZ2) {
                    c90953hb2.LJLJI.setChecked(true);
                } else {
                    c90953hb2.LJLJI.setChecked(false);
                }
            } else {
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLI = linearLayout;
                tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.3Of
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
                        if (LJIIZILJ != null) {
                            LJIIZILJ.LJIILLIIL(false);
                        }
                    }
                };
                this.LJ = tuxSheet;
                return;
            }
        }
    }
}
