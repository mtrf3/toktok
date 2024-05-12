package com.ss.android.ugc.aweme.im.message.template.component;

import X.C78945Uyb;
import X.C79062V1e;
import X.C79095V2l;
import X.C79102V2s;
import X.C79135V3z;
import X.C79143V4h;
import X.V33;
import X.V35;
import X.V43;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VideoCoverComponent implements BaseComponent<V43> {
    public static final VideoCoverComponent EMPTY_VIDEO_COVER;
    public final ImageComponent coverImage;
    public final String id;
    public final ActionLinkComponent linkComponent;
    public final ImageComponent overlay;
    public final ResolutionComponent resolutionComponent;
    public final VideoCoverType videoCoverType;
    public final String videoModel;
    public static final C78945Uyb Companion = new C78945Uyb();
    public static final Parcelable.Creator<VideoCoverComponent> CREATOR = new C79102V2s();

    /* JADX WARN: Multi-variable type inference failed */
    public VideoCoverComponent() {
        this((ImageComponent) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (VideoCoverType) (0 == true ? 1 : 0), (ActionLinkComponent) (0 == true ? 1 : 0), (ResolutionComponent) (0 == true ? 1 : 0), 127);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCoverComponent)) {
            return false;
        }
        VideoCoverComponent videoCoverComponent = (VideoCoverComponent) obj;
        return o.LJ(this.coverImage, videoCoverComponent.coverImage) && o.LJ(this.id, videoCoverComponent.id) && o.LJ(this.videoModel, videoCoverComponent.videoModel) && this.videoCoverType == videoCoverComponent.videoCoverType && o.LJ(this.overlay, videoCoverComponent.overlay) && o.LJ(this.linkComponent, videoCoverComponent.linkComponent) && o.LJ(this.resolutionComponent, videoCoverComponent.resolutionComponent);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCoverComponent(coverImage=");
        LIZ.append(this.coverImage);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", videoModel=");
        LIZ.append(this.videoModel);
        LIZ.append(", videoCoverType=");
        LIZ.append(this.videoCoverType);
        LIZ.append(", overlay=");
        LIZ.append(this.overlay);
        LIZ.append(", linkComponent=");
        LIZ.append(this.linkComponent);
        LIZ.append(", resolutionComponent=");
        LIZ.append(this.resolutionComponent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ImageComponent imageComponent = this.coverImage;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
        out.writeString(this.id);
        out.writeString(this.videoModel);
        this.videoCoverType.writeToParcel(out, i);
        ImageComponent imageComponent2 = this.overlay;
        if (imageComponent2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent2.writeToParcel(out, i);
        }
        this.linkComponent.writeToParcel(out, i);
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        if (resolutionComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            resolutionComponent.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ImageComponent.Companion.getClass();
        EMPTY_VIDEO_COVER = new VideoCoverComponent(C79095V2l.LIZ(), (String) null, (String) (0 == true ? 1 : 0), (VideoCoverType) (0 == true ? 1 : 0), (ActionLinkComponent) (0 == true ? 1 : 0), (ResolutionComponent) (0 == true ? 1 : 0), 126);
    }

    public final V43 LIZ() {
        C79135V3z c79135V3z;
        V33 v33 = new V33();
        v33.LIZLLL = this.id;
        v33.LJ = this.videoCoverType.m133toProto();
        v33.LJI = this.videoModel;
        ImageComponent imageComponent = this.coverImage;
        C79143V4h c79143V4h = null;
        if (imageComponent != null) {
            c79135V3z = imageComponent.LIZIZ();
        } else {
            c79135V3z = null;
        }
        v33.LJFF = c79135V3z;
        v33.LJII = this.linkComponent.M();
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        if (resolutionComponent != null) {
            V35 v35 = new V35();
            v35.LIZLLL = Integer.valueOf(resolutionComponent.width);
            v35.LJ = Integer.valueOf(resolutionComponent.height);
            c79143V4h = v35.build();
        }
        v33.LJIIIIZZ = c79143V4h;
        return v33.build();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        ImageComponent imageComponent = this.coverImage;
        int i = 0;
        if (imageComponent == null) {
            hashCode = 0;
        } else {
            hashCode = imageComponent.hashCode();
        }
        int LJ = C79062V1e.LJ(this.id, hashCode * 31, 31);
        String str = this.videoModel;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (this.videoCoverType.hashCode() + ((LJ + hashCode2) * 31)) * 31;
        ImageComponent imageComponent2 = this.overlay;
        if (imageComponent2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageComponent2.hashCode();
        }
        int hashCode5 = (this.linkComponent.hashCode() + ((hashCode4 + hashCode3) * 31)) * 31;
        ResolutionComponent resolutionComponent = this.resolutionComponent;
        if (resolutionComponent != null) {
            i = resolutionComponent.hashCode();
        }
        return hashCode5 + i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VideoCoverComponent(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r9, java.lang.String r10, java.lang.String r11, com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType r12, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r13, com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent r14, int r15) {
        /*
            r8 = this;
            r2 = r10
            r1 = r9
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r0 = r15 & 1
            r5 = 0
            if (r0 == 0) goto Lc
            r1 = r5
        Lc:
            r0 = r15 & 2
            if (r0 == 0) goto L12
            java.lang.String r2 = ""
        L12:
            r0 = r15 & 4
            if (r0 == 0) goto L17
            r3 = r5
        L17:
            r0 = r15 & 8
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType r4 = com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType.INVALID
        L1d:
            r0 = r15 & 32
            if (r0 == 0) goto L2a
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r6 = X.C63715OzX.LIZ()
        L2a:
            r0 = r15 & 64
            if (r0 == 0) goto L2f
            r7 = r5
        L2f:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent.<init>(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.message.template.component.VideoCoverType, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent, com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent, int):void");
    }

    public VideoCoverComponent(ImageComponent imageComponent, String id, String str, VideoCoverType videoCoverType, ImageComponent imageComponent2, ActionLinkComponent linkComponent, ResolutionComponent resolutionComponent) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(videoCoverType, "videoCoverType");
        o.LJIIIZ(linkComponent, "linkComponent");
        this.coverImage = imageComponent;
        this.id = id;
        this.videoModel = str;
        this.videoCoverType = videoCoverType;
        this.overlay = imageComponent2;
        this.linkComponent = linkComponent;
        this.resolutionComponent = resolutionComponent;
    }
}
