package X;

import Y.IDxS305S0100000_4;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspJumpOptConfig;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.AkA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27090AkA implements InterfaceC60061Nhh {
    public static final C27090AkA LJLIL;
    public static String LJLILLLLZI;
    public static final ArrayList<String> LJLJI;
    public static List<Region> LJLJJI;
    public static String LJLJJL;
    public static final HashMap<String, InputItemData> LJLJJLL;
    public static final String LJLJL;

    static {
        C27090AkA c27090AkA = new C27090AkA();
        LJLIL = c27090AkA;
        LJLJI = new ArrayList<>();
        LJLJJI = new ArrayList();
        LJLJJLL = new HashMap<>();
        LJLJL = "https://oec-api.tiktokv.com//api/v1/shop/shipping_address/input_item";
        EventCenter.LJ().LIZJ("ec_address_change", c27090AkA);
    }

    public static Boolean LJ() {
        Keva keva = C66822jm.LIZ;
        if (!keva.contains("buyer_has_address")) {
            return null;
        }
        return Boolean.valueOf(C79057V0z.LJIJ(keva, "buyer_has_address", false));
    }

    public static boolean LJFF() {
        Keva keva = C66822jm.LIZ;
        if (!keva.contains("buyer_has_address_timestamp")) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - keva.getLong("buyer_has_address_timestamp", 0L);
        C27093AkD.LIZ.getClass();
        if (currentTimeMillis >= ((OspJumpOptConfig) C27093AkD.LIZJ.getValue()).addressCacheTimeoutHour * 60 * 60 * 1000) {
            LJLJJLL.clear();
            C79057V0z.LJJIJIIJIL(keva, "buyer_address_input_item");
            return false;
        }
        return true;
    }

    public static Object LIZIZ(C27092AkC c27092AkC) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c27092AkC));
        AddressApi.LIZ.getClass();
        ((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).getBuyerHasAddress().LJJL(T16.LIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 2));
        return c84654XKg.LIZ();
    }

    public static String LIZJ(Region region) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLJL);
        String language = C39419FdX.LIZ().getLanguage();
        if (language == null) {
            language = "";
        }
        LIZ.append(language);
        LIZ.append(1);
        if (region != null) {
            str = region.code;
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static InputItemData LIZLLL(Address address) {
        if (address != null || !LJFF()) {
            return null;
        }
        String LIZJ = LIZJ(C78996UzQ.LJIIZILJ());
        InputItemData inputItemData = LJLJJLL.get(LIZJ);
        if (inputItemData == null) {
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(C66822jm.LIZ, "buyer_address_input_item"), C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(InputItemData.class)))));
                if (!(fromJson instanceof HashMap)) {
                    fromJson = null;
                }
                HashMap hashMap = (HashMap) fromJson;
                if (hashMap == null) {
                    return null;
                }
                InputItemData inputItemData2 = (InputItemData) hashMap.get(LIZJ);
                LJLJJLL.put(LIZJ, inputItemData2);
                return inputItemData2;
            } catch (s unused) {
                return null;
            }
        }
        return inputItemData;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(3:14|15|16)(2:11|12))(1:17))(2:33|(2:35|36)(2:37|(1:39)))|18|(4:22|(1:24)(1:32)|25|(2:27|(2:29|(1:31))))|15|16))|42|6|7|(0)(0)|18|(5:20|22|(0)(0)|25|(0))|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        X.C36746EbW.LIZ(6, r0.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:14:0x0027, B:17:0x0049, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:24:0x0069, B:25:0x006d, B:27:0x0087, B:29:0x0098, B:37:0x0040), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:14:0x0027, B:17:0x0049, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:24:0x0069, B:25:0x006d, B:27:0x0087, B:29:0x0098, B:37:0x0040), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C27092AkC
            if (r0 == 0) goto L21
            r6 = r12
            X.AkC r6 = (X.C27092AkC) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L34
            if (r0 == r8) goto L49
            if (r0 != r7) goto L2c
            goto L27
        L21:
            X.AkC r6 = new X.AkC
            r6.<init>(r11, r12)
            goto L12
        L27:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> La4
            goto Lad
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r1)
            boolean r0 = LJFF()
            if (r0 == 0) goto L40
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            r6.LJLJI = r8     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = LIZIZ(r6)     // Catch: java.lang.Throwable -> La4
            if (r1 != r5) goto L4c
            return r5
        L49:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> La4
        L4c:
            X.Pbt r1 = (X.C64797Pbt) r1     // Catch: java.lang.Throwable -> La4
            T r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> La4
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r0.isCodeOK()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto Lad
            T r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> La4
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> La4
            T r10 = r0.data     // Catch: java.lang.Throwable -> La4
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse r10 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse) r10     // Catch: java.lang.Throwable -> La4
            if (r10 == 0) goto Lad
            X.AkA r4 = X.C27090AkA.LJLIL     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r0 = r10.hasAddress     // Catch: java.lang.Throwable -> La4
            r3 = 0
            if (r0 == 0) goto L9f
            boolean r1 = r0.booleanValue()     // Catch: java.lang.Throwable -> La4
        L6d:
            com.bytedance.keva.Keva r9 = X.C66822jm.LIZ     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "buyer_has_address"
            X.C79057V0z.LJJJJJL(r9, r0, r1)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "buyer_has_address_timestamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La4
            r9.storeLong(r2, r0)     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r1 = r10.hasAddress     // Catch: java.lang.Throwable -> La4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> La4
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto Lad
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "enable_preload_input_item"
            r0.getClass()     // Catch: java.lang.Throwable -> La4
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = X.FFL.LJ(r0, r1, r8, r3)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto Lad
            r6.LJLJI = r7     // Catch: java.lang.Throwable -> La4
            java.lang.Object r0 = r4.LJI(r6)     // Catch: java.lang.Throwable -> La4
            goto La1
        L9f:
            r1 = 0
            goto L6d
        La1:
            if (r0 != r5) goto Lad
            return r5
        La4:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            r0 = 6
            X.C36746EbW.LIZ(r0, r1)
        Lad:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27090AkA.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(2:26|27))|12|(1:16)|18|19))|29|6|7|(0)(0)|12|(2:14|16)|18|19) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C27091AkB
            if (r0 == 0) goto L20
            r6 = r8
            X.AkB r6 = (X.C27091AkB) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r3 = r6.LJLIL
            goto L69
        L20:
            X.AkB r6 = new X.AkB
            r6.<init>(r7, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r3 = X.C78996UzQ.LJIIZILJ()     // Catch: java.lang.Throwable -> L98
            r6.LJLIL = r3     // Catch: java.lang.Throwable -> L98
            r6.LJLJJI = r2     // Catch: java.lang.Throwable -> L98
            X.XKg r4 = new X.XKg     // Catch: java.lang.Throwable -> L98
            X.2kd r0 = X.C78555UsJ.LJJII(r6)     // Catch: java.lang.Throwable -> L98
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L98
            X.AkG r0 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.LIZ     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> L98
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L98
            r0.getClass()     // Catch: java.lang.Throwable -> L98
            r0 = 0
            X.Svk r1 = X.C27096AkG.LJFF(r3, r1, r0)     // Catch: java.lang.Throwable -> L98
            X.T0k r0 = X.T16.LIZ()     // Catch: java.lang.Throwable -> L98
            X.Sro r2 = r1.LJJL(r0)     // Catch: java.lang.Throwable -> L98
            Y.IDxS305S0100000_4 r1 = new Y.IDxS305S0100000_4     // Catch: java.lang.Throwable -> L98
            r0 = 3
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L98
            r2.LIZ(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r4.LIZ()     // Catch: java.lang.Throwable -> L98
            if (r1 != r5) goto L6c
            goto L97
        L69:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L98
        L6c:
            X.Pbt r1 = (X.C64797Pbt) r1     // Catch: java.lang.Throwable -> L98
            T r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L98
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.isCodeOK()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L98
            T r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L98
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L98
            T r2 = r0.data     // Catch: java.lang.Throwable -> L98
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData) r2     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L98
            java.lang.String r1 = LIZJ(r3)     // Catch: java.lang.Throwable -> L98
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData> r0 = X.C27090AkA.LJLJJLL     // Catch: java.lang.Throwable -> L98
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L98
            com.bytedance.keva.Keva r2 = X.C66822jm.LIZ     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = X.C27739Aud.LJI(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "buyer_address_input_item"
            X.C79057V0z.LJJJJJ(r2, r0, r1)     // Catch: java.lang.Throwable -> L98
            goto L98
        L97:
            return r5
        L98:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27090AkA.LJI(X.2kd):java.lang.Object");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C175256uH event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i == 2 || i == 1) {
            Keva keva = C66822jm.LIZ;
            C79057V0z.LJJIJIIJIL(keva, "buyer_has_address");
            C79057V0z.LJJIJIIJIL(keva, "buyer_has_address_timestamp");
            LJLJJLL.clear();
            C79057V0z.LJJIJIIJIL(keva, "buyer_address_input_item");
            EventBus.LIZJ().LJIJ(this);
            LJLILLLLZI = null;
            LJLJJI.clear();
        }
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_address_change")) {
            int i = C26755Ael.LIZ(str).type;
            if (i != 0 && i != 2) {
                return;
            }
            Keva keva = C66822jm.LIZ;
            C79057V0z.LJJIJIIJIL(keva, "buyer_has_address");
            C79057V0z.LJJIJIIJIL(keva, "buyer_has_address_timestamp");
        }
    }
}
