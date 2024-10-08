package X;

import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiEventApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.EditPostMobParam;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS60S0400000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xma, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85844Xma implements IAVPublishExtension<PoiPublishModel> {
    public final String LJLIL = "PoiEditPostPublishExtension";
    public PoiPublishExtensionVM LJLILLLLZI;
    public ExtensionMisc LJLJI;
    public View LJLJJI;

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final PoiPublishModel provideExtensionData() {
        PoiPublishExtensionVM poiPublishExtensionVM = this.LJLILLLLZI;
        if (poiPublishExtensionVM != null) {
            PoiData poiData = poiPublishExtensionVM.getState().LJLILLLLZI;
            PoiPublishExtensionVM poiPublishExtensionVM2 = this.LJLILLLLZI;
            if (poiPublishExtensionVM2 != null) {
                return new PoiPublishModel(poiData, poiPublishExtensionVM2.LJLIL, poiPublishExtensionVM2.LJLILLLLZI, poiPublishExtensionVM2.LJLJI);
            }
            o.LJIJI("vm");
            throw null;
        }
        o.LJIJI("vm");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return IAVPublishExtension.DefaultImpls.getAnchorIconUrl(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return IAVPublishExtension.DefaultImpls.getAnchorText(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean isDisplayAnchor() {
        return IAVPublishExtension.DefaultImpls.isDisplayAnchor(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onAccountUpdate() {
        IAVPublishExtension.DefaultImpls.onAccountUpdate(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    public C85844Xma(int i) {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        IAVPublishExtension.DefaultImpls.callbackAnchors(this, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean haveAnchors(int i) {
        return IAVPublishExtension.DefaultImpls.haveAnchors(this, i);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        o.LJIIIZ(publishOutput, "publishOutput");
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
        C85278XdS c85278XdS = C85242Xcs.LIZ;
        if (c85278XdS != null) {
            PoiPublishExtensionVM poiPublishExtensionVM = this.LJLILLLLZI;
            if (poiPublishExtensionVM != null) {
                c85278XdS.LIZ = poiPublishExtensionVM.LJLILLLLZI;
                PoiData poiData = poiPublishExtensionVM.getState().LJLILLLLZI;
                if (poiData != null) {
                    c85278XdS.LIZIZ = poiData.getPoiId();
                }
                ((List) c85278XdS.LIZJ).add(new C79536VJk(EnumC85314Xe2.GIVE_UP_POST, null));
                C85848Xme c85848Xme = new C85848Xme();
                try {
                    C85278XdS c85278XdS2 = C85242Xcs.LIZ;
                    if (c85278XdS2 != null) {
                        PoiEventApi.LIZ.getClass();
                        C85270XdK.LIZ(c85278XdS2, c85848Xme);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            o.LJIJI("vm");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(java.util.Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map) {
        o.LJIIIZ(map, "map");
        AVPublishExtensionVisible aVPublishExtensionVisible = map.get(AVPublishExtensionBiz.POI);
        if (aVPublishExtensionVisible == null) {
            aVPublishExtensionVisible = AVPublishExtensionVisible.GONE;
        }
        AVPublishExtensionVisible aVPublishExtensionVisible2 = aVPublishExtensionVisible;
        View view = this.LJLJJI;
        Integer num = null;
        if (view != null) {
            SY1 sy1 = (SY1) view.findViewById(R.id.hub);
            int i = C42290Gik.LIZ[aVPublishExtensionVisible2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    sy1.setVisibility(8);
                    return;
                }
                sy1.setAlpha(0.34f);
                sy1.setVisibility(0);
                sy1.setInterceptTouchEvent(true);
                sy1.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 178)));
                ExtensionMisc extensionMisc = this.LJLJI;
                if (extensionMisc != null) {
                    EditPostMobParam editPostMobParam = extensionMisc.getEditPostMobParam();
                    if (editPostMobParam != null) {
                        num = editPostMobParam.getAwemeType();
                    }
                    C225248si.LJIIJJI(num, true);
                    return;
                }
                o.LJIJI("extensionMiscData");
                throw null;
            }
            sy1.setVisibility(0);
            sy1.setAlpha(1.0f);
            ExtensionMisc extensionMisc2 = this.LJLJI;
            if (extensionMisc2 != null) {
                EditPostMobParam editPostMobParam2 = extensionMisc2.getEditPostMobParam();
                if (editPostMobParam2 != null) {
                    num = editPostMobParam2.getAwemeType();
                }
                C225248si.LJIIJJI(num, false);
                return;
            }
            o.LJIJI("extensionMiscData");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        o.LJIIIZ(publishOutput, "publishOutput");
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
        C85278XdS c85278XdS = C85242Xcs.LIZ;
        if (c85278XdS != null) {
            PoiPublishExtensionVM poiPublishExtensionVM = this.LJLILLLLZI;
            if (poiPublishExtensionVM != null) {
                c85278XdS.LIZ = poiPublishExtensionVM.LJLILLLLZI;
                PoiData poiData = poiPublishExtensionVM.getState().LJLILLLLZI;
                if (poiData != null) {
                    c85278XdS.LIZIZ = poiData.getPoiId();
                }
                ((List) c85278XdS.LIZJ).add(new C79536VJk(EnumC85314Xe2.POST, null));
                C85849Xmf c85849Xmf = new C85849Xmf();
                try {
                    C85278XdS c85278XdS2 = C85242Xcs.LIZ;
                    if (c85278XdS2 != null) {
                        PoiEventApi.LIZ.getClass();
                        C85270XdK.LIZ(c85278XdS2, c85849Xmf);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            o.LJIJI("vm");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        IAVPublishExtension.DefaultImpls.registerOnAddAnchorListener(this, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void unregisterOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        IAVPublishExtension.DefaultImpls.unregisterOnAddAnchorListener(this, interfaceC65784Pro);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls.onActivityResult(r5, r6, r7, r8)
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r6 != r0) goto L59
            if (r8 == 0) goto L59
            java.lang.String r0 = "poi"
            java.io.Serializable r4 = r8.getSerializableExtra(r0)
            java.lang.String r3 = "vm"
            r2 = 0
            if (r4 == 0) goto L21
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r1 = r5.LJLILLLLZI
            if (r1 == 0) goto L6c
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.poi.PoiData
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.poi.PoiData r4 = (com.ss.android.ugc.aweme.poi.PoiData) r4
        L1e:
            r1.iv0(r4)
        L21:
            java.lang.String r0 = "keyword"
            java.lang.String r0 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r1 = r5.LJLILLLLZI
            if (r1 == 0) goto L68
            java.lang.String r0 = "search_poi"
            r1.LJLIL = r0
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L3d
        L35:
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r1 = r5.LJLILLLLZI
            if (r1 == 0) goto L64
            java.lang.String r0 = "default_search_poi"
            r1.LJLIL = r0
        L3d:
            java.lang.String r0 = "log_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r1 == 0) goto L4b
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L60
            r0.LJLILLLLZI = r1
        L4b:
            java.lang.String r0 = "search_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r1 == 0) goto L59
            com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM r0 = r5.LJLILLLLZI
            if (r0 == 0) goto L5c
            r0.LJLJI = r1
        L59:
            return
        L5a:
            r4 = r2
            goto L1e
        L5c:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L60:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L64:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L68:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L6c:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85844Xma.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, LinearLayout extensionWidgetContainer, Bundle bundle, AVPublishContentType contentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        boolean z;
        C214298b3 c214298b3;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(extensionWidgetContainer, "extensionWidgetContainer");
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(publishOutput, "publishOutput");
        o.LJIIIZ(extensionMisc, "extensionMisc");
        o.LJIIIZ(callback, "callback");
        o.LJIIIIZZ(extensionWidgetContainer.getContext(), "extensionWidgetContainer.context");
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVM.class);
        C9BE c9be = C9BE.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 764);
        C85840XmW c85840XmW = C85840XmW.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            z = false;
            c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, true), C78926UyI.LJJIIJZLJL(fragment, true), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, true), C78926UyI.LJIILLIIL(fragment, true), c85840XmW, LIZ);
        } else {
            z = false;
            if (c9be == null || o.LJ(c9be, c9be)) {
                c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), c85840XmW, LIZ);
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
        }
        this.LJLILLLLZI = (PoiPublishExtensionVM) c214298b3.getValue();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(fragment.getContext()), R.layout.c16, extensionWidgetContainer, true);
        o.LJIIIIZZ(LLLLIILL, "from(fragment.context)\n …ionWidgetContainer, true)");
        this.LJLJJI = LLLLIILL;
        C8VV.LIZ(fragment, z, new AqS60S0400000_15(fragment, contentType, extensionMisc, this, 0));
        this.LJLJI = extensionMisc;
        C85242Xcs.LIZ = new C85278XdS(1);
        PoiData poiData = publishOutput.getPoiData();
        if (poiData != null) {
            poiData.toString();
        }
    }
}
