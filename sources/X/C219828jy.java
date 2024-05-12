package X;

import com.ss.android.ugc.tiktok.addyours.hub.model.HubFeedResponse;

/* renamed from: X.8jy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219828jy implements InterfaceC214228aw<InterfaceC219758jr> {
    public final C219818jx LIZ = new InterfaceC219758jr() { // from class: X.8jx
        @Override // X.InterfaceC219758jr
        public final HubFeedResponse LJJJJ(int i, int i2, int i3, long j, long j2) {
            try {
                return C219908k6.LIZ().fetchHubFeed(j, i, j2, i2, i3).execute().LIZIZ;
            } catch (C38333F2r e) {
                e.getMessage();
                return null;
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC219758jr getOperator() {
        return this.LIZ;
    }
}
