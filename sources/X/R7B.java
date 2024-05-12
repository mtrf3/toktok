package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R7B<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZJ;
    public final /* synthetic */ Fragment LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ EnumC69116RAq LJII;
    public final /* synthetic */ EnumC69113RAn LJIIIIZZ;

    public R7B(String str, int i, InterfaceC69056R8i interfaceC69056R8i, Fragment fragment, String str2, String str3, int i2, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = interfaceC69056R8i;
        this.LIZLLL = fragment;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = i2;
        this.LJII = enumC69116RAq;
        this.LJIIIIZZ = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        int i;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("send_method", this.LIZ);
        c35936E8m.LIZ(this.LIZIZ, "send_reason");
        c35936E8m.LIZLLL("enter_method", this.LIZJ.q9().LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("enter_from", this.LIZJ.q9().LJJLIIIJJI());
        FMX.LJIIL("send_whatsapp_code", c35936E8m.LIZ);
        Context context = this.LIZLLL.getContext();
        if (context != null) {
            String mobile = this.LJ;
            int i2 = this.LIZIZ;
            String ticket = this.LJFF;
            int i3 = this.LJI;
            EnumC69116RAq enumC69116RAq = this.LJII;
            EnumC69113RAn enumC69113RAn = this.LJIIIIZZ;
            if (C78555UsJ.LJIJI(C58725N2z.LIZ) == 0) {
                i = 1;
            } else {
                i = 0;
            }
            R86 r86 = new R86(c73516StE, enumC69116RAq, enumC69113RAn);
            o.LJIIIZ(mobile, "mobile");
            o.LJIIIZ(ticket, "ticket");
            R7E r7e = new R7E(i2, i3, i, mobile, ticket);
            QQN qqn = new QQN();
            HashMap hashMap = new HashMap();
            String LIZIZ = C38354F3m.LIZIZ(mobile);
            o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.mMobile)");
            hashMap.put("mobile", LIZIZ);
            if (!TextUtils.isEmpty("")) {
                String LIZIZ2 = C38354F3m.LIZIZ("");
                o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.mOldMobile)");
                hashMap.put("old_mobile", LIZIZ2);
            }
            hashMap.put("captcha", "");
            String LIZIZ3 = C38354F3m.LIZIZ(String.valueOf(i2));
            o.LJIIIIZZ(LIZIZ3, "encryptWithXor(queryObj.mType.toString())");
            hashMap.put("type", LIZIZ3);
            String LIZIZ4 = C38354F3m.LIZIZ(String.valueOf(0));
            o.LJIIIIZZ(LIZIZ4, "encryptWithXor(queryObj.mUnbindExist.toString())");
            hashMap.put("unbind_exist", LIZIZ4);
            hashMap.put("mix_mode", "1");
            int i4 = r7e.LJIIIZ;
            if (i4 == 1) {
                hashMap.put("check_register", "1");
            } else if (i4 == 0) {
                hashMap.put("check_register", CardStruct.IStatusCode.DEFAULT);
            }
            if (!TextUtils.isEmpty(ticket)) {
                hashMap.put("ticket", ticket);
            }
            hashMap.put("auto_read", String.valueOf(i));
            if (!TextUtils.isEmpty(r7e.LJI)) {
                String str = r7e.LJI;
                o.LJIIIIZZ(str, "queryObj.mSharkTicket");
                hashMap.put("shark_ticket", str);
            }
            if (!TextUtils.isEmpty(r7e.LJII)) {
                String str2 = r7e.LJII;
                o.LJIIIIZZ(str2, "queryObj.mUnusableMobileTicket");
                hashMap.put("unusable_mobile_ticket", str2);
            }
            qqn.LIZLLL(hashMap);
            qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/send_whatsapp_code/");
            new R79(context, qqn.LJFF(), r7e, r86).LJIIIZ();
        }
    }
}
