package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Reason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReason;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S4U {
    public final Context LIZ;
    public final QuitReasonData LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final InterfaceC88472Yns<SubmitQuitReason, C76800UCe> LIZLLL;
    public final HashMap<String, Object> LJ;
    public TuxSheet LJFF;
    public final List<S4W> LJI;
    public final List<S4V> LJII;
    public String LJIIIIZZ;
    public SY4 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final int LJIIL;

    public final void LIZ() {
        String str;
        String string;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        C1AU c1au;
        List<Reason> list;
        if (this.LIZIZ == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = Boolean.FALSE;
        HashMap<String, Object> hashMap = this.LJ;
        List<Reason> list2 = this.LIZIZ.reasons;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<Reason> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().reasonKey);
            }
            str = ORZ.LLD(arrayList, ",", null, null, null, 62);
        } else {
            str = null;
        }
        ViewGroup viewGroup = null;
        C27949Ay1.LJIJJLI(bool, hashMap, "quit_pay_reason", null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097120);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), R.layout.a67, null, false);
        this.LJIIIZ = (SY4) LLLLIILL.findViewById(R.id.ap4);
        LIZIZ();
        ((ConstraintLayout) LLLLIILL.findViewById(R.id.bul)).setMaxHeight((int) (C27162AlK.LIZJ - KL2.LIZJ(LLLLIILL.getContext(), 52.0f)));
        SY4 sy4 = this.LJIIIZ;
        if (sy4 != null) {
            QuitReasonData quitReasonData = this.LIZIZ;
            if (quitReasonData == null || (string = quitReasonData.submitText) == null) {
                string = LLLLIILL.getContext().getResources().getString(R.string.f47);
            }
            sy4.setText(string);
        }
        LLLLIILL.findViewById(R.id.ipf).setVerticalScrollBarEnabled(false);
        View findViewById = LLLLIILL.findViewById(R.id.ipf);
        if (findViewById != null) {
            viewGroup = (ViewGroup) findViewById.findViewById(R.id.ipe);
        }
        QuitReasonData quitReasonData2 = this.LIZIZ;
        if (quitReasonData2 != null && (list = quitReasonData2.reasons) != null) {
            for (Reason reason : list) {
                Integer num = reason.reasonType;
                if (num != null && num.intValue() == 0) {
                    Context context = LLLLIILL.getContext();
                    o.LJIIIIZZ(context, "context");
                    S4W s4w = new S4W(context, reason);
                    C16880lQ.LJIIJ(new Au2S19S0200000_12(s4w, this, 50, 42), s4w);
                    ((ArrayList) this.LJI).add(s4w);
                    if (viewGroup != null) {
                        viewGroup.addView(s4w);
                    }
                }
                Integer num2 = reason.reasonType;
                if (num2 != null && num2.intValue() == 1) {
                    Context context2 = LLLLIILL.getContext();
                    o.LJIIIIZZ(context2, "context");
                    S4V s4v = new S4V(context2, reason, new AqS162S0100000_12(this, 1138), new AqS159S0200000_12(reason, this, 81));
                    ((ArrayList) this.LJII).add(s4v);
                    if (viewGroup != null) {
                        viewGroup.addView(s4v);
                    }
                }
            }
        }
        SY4 sy42 = this.LJIIIZ;
        if (sy42 != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 87, 42), sy42);
        }
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String str2 = this.LIZIZ.title;
        if (str2 == null) {
            str2 = C29822Bn8.LIZ(this.LIZ, R.string.f4_, "context.resources.getStr…uit_popup_question_title)");
        }
        c9kf.LIZJ = str2;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 1139));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLL = c235119Kp;
        tuxSheet.LJLILLLLZI = new S4X(elapsedRealtime, this);
        tuxSheet.LJLLI = LLLLIILL;
        asl.LJI(0);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLJ = true;
        tuxSheet2.LJZI = false;
        this.LJFF = tuxSheet2;
        Context context3 = this.LIZ;
        if ((context3 instanceof C1AU) && (c1au = (C1AU) context3) != null) {
            new KeyBoardVisibilityUtil(c1au, 16, new AqS174S0200000_12(this, LLLLIILL, 21));
        }
        Context context4 = this.LIZ;
        if (!(context4 instanceof C29S) || (activityC45651qj = (ActivityC45651qj) context4) == null || (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) == null) {
            return;
        }
        TuxSheet tuxSheet3 = this.LJFF;
        if (tuxSheet3 != null) {
            tuxSheet3.show(supportFragmentManager, "quit_reason_dialog");
        } else {
            o.LJIJI("dialog");
            throw null;
        }
    }

    public final void LIZIZ() {
        List<S4V> list = this.LJII;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<S4V> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!it.next().LJLJJL) {
                    z = false;
                    break;
                }
            }
        }
        this.LJIIJJI = z;
        if (z && this.LJIIJ) {
            SY4 sy4 = this.LJIIIZ;
            if (sy4 != null) {
                sy4.setButtonVariant(0);
                return;
            }
            return;
        }
        SY4 sy42 = this.LJIIIZ;
        if (sy42 != null) {
            sy42.setBackground(C04270Et.LIZIZ(this.LIZ, R.drawable.abh));
        }
        SY4 sy43 = this.LJIIIZ;
        if (sy43 == null) {
            return;
        }
        sy43.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, this.LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S4U(Context context, QuitReasonData quitReasonData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super SubmitQuitReason, C76800UCe> interfaceC88472Yns, HashMap<String, Object> hashMap) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = quitReasonData;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = hashMap;
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        this.LJIIJJI = true;
        this.LJIIL = JF5.LIZ(context);
    }
}
