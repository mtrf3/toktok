package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.api.network.model.response.PlaceAutocompleteResponse;
import com.bytedance.pipo.checkout.api.network.model.response.PlaceInfo;
import com.bytedance.vcloud.vctrace.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a9R, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92357a9R extends C92219a7D {
    public static final XLL LJJIIZI = C79853Bl.LIZ(0, 0, null, 7);
    public static final XLL LJJIJ = C79853Bl.LIZ(0, 0, null, 7);
    public final String LJIIZILJ;
    public final C92083a51 LJIJ;
    public final String LJIJI;
    public final C64962gm LJIJJ;
    public XKQ LJIJJLI;
    public XKQ LJIL;
    public String LJJ;
    public boolean LJJI;
    public final ParcelableSnapshotMutableState LJJIFFI;
    public final ParcelableSnapshotMutableState LJJII;
    public final C44001o4 LJJIII;
    public final InterfaceC88472Yns<String, C76800UCe> LJJIIJ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJJIIJZLJL;
    public final InterfaceC88472Yns<InterfaceC91996a3c, C76800UCe> LJJIIZ;

    public C92357a9R() {
        throw null;
    }

    @Override // X.C92219a7D, X.InterfaceC91938a2g
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZ() {
        return this.LJJIIJZLJL;
    }

    public final void LJIILJJIL(PlaceAutocompleteResponse placeAutocompleteResponse) {
        ArrayList<PlaceInfo> infos = placeAutocompleteResponse.getInfos();
        if (infos == null) {
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.LJJIFFI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(infos, 10));
        Iterator<PlaceInfo> it = infos.iterator();
        while (it.hasNext()) {
            PlaceInfo next = it.next();
            String desc = next.getDesc();
            if (desc == null) {
                desc = "";
            }
            arrayList.add(new C92180a6a(desc, next));
        }
        parcelableSnapshotMutableState.setValue(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r14, X.InterfaceC67352kd<? super X.C92082a50<com.bytedance.pipo.checkout.api.network.model.response.PlaceAutocompleteResponse>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C92640aE0
            if (r0 == 0) goto L74
            r7 = r15
            X.aE0 r7 = (X.C92640aE0) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r4 = 1
            if (r0 == 0) goto L21
            if (r0 != r4) goto L7a
            X.C141335gf.LIZJ(r1)
        L20:
            return r1
        L21:
            X.C141335gf.LIZJ(r1)
            java.lang.String r2 = r13.LJJ
            java.lang.String r1 = r13.LJIIZILJ
            java.lang.String r0 = r13.LJIJI
            com.bytedance.pipo.checkout.api.network.model.request.PlaceAutocompleteRequest r6 = new com.bytedance.pipo.checkout.api.network.model.request.PlaceAutocompleteRequest
            r6.<init>(r14, r1, r0, r2)
            X.a51 r5 = r13.LJIJ
            if (r5 != 0) goto L35
            r1 = 0
            goto L20
        L35:
            r7.LJLJI = r4
            X.XKg r4 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r4.<init>(r0)
            X.a4z r0 = r5.LIZIZ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "/address_oversea/place_autocomplete"
            java.lang.String r2 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)
            com.bytedance.pipo.checkout.api.network.model.request.InnerPlaceAutocompleteRequest r7 = new com.bytedance.pipo.checkout.api.network.model.request.InnerPlaceAutocompleteRequest
            java.lang.String r8 = r6.getKeyword()
            java.lang.String r9 = r6.getCountryCode()
            java.lang.String r10 = r6.getLanguage()
            java.lang.String r11 = r6.getSessionKey()
            java.lang.String r12 = r5.LIZJ
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.Map r1 = r7.buildParams()
            X.a8Z r0 = new X.a8Z
            r0.<init>(r4)
            X.C92097a5F.LIZ(r2, r1, r0)
            java.lang.Object r1 = r4.LIZ()
            if (r1 != r3) goto L20
            return r3
        L74:
            X.aE0 r7 = new X.aE0
            r7.<init>(r13, r15)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92357a9R.LJIILL(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r18, X.InterfaceC67352kd<? super X.C92082a50<com.bytedance.pipo.checkout.api.network.model.response.PlaceDetailResponse>> r19) {
        /*
            r17 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C92641aE1
            r4 = r17
            if (r0 == 0) goto L7c
            r6 = r3
            X.aE1 r6 = (X.C92641aE1) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r6.LJLJI = r2
        L16:
            java.lang.Object r2 = r6.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r6.LJLJI
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 != r0) goto L82
            X.C141335gf.LIZJ(r2)
        L24:
            return r2
        L25:
            X.C141335gf.LIZJ(r2)
            com.bytedance.pipo.checkout.api.network.model.request.PlaceDetailRequest r10 = new com.bytedance.pipo.checkout.api.network.model.request.PlaceDetailRequest
            java.lang.String r12 = r4.LJIIZILJ
            java.lang.String r13 = r4.LJIJI
            r14 = 0
            r15 = 8
            r8 = 0
            r11 = r18
            r16 = r14
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.a51 r5 = r4.LJIJ
            if (r5 != 0) goto L3f
            r2 = 0
            goto L24
        L3f:
            r6.LJLJI = r0
            X.XKg r4 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r6)
            r4.<init>(r0)
            X.a4z r0 = r5.LIZIZ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "/address_oversea/place_detail"
            java.lang.String r2 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)
            java.lang.String r6 = r10.getId()
            java.lang.String r9 = r10.getCountryCode()
            java.lang.String r7 = r10.getLanguage()
            java.lang.String r10 = r5.LIZJ
            com.bytedance.pipo.checkout.api.network.model.request.InnerPlaceDetailRequest r5 = new com.bytedance.pipo.checkout.api.network.model.request.InnerPlaceDetailRequest
            r11 = 4
            r12 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.Map r1 = r5.buildParams()
            X.a8a r0 = new X.a8a
            r0.<init>(r4)
            X.C92097a5F.LIZ(r2, r1, r0)
            java.lang.Object r2 = r4.LIZ()
            if (r2 != r3) goto L24
            return r3
        L7c:
            X.aE1 r6 = new X.aE1
            r6.<init>(r4, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92357a9R.LJIILLIIL(java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92357a9R(InterfaceC88472Yns interfaceC88472Yns, Elements elements, String str, String str2, C92083a51 c92083a51, String str3) {
        super(elements, 300, true, "", interfaceC88472Yns, str, null, BuildConfig.VERSION_CODE);
        XIA coroutineContext = C78613UtF.LIZJ;
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.LJIIZILJ = str2;
        this.LJIJ = c92083a51;
        this.LJIJI = str3;
        this.LJIJJ = C48841JEv.LIZ(coroutineContext);
        this.LJJIFFI = C78966Uyw.LJJJIL(C61878OQg.INSTANCE);
        this.LJJII = C78966Uyw.LJJJIL(Boolean.FALSE);
        this.LJJIII = C78966Uyw.LJIJI(new IDqS422S0100000_31(this, 69));
        this.LJJIIJ = new IDqS418S0100000_31(this, 55);
        this.LJJIIJZLJL = new IDqS418S0100000_31(this, 54);
        this.LJJIIZ = new IDqS418S0100000_31(this, 52);
    }
}
