package X;

import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.8yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229128yy implements InterfaceC214228aw<InterfaceC229138yz> {
    public final MixFeedApi LIZ;
    public final C229118yx LIZIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.8yx] */
    public C229128yy() {
        MixFeedApi.LIZ.getClass();
        this.LIZ = C229108yw.LIZ();
        this.LIZIZ = new InterfaceC229138yz() { // from class: X.8yx
            @Override // X.InterfaceC229138yz
            public final AbstractC73638SvC<ManageResponse> LJJJJI(String mixID, String name) {
                o.LJIIIZ(mixID, "mixID");
                o.LJIIIZ(name, "name");
                return C229128yy.this.LIZ.manageMixFeed(EnumC228828yU.RENAME.getOperation(), mixID, null, null, null, name);
            }

            @Override // X.InterfaceC229138yz
            public final AbstractC73672Svk<CheckPlayResponse> checkPlaylistName(int i, String name) {
                o.LJIIIZ(name, "name");
                return C229128yy.this.LIZ.checkPlaylistName(i, name);
            }
        };
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC229138yz getOperator() {
        return this.LIZIZ;
    }
}
