package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.lynx.hybrid.webkit.GlobalProps;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.relation.auth.api.IAuthApi;
import com.zhiliaoapp.musically.R;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class OAC implements InterfaceC36621EYv, C0K7, InterfaceC19890qH, InterfaceC66992k3, OAD, InterfaceC40148FpI, InterfaceC46111I7v {
    public static final OAC LJLIL = new OAC();
    public static final OAC LJLILLLLZI = new OAC();
    public static final OAC LJLJI = new OAC();
    public static final OAC LJLJJI = new OAC();

    @Override // X.InterfaceC36621EYv
    public void LIZJ(InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
    }

    @Override // X.InterfaceC36621EYv
    public void LJII(InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        C3Z.LIZ.getClass();
        C3Z.LIZJ();
    }

    @Override // X.InterfaceC19890qH
    public void onShow() {
        InterfaceC30442Bx8.u.LIZ(Boolean.TRUE);
    }

    public static final boolean LJIIIZ(AbstractC41508GQu abstractC41508GQu) {
        o.LJIIIZ(abstractC41508GQu, "<this>");
        if (!(abstractC41508GQu instanceof C41503GQp) || !ujb.o.LJJJLIIL(abstractC41508GQu.LJIILL(), " ", false)) {
            return false;
        }
        return true;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC66992k3
    public void subscribe(InterfaceC65052gv interfaceC65052gv) {
        ((C73578SuE) interfaceC65052gv).onSuccess(C61878OQg.INSTANCE);
    }

    @Override // X.OAD
    public Object LIZIZ(int i, InterfaceC67352kd interfaceC67352kd) {
        boolean z;
        List list;
        OAE oae = new OAE(i);
        AccountManager accountManager = AccountManager.get(EF7.LIZIZ());
        o.LJIIIIZZ(accountManager, "accountManager");
        Account[] accountArr = new Account[0];
        try {
            if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
                Account[] LIZ = OAE.LIZ(accountManager);
                o.LJIIIIZZ(LIZ, "accountManager.accounts");
                accountArr = LIZ;
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Exception happens when reading device email accounts \n");
            LIZ2.append(e.getStackTrace());
            C221018lt.LIZ("EmailUploadHandler", X1D.LIZIZ(LIZ2));
        }
        if (accountArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            list = ORY.LJJZZIII(accountArr);
        } else {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Account) it.next()).name;
            o.LJIIIIZZ(str, "it.name");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (C47261Igj.LJIILLIIL((String) next)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str2.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            if (digest != null) {
                int length = digest.length;
                if (length <= digest.length) {
                    int i2 = length * 2;
                    char[] cArr = new char[i2];
                    int i3 = 0;
                    for (byte b : digest) {
                        int i4 = b & 255;
                        int i5 = i3 + 1;
                        char[] cArr2 = C57964Moy.LJLIL;
                        cArr[i3] = cArr2[i4 >> 4];
                        i3 = i5 + 1;
                        cArr[i5] = cArr2[i4 & 15];
                    }
                    arrayList3.add(new String(cArr, 0, i2));
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                throw new NullPointerException("bytes is null");
            }
        }
        List LJJLI = C32I.LJJLI(C47261Igj.LJJIJ(C47261Igj.LJJ(arrayList3)));
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(LJJLI, 10));
        Iterator it4 = ((ArrayList) LJJLI).iterator();
        while (it4.hasNext()) {
            ((Number) it4.next()).intValue();
            arrayList4.add(new Integer(EnumC48212Iw4.EMAIL.ordinal()));
        }
        return XKX.LJI(C78613UtF.LIZJ, new C77240UTc(new IAuthApi.IdentityBody(arrayList3, arrayList4), oae, null), interfaceC67352kd);
    }

    public void LIZLLL(InterfaceC60761Nsz kitView, List list) {
        JSONObject jSONObject;
        o.LJIIJ(kitView, "kitView");
        if ((kitView instanceof WebKitView) && kitView != null) {
            WebKitView webKitView = (WebKitView) kitView;
            C60457No5.LIZ.getClass();
            if (!((ArrayList) list).isEmpty()) {
                Object tag = webKitView.getTag(R.id.e8o);
                if (tag == null) {
                    C39048FUe.LIZIZ.LIZ("GlobalProps not set, just ignore", EnumC39866Fkk.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("removeGlobalProps:type mismatch, current type is ");
                    LIZ.append(tag.getClass());
                    c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.E, "webkit");
                } else {
                    C39048FUe.LIZIZ.LIZ("removeGlobalProps:already set", EnumC39866Fkk.D, "webkit");
                    GlobalProps globalProps = (GlobalProps) tag;
                    String str = globalProps.LIZ;
                    if (str != null) {
                        jSONObject = new JSONObject(str);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        jSONObject.remove((String) it.next());
                    }
                    globalProps.LIZ = jSONObject.toString();
                }
            }
            C60607NqV initParams$hybrid_web_release = webKitView.getInitParams$hybrid_web_release();
            if (initParams$hybrid_web_release != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    initParams$hybrid_web_release.LJI().remove(it2.next());
                }
            }
            webKitView.LJIIIZ("globalPropsUpdated", null);
        }
    }

    public void LJFF(InterfaceC60761Nsz kitView, java.util.Map map) {
        o.LJIIJ(kitView, "kitView");
        if ((kitView instanceof WebKitView) && kitView != null) {
            C60457No5.LIZ.getClass();
            C60456No4.LIZ((WebKitView) kitView, map);
        }
    }

    public void LJI(InterfaceC60761Nsz kitView, java.util.Map map) {
        java.util.Map<String, ? extends Object> map2;
        JSONObject jSONObject;
        o.LJIIJ(kitView, "kitView");
        if ((kitView instanceof WebKitView) && kitView != null) {
            WebKitView webKitView = (WebKitView) kitView;
            C60457No5.LIZ.getClass();
            if (map != null && !map.isEmpty()) {
                Object tag = webKitView.getTag(R.id.e8o);
                if (tag == null) {
                    C60456No4.LIZ(webKitView, map);
                    C39048FUe.LIZIZ.LIZ("GlobalProps not set, just call inject", EnumC39866Fkk.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("updateGlobalProps:type mismatch, current type is ");
                    LIZ.append(tag.getClass());
                    c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.E, "webkit");
                } else {
                    C39048FUe.LIZIZ.LIZ("updateGlobalProps:already set", EnumC39866Fkk.D, "webkit");
                    GlobalProps globalProps = (GlobalProps) tag;
                    java.util.Map<String, ? extends Object> map3 = globalProps.LIZIZ;
                    if (map3 != null) {
                        map2 = C113554cx.LJJLIL(map3);
                        if (map2 != null) {
                            map2.putAll(map);
                            jSONObject = new JSONObject(C113554cx.LJJLIIIJLLLLLLLZ(map2));
                            globalProps.LIZ = String.valueOf(jSONObject);
                            globalProps.LIZIZ = map2;
                        }
                    } else {
                        map2 = null;
                    }
                    jSONObject = null;
                    globalProps.LIZ = String.valueOf(jSONObject);
                    globalProps.LIZIZ = map2;
                }
            }
            C60607NqV initParams$hybrid_web_release = webKitView.getInitParams$hybrid_web_release();
            if (initParams$hybrid_web_release != null) {
                initParams$hybrid_web_release.LIZ(map);
            }
            webKitView.LJIIIZ("globalPropsUpdated", null);
        }
    }
}
