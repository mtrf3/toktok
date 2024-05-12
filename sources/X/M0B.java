package X;

import Y.ARunnableS45S0100000_9;
import android.view.View;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.ui.ShopMainLynxAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M0B extends QXX {
    public final /* synthetic */ ShopMainLynxAssem LJLIL;

    @Override // X.QXX
    public final void LLLIIIIL() {
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onPageStart");
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_LYNX_PAGE_START.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 20);
        java.util.Set<EnumC56110M0k> set = this.LJLIL.v3().LJLILLLLZI.LJLJLLL;
        EnumC56110M0k enumC56110M0k = EnumC56110M0k.LYNX_ON_PAGE_START;
        set.add(enumC56110M0k);
        java.util.Set<JSONObject> set2 = this.LJLIL.v3().hv0().LIZIZ.get(enumC56110M0k);
        if (set2 != null) {
            ShopMainLynxAssem shopMainLynxAssem = this.LJLIL;
            Iterator<JSONObject> it = set2.iterator();
            while (it.hasNext()) {
                shopMainLynxAssem.v3().hv0().LIZ(it.next(), EnumC56110M0k.LYNX_ON_PAGE_START);
            }
        }
    }

    @Override // X.QXX
    public final void LLLJ() {
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onRuntimeReady");
        C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_LYNX_RUNTIME_READY.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 20);
        this.LJLIL.v3().LJLILLLLZI.LJLJLLL.add(EnumC56110M0k.LYNX_ON_RUNTIME_READY);
    }

    @Override // X.QXX
    public final void LLLLII() {
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onTimingSetup");
    }

    @Override // X.QXX
    public final void LLL() {
        String str;
        boolean z;
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onFirstScreen");
        C36746EbW.LIZ(3, "ShopTabV3 ImgPreload onFirstScreen");
        this.LJLIL.v3().LJLILLLLZI.LJLJJLL = true;
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LJLIL.v3().hv0().LIZ.LJLJJL;
        long j2 = 0;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        long j3 = currentTimeMillis - j;
        boolean LIZJ = C51751KSt.LIZ.LIZJ();
        c56092Lzs.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j3));
        if (LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_data_cache", str);
        hashMap.put("enter_from", C56092Lzs.LIZJ());
        hashMap.putAll(C56092Lzs.LJ());
        C56092Lzs.LJIILJJIL("rd_tiktokec_mall_page_lynx_dur", hashMap);
        C56092Lzs.LJIIJJI(c56092Lzs, EnumC56115M0p.STAGE_LYNX_FIRST_SCREEN.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 20);
        java.util.Set<EnumC56110M0k> set = this.LJLIL.v3().LJLILLLLZI.LJLJLLL;
        EnumC56110M0k enumC56110M0k = EnumC56110M0k.LYNX_ON_FIRST_SCREEN;
        set.add(enumC56110M0k);
        View view = this.LJLIL.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLIL.v3().setState(M1M.LJLIL);
        C51741KSj.LIZ = true;
        java.util.Set<JSONObject> set2 = this.LJLIL.v3().hv0().LIZIZ.get(enumC56110M0k);
        if (set2 != null) {
            ShopMainLynxAssem shopMainLynxAssem = this.LJLIL;
            Iterator<JSONObject> it = set2.iterator();
            while (it.hasNext()) {
                shopMainLynxAssem.v3().hv0().LIZ(it.next(), EnumC56110M0k.LYNX_ON_FIRST_SCREEN);
            }
        }
        Integer num = C9CE.LIZ().open;
        if (num == null || num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || KL8.LIZ() == 4) {
            Integer num2 = C9CE.LIZ().open;
            if (num2 == null || num2.intValue() != 0) {
                Long l = C9CE.LIZ().duration;
                if (l != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 4500;
                }
            } else if (KL8.LIZ() == 4) {
                j2 = 56000;
            }
            ShopMainLynxAssem shopMainLynxAssem2 = this.LJLIL;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = shopMainLynxAssem2.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.postDelayed(new ARunnableS45S0100000_9(shopMainLynxAssem2, 26), j2);
            }
        }
    }

    @Override // X.QXX
    public final void LLLFFI() {
        String str;
        boolean z;
        TemplateData templateData;
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onLoadSuccess");
        C36746EbW.LIZ(3, "ShopTabV3ForQA FirstScreen loadSuccess");
        ShopMainLynxAssem shopMainLynxAssem = this.LJLIL;
        shopMainLynxAssem.getClass();
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        long currentTimeMillis = System.currentTimeMillis() - shopMainLynxAssem.v3().LJLILLLLZI.LJLJJL;
        boolean LIZJ = C51751KSt.LIZ.LIZJ();
        c56092Lzs.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(currentTimeMillis));
        if (LIZJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_data_cache", str);
        hashMap.put("enter_from", C56092Lzs.LIZJ());
        hashMap.put("coldboot_to_click_duration", Long.valueOf(M0M.LIZIZ));
        hashMap.putAll(C56092Lzs.LJ());
        C56092Lzs.LJIILJJIL("rd_tiktokec_mall_lynx_create_dur", hashMap);
        C56092Lzs.LJIIIZ(true);
        C56092Lzs.LJIIJJI(c56092Lzs, EnumC56115M0p.STAGE_LYNX_LOAD_SUCCESS.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 20);
        if (shopMainLynxAssem.LJLJJI != null) {
            z = true;
        } else {
            z = false;
        }
        C56092Lzs.LJIJJLI(null, null, Boolean.valueOf(z));
        this.LJLIL.v3().LJLILLLLZI.LJLJLLL.add(EnumC56110M0k.LYNX_ON_LOAD_SUCCESS);
        this.LJLIL.v3().LJLILLLLZI.LJLJJI = true;
        C56123M0x c56123M0x = this.LJLIL.LJLJJI;
        if (c56123M0x != null) {
            ShopMainLynxAssem shopMainLynxAssem2 = this.LJLIL;
            M0F.LIZIZ("updateData updateLynxDataV2 enter");
            shopMainLynxAssem2.getClass();
            try {
                if (shopMainLynxAssem2.LJLJJI != null) {
                    M0F.LIZIZ("updateData updateLynxDataV2 enter");
                    ShopMainLynxViewModel v3 = shopMainLynxAssem2.v3();
                    EnumC56062LzO dataFrom = shopMainLynxAssem2.v3().LJLILLLLZI.LJLIL;
                    v3.getClass();
                    o.LJIIIZ(dataFrom, "dataFrom");
                    if (c56123M0x.LIZIZ && (templateData = c56123M0x.LIZ) != null) {
                        templateData.LJI("type", dataFrom.getValue());
                    }
                    C36746EbW.LIZ(3, "ShopTabV3 DataUpdate setDataLynxLoadSuccess data_from: " + shopMainLynxAssem2.v3().LJLILLLLZI.LJLIL);
                    shopMainLynxAssem2.C3(c56123M0x, false);
                    C56092Lzs.LJIJJLI(Boolean.valueOf(shopMainLynxAssem2.v3().LJLILLLLZI.LJLJJI), Boolean.FALSE, Boolean.TRUE);
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public M0B(ShopMainLynxAssem shopMainLynxAssem) {
        this.LJLIL = shopMainLynxAssem;
    }

    @Override // X.QXX
    public final void LLLILZ(LynxError lynxError) {
        String str;
        C36746EbW.LIZ(3, "ShopTabV3 LynxLifeCycle onReceivedError");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String stage = EnumC56115M0p.STAGE_LYNX_RECEIVED_ERROR.getStage();
        long currentTimeMillis = System.currentTimeMillis() - M0M.LIZ;
        boolean z = M0M.LIZJ;
        OSZ[] oszArr = new OSZ[2];
        Integer num = null;
        if (lynxError != null) {
            num = Integer.valueOf(lynxError.LIZ);
        }
        oszArr[0] = new OSZ("error_code", String.valueOf(num));
        if (lynxError == null || (str = lynxError.LIZ()) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("error_msg", str);
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        c56092Lzs.getClass();
        C56092Lzs.LJIIJ(stage, currentTimeMillis, false, z, LJJL);
        this.LJLIL.v3().LJLILLLLZI.LJLJLLL.add(EnumC56110M0k.LYNX_ON_RECEIVED_ERROR);
        if (lynxError != null) {
            int i = lynxError.LIZ;
            String LIZ = lynxError.LIZ();
            o.LJIIIIZZ(LIZ, "error.msg");
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", Integer.valueOf(i));
            hashMap.put("error_msg", LIZ);
            hashMap.put("enter_from", C56092Lzs.LIZJ());
            hashMap.putAll(C56092Lzs.LJ());
            C56092Lzs.LJIILJJIL("rd_tiktokec_mall_lynx_fail", hashMap);
        }
    }

    @Override // X.QXX
    public final void LLLLIIIILLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTabV3 LynxLifeCycle onTimingUpdate flag: ");
        LIZ.append(str);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
    }
}
