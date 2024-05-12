package X;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionBiz;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS19S0500000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xmd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85847Xmd implements IAVPublishExtension<PoiPublishModel> {
    public PoiPublishExtensionVMV2 LJLIL;

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "PoiPublishExtensionV2";
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final boolean haveAnchors(int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void registerOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void unregisterOnAddAnchorListener(InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final PoiPublishModel provideExtensionData() {
        PoiPublishExtensionVMV2 poiPublishExtensionVMV2 = this.LJLIL;
        if (poiPublishExtensionVMV2 != null) {
            PoiData poiData = poiPublishExtensionVMV2.getState().LJLILLLLZI;
            PoiPublishExtensionVMV2 poiPublishExtensionVMV22 = this.LJLIL;
            if (poiPublishExtensionVMV22 != null) {
                return new PoiPublishModel(poiData, poiPublishExtensionVMV22.LJLIL, poiPublishExtensionVMV22.LJLILLLLZI, poiPublishExtensionVMV22.LJLJI);
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
    public final void onAccountUpdate() {
        IAVPublishExtension.DefaultImpls.onAccountUpdate(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        IAVPublishExtension.DefaultImpls.callbackAnchors(this, list);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onExtensionEnable(java.util.Map<AVPublishExtensionBiz, ? extends AVPublishExtensionVisible> map) {
        IAVPublishExtension.DefaultImpls.onExtensionEnable(this, map);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
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
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r1 = r5.LJLIL
            if (r1 == 0) goto L6c
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.poi.PoiData
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.poi.PoiData r4 = (com.ss.android.ugc.aweme.poi.PoiData) r4
        L1e:
            r1.jv0(r4)
        L21:
            java.lang.String r0 = "keyword"
            java.lang.String r0 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r1 = r5.LJLIL
            if (r1 == 0) goto L68
            java.lang.String r0 = "search_poi"
            r1.LJLIL = r0
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L3d
        L35:
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r1 = r5.LJLIL
            if (r1 == 0) goto L64
            java.lang.String r0 = "default_search_poi"
            r1.LJLIL = r0
        L3d:
            java.lang.String r0 = "log_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r1 == 0) goto L4b
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r0 = r5.LJLIL
            if (r0 == 0) goto L60
            r0.LJLILLLLZI = r1
        L4b:
            java.lang.String r0 = "search_id"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r8, r0)
            if (r1 == 0) goto L59
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r0 = r5.LJLIL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C85847Xmd.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, View view, LifecycleOwner lifecycleOwner, LinearLayout extensionWidgetContainer, Bundle bundle, AVPublishContentType contentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        ?? r1;
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
        C65776Prg LIZ = C65352Pkq.LIZ(PoiPublishExtensionVMV2.class);
        C9BE c9be = C9BE.LIZ;
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 782);
        C85843XmZ c85843XmZ = C85843XmZ.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            r1 = 1;
            c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, true), C78926UyI.LJJIIJZLJL(fragment, true), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, true), C78926UyI.LJIILLIIL(fragment, true), c85843XmZ, LIZ);
        } else {
            r1 = 1;
            if (c9be == null || o.LJ(c9be, c9be)) {
                c214298b3 = new C214298b3(aqS165S0100000_15, C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C78926UyI.LJJIIJZLJL(fragment, false), C184077Kh.LJLIL, C78926UyI.LJJ(fragment, false), C78926UyI.LJIILLIIL(fragment, false), c85843XmZ, LIZ);
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
        }
        this.LJLIL = (PoiPublishExtensionVMV2) c214298b3.getValue();
        C8VV.LIZ(fragment, false, new AqS19S0500000_15(publishOutput, fragment, contentType, extensionMisc, C16880lQ.LLLLIILL(C16880lQ.LLZIL(fragment.getContext()), R.layout.c17, extensionWidgetContainer, r1), 1));
        C85242Xcs.LIZ = new C85278XdS(r1);
        PoiData poiData = publishOutput.getPoiData();
        if (poiData != null) {
            poiData.toString();
        }
        InterfaceC54049LJd LJIJ = NearbyFeedServiceImpl.LJJI().LJIJ();
        if (LJIJ != null) {
            LJIJ.LIZJ();
        }
    }
}
