package com.ss.android.ugc.aweme.viewModel;

import X.C72685Sfp;
import X.C72695Sfz;
import X.InterfaceC61312at;
import X.InterfaceC72580Se8;
import X.InterfaceC72603SeV;
import X.UPJ;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviEditorState implements InterfaceC61312at {
    public final C72695Sfz currentMessage;
    public final int currentTabIndex;
    public final C72685Sfp editCategory;
    public final int fps;
    public final boolean fromAutoCreation;
    public final boolean hasEdited;
    public final boolean isHeadLoaded;
    public final boolean isQuitEditing;
    public final boolean isScanEffectLoaded;
    public final boolean isSceneEffectLoaded;
    public final boolean naviDoneLoading;
    public final List<InterfaceC72580Se8> parentCategoryList;
    public final String scanStickerPath;
    public final String sceneStickerPath;
    public final List<InterfaceC72603SeV> tabList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviEditorState() {
        /*
            r18 = this;
            r1 = 0
            r2 = 0
            r16 = 32767(0x7fff, float:4.5916E-41)
            r0 = r18
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r17 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState.<init>():void");
    }

    public static /* synthetic */ ProfileNaviEditorState copy$default(ProfileNaviEditorState profileNaviEditorState, List list, int i, List list2, C72695Sfz c72695Sfz, String str, String str2, C72685Sfp c72685Sfp, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, Object obj) {
        int i4 = i;
        List list3 = list;
        C72695Sfz c72695Sfz2 = c72695Sfz;
        List list4 = list2;
        String str3 = str2;
        String str4 = str;
        boolean z8 = z;
        C72685Sfp c72685Sfp2 = c72685Sfp;
        boolean z9 = z3;
        boolean z10 = z2;
        boolean z11 = z5;
        boolean z12 = z4;
        boolean z13 = z7;
        boolean z14 = z6;
        int i5 = i2;
        if ((i3 & 1) != 0) {
            list3 = profileNaviEditorState.tabList;
        }
        if ((i3 & 2) != 0) {
            i4 = profileNaviEditorState.currentTabIndex;
        }
        if ((i3 & 4) != 0) {
            list4 = profileNaviEditorState.parentCategoryList;
        }
        if ((i3 & 8) != 0) {
            c72695Sfz2 = profileNaviEditorState.currentMessage;
        }
        if ((i3 & 16) != 0) {
            str4 = profileNaviEditorState.sceneStickerPath;
        }
        if ((i3 & 32) != 0) {
            str3 = profileNaviEditorState.scanStickerPath;
        }
        if ((i3 & 64) != 0) {
            c72685Sfp2 = profileNaviEditorState.editCategory;
        }
        if ((i3 & 128) != 0) {
            z8 = profileNaviEditorState.naviDoneLoading;
        }
        if ((i3 & 256) != 0) {
            z10 = profileNaviEditorState.isQuitEditing;
        }
        if ((i3 & 512) != 0) {
            z9 = profileNaviEditorState.isScanEffectLoaded;
        }
        if ((i3 & 1024) != 0) {
            z12 = profileNaviEditorState.isSceneEffectLoaded;
        }
        if ((i3 & 2048) != 0) {
            z11 = profileNaviEditorState.hasEdited;
        }
        if ((i3 & 4096) != 0) {
            z14 = profileNaviEditorState.fromAutoCreation;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            z13 = profileNaviEditorState.isHeadLoaded;
        }
        if ((i3 & 16384) != 0) {
            i5 = profileNaviEditorState.fps;
        }
        return profileNaviEditorState.copy(list3, i4, list4, c72695Sfz2, str4, str3, c72685Sfp2, z8, z10, z9, z12, z11, z14, z13, i5);
    }

    public final ProfileNaviEditorState copy(List<? extends InterfaceC72603SeV> list, int i, List<? extends InterfaceC72580Se8> list2, C72695Sfz c72695Sfz, String str, String str2, C72685Sfp c72685Sfp, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        return new ProfileNaviEditorState(list, i, list2, c72695Sfz, str, str2, c72685Sfp, z, z2, z3, z4, z5, z6, z7, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviEditorState)) {
            return false;
        }
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) obj;
        return o.LJ(this.tabList, profileNaviEditorState.tabList) && this.currentTabIndex == profileNaviEditorState.currentTabIndex && o.LJ(this.parentCategoryList, profileNaviEditorState.parentCategoryList) && o.LJ(this.currentMessage, profileNaviEditorState.currentMessage) && o.LJ(this.sceneStickerPath, profileNaviEditorState.sceneStickerPath) && o.LJ(this.scanStickerPath, profileNaviEditorState.scanStickerPath) && o.LJ(this.editCategory, profileNaviEditorState.editCategory) && this.naviDoneLoading == profileNaviEditorState.naviDoneLoading && this.isQuitEditing == profileNaviEditorState.isQuitEditing && this.isScanEffectLoaded == profileNaviEditorState.isScanEffectLoaded && this.isSceneEffectLoaded == profileNaviEditorState.isSceneEffectLoaded && this.hasEdited == profileNaviEditorState.hasEdited && this.fromAutoCreation == profileNaviEditorState.fromAutoCreation && this.isHeadLoaded == profileNaviEditorState.isHeadLoaded && this.fps == profileNaviEditorState.fps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<InterfaceC72603SeV> list = this.tabList;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.currentTabIndex) * 31;
        List<InterfaceC72580Se8> list2 = this.parentCategoryList;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        C72695Sfz c72695Sfz = this.currentMessage;
        int hashCode3 = (hashCode2 + (c72695Sfz == null ? 0 : c72695Sfz.hashCode())) * 31;
        String str = this.sceneStickerPath;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scanStickerPath;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C72685Sfp c72685Sfp = this.editCategory;
        int hashCode6 = (hashCode5 + (c72685Sfp != null ? c72685Sfp.hashCode() : 0)) * 31;
        boolean z = this.naviDoneLoading;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z2 = this.isQuitEditing;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isScanEffectLoaded;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isSceneEffectLoaded;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.hasEdited;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.fromAutoCreation;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        return ((((i10 + i11) * 31) + (this.isHeadLoaded ? 1 : 0)) * 31) + this.fps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileNaviEditorState(tabList=");
        sb.append(this.tabList);
        sb.append(", currentTabIndex=");
        sb.append(this.currentTabIndex);
        sb.append(", parentCategoryList=");
        sb.append(this.parentCategoryList);
        sb.append(", currentMessage=");
        sb.append(this.currentMessage);
        sb.append(", sceneStickerPath=");
        sb.append(this.sceneStickerPath);
        sb.append(", scanStickerPath=");
        sb.append(this.scanStickerPath);
        sb.append(", editCategory=");
        sb.append(this.editCategory);
        sb.append(", naviDoneLoading=");
        sb.append(this.naviDoneLoading);
        sb.append(", isQuitEditing=");
        sb.append(this.isQuitEditing);
        sb.append(", isScanEffectLoaded=");
        sb.append(this.isScanEffectLoaded);
        sb.append(", isSceneEffectLoaded=");
        sb.append(this.isSceneEffectLoaded);
        sb.append(", hasEdited=");
        sb.append(this.hasEdited);
        sb.append(", fromAutoCreation=");
        sb.append(this.fromAutoCreation);
        sb.append(", isHeadLoaded=");
        sb.append(this.isHeadLoaded);
        sb.append(", fps=");
        return UPJ.LIZLLL(sb, this.fps, ')');
    }

    public final C72695Sfz getCurrentMessage() {
        return this.currentMessage;
    }

    public final int getCurrentTabIndex() {
        return this.currentTabIndex;
    }

    public final C72685Sfp getEditCategory() {
        return this.editCategory;
    }

    public final int getFps() {
        return this.fps;
    }

    public final boolean getFromAutoCreation() {
        return this.fromAutoCreation;
    }

    public final boolean getHasEdited() {
        return this.hasEdited;
    }

    public final boolean getNaviDoneLoading() {
        return this.naviDoneLoading;
    }

    public final List<InterfaceC72580Se8> getParentCategoryList() {
        return this.parentCategoryList;
    }

    public final String getScanStickerPath() {
        return this.scanStickerPath;
    }

    public final String getSceneStickerPath() {
        return this.sceneStickerPath;
    }

    public final List<InterfaceC72603SeV> getTabList() {
        return this.tabList;
    }

    public final boolean isHeadLoaded() {
        return this.isHeadLoaded;
    }

    public final boolean isQuitEditing() {
        return this.isQuitEditing;
    }

    public final boolean isScanEffectLoaded() {
        return this.isScanEffectLoaded;
    }

    public final boolean isSceneEffectLoaded() {
        return this.isSceneEffectLoaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNaviEditorState(List<? extends InterfaceC72603SeV> list, int i, List<? extends InterfaceC72580Se8> list2, C72695Sfz c72695Sfz, String str, String str2, C72685Sfp c72685Sfp, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this.tabList = list;
        this.currentTabIndex = i;
        this.parentCategoryList = list2;
        this.currentMessage = c72695Sfz;
        this.sceneStickerPath = str;
        this.scanStickerPath = str2;
        this.editCategory = c72685Sfp;
        this.naviDoneLoading = z;
        this.isQuitEditing = z2;
        this.isScanEffectLoaded = z3;
        this.isSceneEffectLoaded = z4;
        this.hasEdited = z5;
        this.fromAutoCreation = z6;
        this.isHeadLoaded = z7;
        this.fps = i2;
    }

    public /* synthetic */ ProfileNaviEditorState(List list, int i, List list2, C72695Sfz c72695Sfz, String str, String str2, C72685Sfp c72685Sfp, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : list2, (i3 & 8) != 0 ? null : c72695Sfz, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : str2, (i3 & 64) == 0 ? c72685Sfp : null, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) != 0 ? false : z5, (i3 & 4096) != 0 ? false : z6, (i3 & FileUtils.BUFFER_SIZE) == 0 ? z7 : false, (i3 & 16384) != 0 ? 24 : i2);
    }
}
