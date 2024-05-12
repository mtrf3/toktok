package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R7C<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ EnumC69116RAq LIZJ;
    public final /* synthetic */ EnumC69113RAn LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI = "";
    public final /* synthetic */ int LJII;

    public R7C(InterfaceC69056R8i interfaceC69056R8i, Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, String str, int i, int i2) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = fragment;
        this.LIZJ = enumC69116RAq;
        this.LIZLLL = enumC69113RAn;
        this.LJ = str;
        this.LJFF = i;
        this.LJII = i2;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        int i;
        if (C78555UsJ.LJIJI(C58725N2z.LIZ) == 0) {
            i = 1;
        } else {
            i = 0;
        }
        R80 r80 = new R80(c73516StE, this.LIZJ, this.LIZLLL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C69093R9t.LJIIJ()) {
            linkedHashMap.put("is6Digits", "1");
        }
        this.LIZ.bi(r80);
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            String str = this.LJ;
            int i2 = this.LJFF;
            String ticket = this.LJI;
            int i3 = this.LJII;
            o.LJIIIZ(ticket, "ticket");
            R7E r7e = new R7E(i2, i3, i, "", ticket);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            java.util.Map map = r7e.LJIIIIZZ;
            if ((map instanceof java.util.Map) && map != null) {
                linkedHashMap2.putAll(map);
            }
            QQN qqn = new QQN();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty("")) {
                hashMap.put("mobile", C38354F3m.LIZIZ(""));
            }
            if (!TextUtils.isEmpty("")) {
                hashMap.put("old_mobile", C38354F3m.LIZIZ(""));
            }
            if (!TextUtils.isEmpty("")) {
                hashMap.put("captcha", "");
            }
            hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(i2)));
            hashMap.put("unbind_exist", C38354F3m.LIZIZ(String.valueOf(0)));
            hashMap.put("mix_mode", "1");
            int i4 = r7e.LJIIIZ;
            if (i4 == 1) {
                hashMap.put("check_register", "1");
            } else if (i4 == 0) {
                hashMap.put("check_register", CardStruct.IStatusCode.DEFAULT);
            }
            if (C35338Dtu.LIZ()) {
                hashMap.put("is6Digits", "1");
            } else {
                hashMap.put("is6Digits", CardStruct.IStatusCode.DEFAULT);
            }
            if (!TextUtils.isEmpty(ticket)) {
                hashMap.put("ticket", ticket);
            }
            hashMap.put("auto_read", String.valueOf(i));
            if (!TextUtils.isEmpty(r7e.LJI)) {
                hashMap.put("shark_ticket", r7e.LJI);
            }
            if (!TextUtils.isEmpty(null)) {
                hashMap.put("auth_token", null);
            }
            if (!TextUtils.isEmpty(r7e.LJII)) {
                hashMap.put("unusable_mobile_ticket", r7e.LJII);
            }
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            qqn.LJ(hashMap, linkedHashMap2);
            qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/send_code/v1/");
            new R77(context, qqn.LJFF(), r7e, r80).LJIIIZ();
        }
    }
}
