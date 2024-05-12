package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91510Zvm implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final UrlModel LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final EnumC91310ZsY LJLJJL;
    public final InterfaceC88471Ynr<String, Context, C76800UCe> LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91510Zvm)) {
            return false;
        }
        C91510Zvm c91510Zvm = (C91510Zvm) obj;
        return o.LJ(this.LJLIL, c91510Zvm.LJLIL) && o.LJ(this.LJLILLLLZI, c91510Zvm.LJLILLLLZI) && o.LJ(this.LJLJI, c91510Zvm.LJLJI) && o.LJ(this.LJLJJI, c91510Zvm.LJLJJI) && this.LJLJJL == c91510Zvm.LJLJJL && o.LJ(this.LJLJJLL, c91510Zvm.LJLJJLL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI.hashCode()) * 31) + this.LJLJI.hashCode()) * 31) + this.LJLJJI.hashCode()) * 31) + this.LJLJJL.hashCode()) * 31;
        InterfaceC88471Ynr<String, Context, C76800UCe> interfaceC88471Ynr = this.LJLJJLL;
        return hashCode + (interfaceC88471Ynr == null ? 0 : interfaceC88471Ynr.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MDQueueCurrentMusicItem(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pictureUrl=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", songName=");
        LIZ.append(this.LJLJI);
        LIZ.append(", artistName=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", playbackState=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C91510Zvm(String str, UrlModel urlModel, String str2, String str3, EnumC91310ZsY playbackState, InterfaceC88471Ynr<? super String, ? super Context, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(playbackState, "playbackState");
        this.LJLIL = str;
        this.LJLILLLLZI = urlModel;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = playbackState;
        this.LJLJJLL = interfaceC88471Ynr;
    }
}
