package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* renamed from: X.NgQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59982NgQ implements InterfaceC59983NgR {
    public final Context LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C68322mC<String> LIZJ;
    public final /* synthetic */ AnchorCommonStruct LIZLLL;
    public final /* synthetic */ C68322mC<String> LJ;

    @Override // X.InterfaceC59983NgR
    public final String LIZ() {
        if (this.LIZIZ) {
            return "ba_paid";
        }
        return "ba_organic";
    }

    @Override // X.InterfaceC59983NgR
    public final String LIZIZ() {
        String schema;
        AnchorCommonStruct anchorCommonStruct = this.LIZLLL;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            return "";
        }
        return schema;
    }

    @Override // X.InterfaceC59983NgR
    public final String LIZJ() {
        return this.LJ.element;
    }

    @Override // X.InterfaceC59983NgR
    public final String getProductId() {
        String str = this.LIZJ.element;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC59983NgR
    public final Context getContext() {
        return this.LIZ;
    }

    public C59982NgQ(Context context, boolean z, C68322mC<String> c68322mC, AnchorCommonStruct anchorCommonStruct, C68322mC<String> c68322mC2) {
        this.LIZIZ = z;
        this.LIZJ = c68322mC;
        this.LIZLLL = anchorCommonStruct;
        this.LJ = c68322mC2;
        this.LIZ = context;
    }
}
