package Y;

import X.C68972R5c;
import X.C68985R5p;
import X.C69040R7s;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.QTX;
import X.QXB;
import X.R40;
import X.R6R;
import X.R7V;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.account.share.data.model.AccountShareInfo;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.music.model.TikTokMusicCollectInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS23S1300000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS23S1300000_11 afS23S1300000_11, Object obj) {
        R6R r6r = (R6R) obj;
        C68972R5c.LJIIIZ(false, "sms_verification", ((InterfaceC69056R8i) afS23S1300000_11.l1).q9(), r6r.LJIIIZ, null);
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS23S1300000_11.l2, "phone", ((InterfaceC69056R8i) afS23S1300000_11.l1).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS23S1300000_11.l1).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS23S1300000_11.l1).q9().LLZZ(), ((InterfaceC69056R8i) afS23S1300000_11.l1).q9(), afS23S1300000_11.s0);
        Fragment fragment = (Fragment) afS23S1300000_11.l3;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS23S1300000_11.l1;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SET_OR_RESET_PASSWORD;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = r6r.LJIIIZ;
        o.LJIIIIZZ(qtx, "it.userInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
    }

    public static final void accept$1(AfS23S1300000_11 afS23S1300000_11, Object obj) {
        R40 r40 = (R40) obj;
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS23S1300000_11.l1, "email", ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LLZZ(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9(), afS23S1300000_11.s0);
        C68972R5c.LJIIIZ(true, "email", ((InterfaceC69056R8i) afS23S1300000_11.l2).q9(), ((R7V) r40.LJIIIZ).LJIIIZ, null);
        Fragment fragment = (Fragment) afS23S1300000_11.l3;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS23S1300000_11.l2;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = ((R7V) r40.LJIIIZ).LJIIIZ;
        o.LJIIIIZZ(qtx, "it.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
        if (C69040R7s.LIZIZ()) {
            C69040R7s.LIZ = null;
        }
    }

    public static final void accept$2(AfS23S1300000_11 afS23S1300000_11, Object obj) {
        R6R r6r = (R6R) obj;
        SetPasswordMobHelper.LIZIZ((SetPasswordMobHelper) afS23S1300000_11.l1, "email", ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9().LLZZ(), ((InterfaceC69056R8i) afS23S1300000_11.l2).q9(), afS23S1300000_11.s0);
        C68972R5c.LJIIIZ(false, "email", ((InterfaceC69056R8i) afS23S1300000_11.l2).q9(), r6r.LJIIIZ, null);
        Fragment fragment = (Fragment) afS23S1300000_11.l3;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS23S1300000_11.l2;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SET_OR_RESET_PASSWORD;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = r6r.LJIIIZ;
        o.LJIIIIZZ(qtx, "it.userInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq, LJLLLL, qtx);
    }

    public static final void accept$3(AfS23S1300000_11 afS23S1300000_11, Object obj) {
        String LIZIZ;
        TypedInput typedInput = (TypedInput) obj;
        if (typedInput != null && typedInput.in() != null) {
            Bitmap bitmap = BitmapFactory.decodeStream(typedInput.in());
            QXB qxb = (QXB) afS23S1300000_11.l1;
            o.LJIIIIZZ(bitmap, "bitmap");
            qxb.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (Build.VERSION.SDK_INT == 28) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("data:image/png;base64,");
                LIZ.append(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, byteArrayOutputStream);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("data:image/webp;base64,");
                LIZ2.append(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            ((HashMap) QXB.LIZIZ).put(afS23S1300000_11.s0, LIZIZ);
            ((HashMap) afS23S1300000_11.l2).put("avatar_base64", LIZIZ);
            bitmap.recycle();
        }
        QXB qxb2 = (QXB) afS23S1300000_11.l1;
        AccountShareInfo accountShareInfo = (AccountShareInfo) afS23S1300000_11.l3;
        HashMap hashMap = (HashMap) afS23S1300000_11.l2;
        qxb2.getClass();
        QXB.LIZLLL(accountShareInfo, hashMap);
    }

    public static final void accept$4(AfS23S1300000_11 afS23S1300000_11, Object obj) {
        AccountShareInfo accountShareInfo = (AccountShareInfo) obj;
        o.LJIIIZ(accountShareInfo, "accountShareInfo");
        String str = accountShareInfo.secUserId;
        if (str != null && o.LJ(str, AccountService.LJIJ().LJFF().getCurSecUserId())) {
            ((MusicFavoriteButtonAssem) afS23S1300000_11.l1).O3((Context) afS23S1300000_11.l2, (TikTokMusicCollectInfo) afS23S1300000_11.l3, afS23S1300000_11.s0);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS23S1300000_11(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r2, com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper r3, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l2 = r4
            r0.s0 = r5
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l1 = r4
            r0.l2 = r3
            r0.s0 = r5
            r0.l3 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS23S1300000_11.<init>(com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper, com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, java.lang.String, int):void");
    }

    public AfS23S1300000_11(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj3;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
    }
}
