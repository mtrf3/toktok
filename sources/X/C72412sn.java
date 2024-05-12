package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.2sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72412sn extends F9E implements InterfaceC57784Mm4 {
    public final StickerSetInfo LJLIL;

    public static C72412sn L(StickerSetInfo stickerSetInfo) {
        o.LJIIIZ(stickerSetInfo, "stickerSetInfo");
        return new C72412sn(stickerSetInfo);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C72412sn(StickerSetInfo stickerSetInfo) {
        o.LJIIIZ(stickerSetInfo, "stickerSetInfo");
        this.LJLIL = stickerSetInfo;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        UrlModel urlModel;
        if (!(interfaceC57784Mm4 instanceof C72412sn)) {
            return false;
        }
        C72412sn c72412sn = (C72412sn) interfaceC57784Mm4;
        if (!o.LJ(this.LJLIL.getSetId(), c72412sn.LJLIL.getSetId()) || !o.LJ(this.LJLIL.getName(), c72412sn.LJLIL.getName()) || !o.LJ(this.LJLIL.getDesc(), c72412sn.LJLIL.getDesc())) {
            return false;
        }
        StickerUrlStruct iconUrl = this.LJLIL.getIconUrl();
        UrlModel urlModel2 = null;
        if (iconUrl != null) {
            urlModel = iconUrl.getMidResolutionUrl();
        } else {
            urlModel = null;
        }
        StickerUrlStruct iconUrl2 = c72412sn.LJLIL.getIconUrl();
        if (iconUrl2 != null) {
            urlModel2 = iconUrl2.getMidResolutionUrl();
        }
        if (!o.LJ(urlModel, urlModel2) || !o.LJ(this.LJLIL.getSetStatus(), c72412sn.LJLIL.getSetStatus()) || !o.LJ(this.LJLIL.getStickerMeta(), c72412sn.LJLIL.getStickerMeta())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C72412sn) || this.LJLIL.getSetId() == null || !o.LJ(this.LJLIL.getSetId(), ((C72412sn) interfaceC57784Mm4).LJLIL.getSetId())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        UrlModel urlModel;
        UrlModel urlModel2 = null;
        if (!(interfaceC57784Mm4 instanceof C72412sn)) {
            return null;
        }
        C72412sn c72412sn = (C72412sn) interfaceC57784Mm4;
        boolean z = !o.LJ(this.LJLIL.getName(), c72412sn.LJLIL.getName());
        boolean z2 = !o.LJ(this.LJLIL.getDesc(), c72412sn.LJLIL.getDesc());
        StickerUrlStruct iconUrl = this.LJLIL.getIconUrl();
        if (iconUrl != null) {
            urlModel = iconUrl.getMidResolutionUrl();
        } else {
            urlModel = null;
        }
        StickerUrlStruct iconUrl2 = c72412sn.LJLIL.getIconUrl();
        if (iconUrl2 != null) {
            urlModel2 = iconUrl2.getMidResolutionUrl();
        }
        return new C115564gC(z, z2, !o.LJ(urlModel, urlModel2), !o.LJ(this.LJLIL.getSetStatus(), c72412sn.LJLIL.getSetStatus()), !o.LJ(this.LJLIL.getStickerMeta(), c72412sn.LJLIL.getStickerMeta()));
    }
}
