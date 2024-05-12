package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.9hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243889hg implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final String LJLJI;
    public final UrlModel LJLJJI;
    public final boolean LJLJJL;
    public final InterfaceC88474Ynu<String, Boolean, Boolean, Context, C76800UCe> LJLJJLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArtistMusicAwemeItem(awemeId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", musicStarter=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", musicStarterText=");
        LIZ.append(this.LJLJI);
        LIZ.append(", pictureUrl=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isSelected=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.LJLIL.hashCode() * 31;
        UrlModel urlModel = this.LJLILLLLZI;
        if (urlModel != null) {
            i = urlModel.hashCode();
        } else {
            i = 0;
        }
        return C16880lQ.LLJILJIL(this.LJLJJL) + ((this.LJLJJI.hashCode() + C79062V1e.LJ(this.LJLJI, (hashCode + i) * 31, 31)) * 31);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!areItemTheSame(interfaceC57784Mm4) || !(interfaceC57784Mm4 instanceof C243889hg) || this.LJLJJL != ((C243889hg) interfaceC57784Mm4).LJLJJL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C243889hg)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C243889hg) interfaceC57784Mm4).LJLIL);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C243889hg)) {
            return false;
        }
        return o.LJ(this.LJLIL, ((C243889hg) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C243889hg) || areContentsTheSame(interfaceC57784Mm4)) {
            return null;
        }
        return new C243899hh(((C243889hg) interfaceC57784Mm4).LJLJJL);
    }

    public static C243889hg LIZ(C243889hg c243889hg, boolean z) {
        String awemeId = c243889hg.LJLIL;
        UrlModel urlModel = c243889hg.LJLILLLLZI;
        String musicStarterText = c243889hg.LJLJI;
        UrlModel pictureUrl = c243889hg.LJLJJI;
        InterfaceC88474Ynu<String, Boolean, Boolean, Context, C76800UCe> interfaceC88474Ynu = c243889hg.LJLJJLL;
        c243889hg.getClass();
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicStarterText, "musicStarterText");
        o.LJIIIZ(pictureUrl, "pictureUrl");
        return new C243889hg(awemeId, urlModel, musicStarterText, pictureUrl, z, interfaceC88474Ynu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C243889hg(String str, UrlModel urlModel, String str2, UrlModel urlModel2, boolean z, InterfaceC88474Ynu<? super String, ? super Boolean, ? super Boolean, ? super Context, C76800UCe> interfaceC88474Ynu) {
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str2;
        this.LJLJJI = urlModel2;
        this.LJLJJL = z;
        this.LJLJJLL = interfaceC88474Ynu;
    }
}
