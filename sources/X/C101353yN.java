package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS39S1000000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3yN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101353yN extends FrameLayout implements C3WZ {
    public final /* synthetic */ C85373Wr LJLIL;
    public boolean LJLILLLLZI;
    public IMUser LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C101353yN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C3WZ
    public final void LJIILIIL() {
        this.LJLIL.LJIILIIL();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    public final void LIZLLL(IMUser iMUser) {
        String str;
        int i;
        String string;
        String str2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (iMUser == null) {
            return;
        }
        this.LJLJI = iMUser;
        String uid = iMUser.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String uid2 = iMUser.getUid();
        o.LJIIIIZZ(uid2, "user.uid");
        LJ(LIZIZ(uid2, false), uid, true);
        if (iMUser.getFollowerStatus() == 1) {
            str = "follow_back";
        } else {
            str = "follow";
        }
        String uid3 = iMUser.getUid();
        o.LJIIIIZZ(uid3, "uid");
        String recType = iMUser.getRecType();
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "onEventV3", "enter_from", "chat", "to_user_id", uid3);
        LIZ2.put("follow_type", str);
        if (recType == null) {
            recType = "";
        }
        LIZ2.put("rec_type", recType);
        LIZ.LIZIZ("show_follow_pop_up", LIZ2);
        if (this.LJLILLLLZI) {
            setVisibility(0);
            return;
        }
        this.LJLILLLLZI = true;
        View.inflate(getContext(), R.layout.b95, this);
        setVisibility(0);
        LJIILIIL();
        W5F LJII = W5U.LJII(C78939UyV.LJ(iMUser.getAvatarThumb()));
        LJII.LJJIIJ = (SmartImageView) LIZ(R.id.abh);
        S3I s3i = new S3I();
        s3i.LIZ = true;
        s3i.LIZIZ = C32151Nz.LJIIZILJ(Double.valueOf(0.5d));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dz, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        s3i.LIZJ = i;
        LJII.LJIJJLI = new S3L(s3i);
        C16880lQ.LLJJJ(LJII);
        LIZ(R.id.abh).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(iMUser, 279)));
        if (iMUser.getFollowerStatus() == 1) {
            string = getContext().getResources().getString(R.string.eoc, iMUser.getDisplayName());
            o.LJIIIIZZ(string, "context.resources.getStr…header, user.displayName)");
            ((TextView) LIZ(R.id.an3)).setText(getContext().getResources().getString(R.string.eob));
        } else {
            string = getContext().getResources().getString(R.string.eoa, iMUser.getDisplayName());
            o.LJIIIIZZ(string, "context.resources.getStr…header, user.displayName)");
            ((TextView) LIZ(R.id.an3)).setText(getContext().getResources().getString(R.string.eo8));
        }
        if (C99W.LIZ) {
            LIZ(R.id.hy1).setVisibility(8);
            View LIZ3 = LIZ(R.id.hxu);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LIZ3.setBackground(c110614Vt.LIZ(context2));
            LIZ(R.id.hxu).setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            ViewGroup.LayoutParams layoutParams = LIZ(R.id.hxu).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                Context context3 = LIZ(R.id.hxu).getContext();
                o.LJIIIIZZ(context3, "popup_container.context");
                C26338AVi.LJII(marginLayoutParams, context3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(2), 32);
                LIZ(R.id.hxu).setLayoutParams(marginLayoutParams);
            }
            LIZ(R.id.d_v).getClass();
            ((SY4) LIZ(R.id.d_v)).setButtonVariant(5);
        }
        TextView textView = (TextView) LIZ(R.id.title);
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZIZ(string);
        textView.setText(c116724i4.LIZ);
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.title), new ACListenerS21S0100000_1(iMUser, 280));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.bf9), new ACListenerS36S0200000_1(iMUser, this, 97));
        C16880lQ.LJJIZ((SY4) LIZ(R.id.d_v), new ACListenerS36S0200000_1(iMUser, this, 98));
        RelationButton relationButton = (RelationButton) LIZ(R.id.iu_);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZ = IMUser.toUser(iMUser);
        c226668v0.LJIIIIZZ = true;
        c226668v0.LIZIZ = false;
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        if (iMUser.getFollowerStatus() == 1) {
            str2 = "follow_back_banner";
        } else {
            str2 = "follow_banner";
        }
        ((RelationButton) LIZ(R.id.iu_)).setTracker(new AqS39S1000000_1(str2, 8));
        ((RelationButton) LIZ(R.id.iu_)).setFollowClickInterceptor(new C101363yO(this, null));
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LJLIL.LLJILLL(c3wr);
    }

    public static int LIZIZ(String str, boolean z) {
        int LIZLLL = C92353jr.LIZ.LIZLLL(str);
        if (LIZLLL != 0 && LIZLLL != 1 && LIZLLL != 2) {
            return 7;
        }
        if (!z) {
            return 1;
        }
        return 3;
    }

    public static void LIZJ(int i, IMUser iMUser) {
        String str;
        if (iMUser != null) {
            if (iMUser.getFollowerStatus() == 1) {
                str = "follow_back";
            } else {
                str = "follow";
            }
            String LJIL = C227768wm.LJIL(IMUser.toUser(iMUser));
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "uid");
            String recType = iMUser.getRecType();
            String valueOf = String.valueOf(i);
            C85323Wm LIZJ = C05040Hs.LIZJ(valueOf, "actionType", "onEventV3");
            C1HQ LIZJ2 = HXX.LIZJ("enter_from", "chat", "to_user_id", uid);
            LIZJ2.put("follow_type", str);
            if (recType == null) {
                recType = "";
            }
            LIZJ2.put("rec_type", recType);
            LIZJ2.put("action_type", valueOf);
            if (LJIL == null) {
                LJIL = "";
            }
            LIZJ2.put("to_user_type", LJIL);
            LIZJ.LIZIZ("close_follow_pop_up", LIZJ2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C101353yN(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r2, r0)
            r1.LJLJJI = r0
            r0 = 0
            r1.<init>(r2, r3, r0)
            X.3Wr r0 = new X.3Wr
            r0.<init>()
            r1.LJLIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101353yN.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void LJ(int i, String str, boolean z) {
        C92353jr c92353jr = C92353jr.LIZ;
        if (z) {
            Keva LJFF = c92353jr.LJFF();
            StringBuilder LIZ = X1D.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("key_maf_follow_popup_show_num");
            LIZ2.append(C92353jr.LIZJ());
            LIZ.append(X1D.LIZIZ(LIZ2));
            LIZ.append(str);
            LJFF.storeInt(X1D.LIZIZ(LIZ), c92353jr.LIZLLL(str) + 1);
        }
        Keva LJFF2 = c92353jr.LJFF();
        StringBuilder LIZ3 = X1D.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("key_maf_follow_popup_timestamp");
        LIZ4.append(C92353jr.LIZJ());
        LIZ3.append(X1D.LIZIZ(LIZ4));
        LIZ3.append(str);
        LJFF2.storeLong(X1D.LIZIZ(LIZ3), (i * 86400000) + System.currentTimeMillis());
    }
}
