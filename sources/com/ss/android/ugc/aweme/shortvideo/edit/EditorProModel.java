package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C1FJ;
import X.C279017q;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class EditorProModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditorProModel> CREATOR = new Parcelable.Creator<EditorProModel>() { // from class: X.5Rm
        @Override // android.os.Parcelable.Creator
        public final EditorProModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Integer valueOf;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            o.LJIIIZ(parcel, "parcel");
            int i = 0;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            while (i2 != readInt) {
                i2 = C5YW.LIZ(EditorProModel.class, parcel, arrayList, i2, 1);
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = C5YW.LIZ(EditorProModel.class, parcel, arrayList2, i, 1);
                }
            }
            return new EditorProModel(z, readString, z2, arrayList, createStringArrayList, createStringArrayList2, z3, z4, readInt2, z5, z6, valueOf, z7, createStringArrayList3, createStringArrayList4, createStringArrayList5, createStringArrayList6, createStringArrayList7, z8, readString2, z9, z10, z11, z12, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProModel[] newArray(int i) {
            return new EditorProModel[i];
        }
    };

    @InterfaceC65349Pkn("album_upload_video_segments")
    public List<EditVideoSegment> albumUploadVideoSegments;

    @InterfaceC65349Pkn("audio_edit_tip_title")
    public String audioEditTipTitle;

    @InterfaceC65349Pkn("origin_canvas_shoot_image_segments")
    public List<EditVideoSegment> canvasShootImageSegments;

    @InterfaceC65349Pkn("edit_mode")
    public int editMode;

    @InterfaceC65349Pkn("editor_pro_anchor_type")
    public String editorProAnchorType;

    @InterfaceC65349Pkn("edit_page_normal_ui_style")
    public boolean editorProEntryForceNormalStyle;

    @InterfaceC65349Pkn("enable_origin_audio")
    public boolean enableOriginAudio;

    @InterfaceC65349Pkn("from_edit_page_bottom")
    public boolean fromEditorPageBottom;

    @InterfaceC65349Pkn("from_editor_pro_anchor")
    public boolean fromEditorProAnchor;

    @InterfaceC65349Pkn("from_editor_pro_album_entry")
    public boolean fromEditorProEntranceInAlbum;

    @InterfaceC65349Pkn("from_photo_canvas")
    public boolean fromPhotoCanvas;

    @InterfaceC65349Pkn("has_audio_in_advance_edit")
    public boolean hasAudioInAdvanceEdit;

    @InterfaceC65349Pkn("is_advanced_edit")
    public boolean isAdvancedEdit;

    @InterfaceC65349Pkn("is_advanced_edit_draft")
    public boolean isAdvancedEditDraft;

    @InterfaceC65349Pkn("is_pip_used")
    public boolean isPipUsed;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("magic_combine_effect_algo_paths")
    public List<String> magicCombineEffectAlgoCachePaths;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("magic_effect_resource_paths")
    public List<String> magicEffectResourcePaths;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("magic_resource_paths")
    public List<String> magicResourcePaths;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("magic_video_paths")
    public List<String> magicVideoPaths;

    @InterfaceC65349Pkn("old_effect_draft")
    public boolean oldEffectDraft;

    @InterfaceC36436ERs
    @InterfaceC43620HAa(blockCreative = true)
    @InterfaceC65349Pkn("pip_resource_paths")
    public List<String> pipResourcePaths;

    @InterfaceC65349Pkn("pip_slot_uuids")
    public List<String> pipSlotUuidList;

    @InterfaceC65349Pkn("real_origin")
    public Integer realOrigin;

    @InterfaceC65349Pkn("show_audio_edit_tip")
    public boolean showAudioEditTip;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("transition_resource_paths")
    public List<String> transitionResourcePaths;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditorProModel() {
        /*
            r28 = this;
            r1 = 0
            r2 = 0
            r26 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r28
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r2
            r13 = r1
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r1
            r20 = r2
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r2
            r27 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<EditVideoSegment> getAlbumUploadVideoSegments() {
        return this.albumUploadVideoSegments;
    }

    public final String getAudioEditTipTitle() {
        return this.audioEditTipTitle;
    }

    public final List<EditVideoSegment> getCanvasShootImageSegments() {
        return this.canvasShootImageSegments;
    }

    public final int getEditMode() {
        return this.editMode;
    }

    public final String getEditorProAnchorType() {
        return this.editorProAnchorType;
    }

    public final boolean getEditorProEntryForceNormalStyle() {
        return this.editorProEntryForceNormalStyle;
    }

    public final boolean getEnableOriginAudio() {
        return this.enableOriginAudio;
    }

    public final boolean getFromEditorPageBottom() {
        return this.fromEditorPageBottom;
    }

    public final boolean getFromEditorProAnchor() {
        return this.fromEditorProAnchor;
    }

    public final boolean getFromEditorProEntranceInAlbum() {
        return this.fromEditorProEntranceInAlbum;
    }

    public final boolean getFromPhotoCanvas() {
        return this.fromPhotoCanvas;
    }

    public final boolean getHasAudioInAdvanceEdit() {
        return this.hasAudioInAdvanceEdit;
    }

    public final List<String> getMagicCombineEffectAlgoCachePaths() {
        return this.magicCombineEffectAlgoCachePaths;
    }

    public final List<String> getMagicEffectResourcePaths() {
        return this.magicEffectResourcePaths;
    }

    public final List<String> getMagicResourcePaths() {
        return this.magicResourcePaths;
    }

    public final List<String> getMagicVideoPaths() {
        return this.magicVideoPaths;
    }

    public final boolean getOldEffectDraft() {
        return this.oldEffectDraft;
    }

    public final List<String> getPipResourcePaths() {
        return this.pipResourcePaths;
    }

    public final List<String> getPipSlotUuidList() {
        return this.pipSlotUuidList;
    }

    public final Integer getRealOrigin() {
        return this.realOrigin;
    }

    public final boolean getShowAudioEditTip() {
        return this.showAudioEditTip;
    }

    public final List<String> getTransitionResourcePaths() {
        return this.transitionResourcePaths;
    }

    public final boolean isAdvancedEdit() {
        return this.isAdvancedEdit;
    }

    public final boolean isAdvancedEditDraft() {
        return this.isAdvancedEditDraft;
    }

    public final boolean isPipUsed() {
        return this.isPipUsed;
    }

    public final void setAdvancedEdit(boolean z) {
        this.isAdvancedEdit = z;
    }

    public final void setAdvancedEditDraft(boolean z) {
        this.isAdvancedEditDraft = z;
    }

    public final void setAlbumUploadVideoSegments(List<EditVideoSegment> list) {
        o.LJIIIZ(list, "<set-?>");
        this.albumUploadVideoSegments = list;
    }

    public final void setAudioEditTipTitle(String str) {
        this.audioEditTipTitle = str;
    }

    public final void setCanvasShootImageSegments(List<EditVideoSegment> list) {
        this.canvasShootImageSegments = list;
    }

    public final void setEditMode(int i) {
        this.editMode = i;
    }

    public final void setEditorProAnchorType(String str) {
        this.editorProAnchorType = str;
    }

    public final void setEditorProEntryForceNormalStyle(boolean z) {
        this.editorProEntryForceNormalStyle = z;
    }

    public final void setEnableOriginAudio(boolean z) {
        this.enableOriginAudio = z;
    }

    public final void setFromEditorPageBottom(boolean z) {
        this.fromEditorPageBottom = z;
    }

    public final void setFromEditorProAnchor(boolean z) {
        this.fromEditorProAnchor = z;
    }

    public final void setFromEditorProEntranceInAlbum(boolean z) {
        this.fromEditorProEntranceInAlbum = z;
    }

    public final void setFromPhotoCanvas(boolean z) {
        this.fromPhotoCanvas = z;
    }

    public final void setHasAudioInAdvanceEdit(boolean z) {
        this.hasAudioInAdvanceEdit = z;
    }

    public final void setMagicCombineEffectAlgoCachePaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.magicCombineEffectAlgoCachePaths = list;
    }

    public final void setMagicEffectResourcePaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.magicEffectResourcePaths = list;
    }

    public final void setMagicResourcePaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.magicResourcePaths = list;
    }

    public final void setMagicVideoPaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.magicVideoPaths = list;
    }

    public final void setOldEffectDraft(boolean z) {
        this.oldEffectDraft = z;
    }

    public final void setPipResourcePaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.pipResourcePaths = list;
    }

    public final void setPipSlotUuidList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.pipSlotUuidList = list;
    }

    public final void setPipUsed(boolean z) {
        this.isPipUsed = z;
    }

    public final void setRealOrigin(Integer num) {
        this.realOrigin = num;
    }

    public final void setShowAudioEditTip(boolean z) {
        this.showAudioEditTip = z;
    }

    public final void setTransitionResourcePaths(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.transitionResourcePaths = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.showAudioEditTip ? 1 : 0);
        out.writeString(this.audioEditTipTitle);
        out.writeInt(this.hasAudioInAdvanceEdit ? 1 : 0);
        Iterator LIZJ = UC7.LIZJ(this.albumUploadVideoSegments, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        out.writeStringList(this.pipResourcePaths);
        out.writeStringList(this.pipSlotUuidList);
        out.writeInt(this.isAdvancedEditDraft ? 1 : 0);
        out.writeInt(this.isAdvancedEdit ? 1 : 0);
        out.writeInt(this.editMode);
        out.writeInt(this.enableOriginAudio ? 1 : 0);
        out.writeInt(this.isPipUsed ? 1 : 0);
        Integer num = this.realOrigin;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeInt(this.oldEffectDraft ? 1 : 0);
        out.writeStringList(this.transitionResourcePaths);
        out.writeStringList(this.magicResourcePaths);
        out.writeStringList(this.magicVideoPaths);
        out.writeStringList(this.magicEffectResourcePaths);
        out.writeStringList(this.magicCombineEffectAlgoCachePaths);
        out.writeInt(this.fromEditorProAnchor ? 1 : 0);
        out.writeString(this.editorProAnchorType);
        out.writeInt(this.fromEditorProEntranceInAlbum ? 1 : 0);
        out.writeInt(this.fromPhotoCanvas ? 1 : 0);
        out.writeInt(this.fromEditorPageBottom ? 1 : 0);
        out.writeInt(this.editorProEntryForceNormalStyle ? 1 : 0);
        List<EditVideoSegment> list = this.canvasShootImageSegments;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeParcelable((Parcelable) LIZIZ.next(), i);
        }
    }

    public EditorProModel(boolean z, String str, boolean z2, List<EditVideoSegment> albumUploadVideoSegments, List<String> pipResourcePaths, List<String> pipSlotUuidList, boolean z3, boolean z4, int i, boolean z5, boolean z6, Integer num, boolean z7, List<String> transitionResourcePaths, List<String> magicResourcePaths, List<String> magicVideoPaths, List<String> magicEffectResourcePaths, List<String> magicCombineEffectAlgoCachePaths, boolean z8, String str2, boolean z9, boolean z10, boolean z11, boolean z12, List<EditVideoSegment> list) {
        o.LJIIIZ(albumUploadVideoSegments, "albumUploadVideoSegments");
        o.LJIIIZ(pipResourcePaths, "pipResourcePaths");
        o.LJIIIZ(pipSlotUuidList, "pipSlotUuidList");
        o.LJIIIZ(transitionResourcePaths, "transitionResourcePaths");
        o.LJIIIZ(magicResourcePaths, "magicResourcePaths");
        o.LJIIIZ(magicVideoPaths, "magicVideoPaths");
        o.LJIIIZ(magicEffectResourcePaths, "magicEffectResourcePaths");
        o.LJIIIZ(magicCombineEffectAlgoCachePaths, "magicCombineEffectAlgoCachePaths");
        this.showAudioEditTip = z;
        this.audioEditTipTitle = str;
        this.hasAudioInAdvanceEdit = z2;
        this.albumUploadVideoSegments = albumUploadVideoSegments;
        this.pipResourcePaths = pipResourcePaths;
        this.pipSlotUuidList = pipSlotUuidList;
        this.isAdvancedEditDraft = z3;
        this.isAdvancedEdit = z4;
        this.editMode = i;
        this.enableOriginAudio = z5;
        this.isPipUsed = z6;
        this.realOrigin = num;
        this.oldEffectDraft = z7;
        this.transitionResourcePaths = transitionResourcePaths;
        this.magicResourcePaths = magicResourcePaths;
        this.magicVideoPaths = magicVideoPaths;
        this.magicEffectResourcePaths = magicEffectResourcePaths;
        this.magicCombineEffectAlgoCachePaths = magicCombineEffectAlgoCachePaths;
        this.fromEditorProAnchor = z8;
        this.editorProAnchorType = str2;
        this.fromEditorProEntranceInAlbum = z9;
        this.fromPhotoCanvas = z10;
        this.fromEditorPageBottom = z11;
        this.editorProEntryForceNormalStyle = z12;
        this.canvasShootImageSegments = list;
    }

    public /* synthetic */ EditorProModel(boolean z, String str, boolean z2, List list, List list2, List list3, boolean z3, boolean z4, int i, boolean z5, boolean z6, Integer num, boolean z7, List list4, List list5, List list6, List list7, List list8, boolean z8, String str2, boolean z9, boolean z10, boolean z11, boolean z12, List list9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? new ArrayList() : list2, (i2 & 32) != 0 ? new ArrayList() : list3, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? false : z5, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) != 0 ? null : num, (i2 & 4096) != 0 ? true : z7, (i2 & FileUtils.BUFFER_SIZE) != 0 ? new ArrayList() : list4, (i2 & 16384) != 0 ? new ArrayList() : list5, (32768 & i2) != 0 ? new ArrayList() : list6, (65536 & i2) != 0 ? new ArrayList() : list7, (131072 & i2) != 0 ? new ArrayList() : list8, (262144 & i2) != 0 ? false : z8, (524288 & i2) != 0 ? null : str2, (1048576 & i2) != 0 ? false : z9, (2097152 & i2) != 0 ? false : z10, (4194304 & i2) != 0 ? false : z11, (8388608 & i2) != 0 ? false : z12, (i2 & 16777216) != 0 ? null : list9);
    }
}
