package com.ss.android.ugc.aweme.services.publish;

import X.InterfaceC40948G5g;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtensionMisc {
    public final String candidateLog;
    public final AVMusic currentMusic;
    public final EditPostMobParam editPostMobParam;
    public final EditPostPermission editPostPermission;
    public final ExtensionDataRepo extensionDataRepo;
    public final boolean hasEditPageWikiAnchor;
    public final boolean isImageMode;
    public final MobParam mobParam;
    public final String pContext;
    public final PoiData poiData;
    public final InterfaceC40948G5g publishExtensionDataContainer;
    public final MicroAppModel transMicroAppInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtensionMisc(java.lang.String r16, java.lang.String r17, com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r18, X.InterfaceC40948G5g r19, com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r20, com.ss.android.ugc.aweme.services.publish.MobParam r21) {
        /*
            r15 = this;
            java.lang.String r0 = "extensionDataRepo"
            r5 = r20
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "mobParam"
            r6 = r21
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r7 = 0
            r9 = 0
            r13 = 4032(0xfc0, float:5.65E-42)
            r1 = r16
            r0 = r15
            r2 = r17
            r3 = r18
            r4 = r19
            r8 = r7
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.publish.ExtensionMisc.<init>(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel, X.G5g, com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo, com.ss.android.ugc.aweme.services.publish.MobParam):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3968, 0 == true ? 1 : 0);
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3840, 0 == true ? 1 : 0);
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, aVMusic, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3584, 0 == true ? 1 : 0);
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, aVMusic, poiData, null, 0 == true ? 1 : 0, 3072, 0 == true ? 1 : 0);
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData, EditPostPermission editPostPermission) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, aVMusic, poiData, editPostPermission, null, 2048, 0 == true ? 1 : 0);
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
    }

    public static /* synthetic */ ExtensionMisc copy$default(ExtensionMisc extensionMisc, String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extensionMisc.candidateLog;
        }
        if ((i & 2) != 0) {
            str2 = extensionMisc.pContext;
        }
        if ((i & 4) != 0) {
            microAppModel = extensionMisc.transMicroAppInfo;
        }
        if ((i & 8) != 0) {
            interfaceC40948G5g = extensionMisc.publishExtensionDataContainer;
        }
        if ((i & 16) != 0) {
            extensionDataRepo = extensionMisc.extensionDataRepo;
        }
        if ((i & 32) != 0) {
            mobParam = extensionMisc.mobParam;
        }
        if ((i & 64) != 0) {
            z = extensionMisc.hasEditPageWikiAnchor;
        }
        if ((i & 128) != 0) {
            z2 = extensionMisc.isImageMode;
        }
        if ((i & 256) != 0) {
            aVMusic = extensionMisc.currentMusic;
        }
        if ((i & 512) != 0) {
            poiData = extensionMisc.poiData;
        }
        if ((i & 1024) != 0) {
            editPostPermission = extensionMisc.editPostPermission;
        }
        if ((i & 2048) != 0) {
            editPostMobParam = extensionMisc.editPostMobParam;
        }
        return extensionMisc.copy(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, aVMusic, poiData, editPostPermission, editPostMobParam);
    }

    public final ExtensionMisc copy(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam) {
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
        return new ExtensionMisc(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, z, z2, aVMusic, poiData, editPostPermission, editPostMobParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtensionMisc)) {
            return false;
        }
        ExtensionMisc extensionMisc = (ExtensionMisc) obj;
        return o.LJ(this.candidateLog, extensionMisc.candidateLog) && o.LJ(this.pContext, extensionMisc.pContext) && o.LJ(this.transMicroAppInfo, extensionMisc.transMicroAppInfo) && o.LJ(this.publishExtensionDataContainer, extensionMisc.publishExtensionDataContainer) && o.LJ(this.extensionDataRepo, extensionMisc.extensionDataRepo) && o.LJ(this.mobParam, extensionMisc.mobParam) && this.hasEditPageWikiAnchor == extensionMisc.hasEditPageWikiAnchor && this.isImageMode == extensionMisc.isImageMode && o.LJ(this.currentMusic, extensionMisc.currentMusic) && o.LJ(this.poiData, extensionMisc.poiData) && o.LJ(this.editPostPermission, extensionMisc.editPostPermission) && o.LJ(this.editPostMobParam, extensionMisc.editPostMobParam);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.candidateLog;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pContext;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MicroAppModel microAppModel = this.transMicroAppInfo;
        int hashCode3 = (hashCode2 + (microAppModel == null ? 0 : microAppModel.hashCode())) * 31;
        InterfaceC40948G5g interfaceC40948G5g = this.publishExtensionDataContainer;
        int hashCode4 = (this.mobParam.hashCode() + ((this.extensionDataRepo.hashCode() + ((hashCode3 + (interfaceC40948G5g == null ? 0 : interfaceC40948G5g.hashCode())) * 31)) * 31)) * 31;
        boolean z = this.hasEditPageWikiAnchor;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode4 + i) * 31) + (this.isImageMode ? 1 : 0)) * 31;
        AVMusic aVMusic = this.currentMusic;
        int hashCode5 = (i2 + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31;
        PoiData poiData = this.poiData;
        int hashCode6 = (hashCode5 + (poiData == null ? 0 : poiData.hashCode())) * 31;
        EditPostPermission editPostPermission = this.editPostPermission;
        int hashCode7 = (hashCode6 + (editPostPermission == null ? 0 : editPostPermission.hashCode())) * 31;
        EditPostMobParam editPostMobParam = this.editPostMobParam;
        return hashCode7 + (editPostMobParam != null ? editPostMobParam.hashCode() : 0);
    }

    public String toString() {
        return "ExtensionMisc(candidateLog=" + this.candidateLog + ", pContext=" + this.pContext + ", transMicroAppInfo=" + this.transMicroAppInfo + ", publishExtensionDataContainer=" + this.publishExtensionDataContainer + ", extensionDataRepo=" + this.extensionDataRepo + ", mobParam=" + this.mobParam + ", hasEditPageWikiAnchor=" + this.hasEditPageWikiAnchor + ", isImageMode=" + this.isImageMode + ", currentMusic=" + this.currentMusic + ", poiData=" + this.poiData + ", editPostPermission=" + this.editPostPermission + ", editPostMobParam=" + this.editPostMobParam + ')';
    }

    public final String getCandidateLog() {
        return this.candidateLog;
    }

    public final AVMusic getCurrentMusic() {
        return this.currentMusic;
    }

    public final EditPostMobParam getEditPostMobParam() {
        return this.editPostMobParam;
    }

    public final EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        return this.extensionDataRepo;
    }

    public final boolean getHasEditPageWikiAnchor() {
        return this.hasEditPageWikiAnchor;
    }

    public final MobParam getMobParam() {
        return this.mobParam;
    }

    public final String getPContext() {
        return this.pContext;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final InterfaceC40948G5g getPublishExtensionDataContainer() {
        return this.publishExtensionDataContainer;
    }

    public final MicroAppModel getTransMicroAppInfo() {
        return this.transMicroAppInfo;
    }

    public final boolean isImageMode() {
        return this.isImageMode;
    }

    public ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam) {
        o.LJIIIZ(extensionDataRepo, "extensionDataRepo");
        o.LJIIIZ(mobParam, "mobParam");
        this.candidateLog = str;
        this.pContext = str2;
        this.transMicroAppInfo = microAppModel;
        this.publishExtensionDataContainer = interfaceC40948G5g;
        this.extensionDataRepo = extensionDataRepo;
        this.mobParam = mobParam;
        this.hasEditPageWikiAnchor = z;
        this.isImageMode = z2;
        this.currentMusic = aVMusic;
        this.poiData = poiData;
        this.editPostPermission = editPostPermission;
        this.editPostMobParam = editPostMobParam;
    }

    public /* synthetic */ ExtensionMisc(String str, String str2, MicroAppModel microAppModel, InterfaceC40948G5g interfaceC40948G5g, ExtensionDataRepo extensionDataRepo, MobParam mobParam, boolean z, boolean z2, AVMusic aVMusic, PoiData poiData, EditPostPermission editPostPermission, EditPostMobParam editPostMobParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, microAppModel, interfaceC40948G5g, extensionDataRepo, mobParam, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : aVMusic, (i & 512) != 0 ? null : poiData, (i & 1024) != 0 ? null : editPostPermission, (i & 2048) == 0 ? editPostMobParam : null);
    }
}
