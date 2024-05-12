package X;

import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter;

/* renamed from: X.2In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C56212In implements InterfaceC56382Je, BmfBrightenFilter.Listener {
    public final /* synthetic */ Object LIZ;

    @Override // X.InterfaceC56382Je
    public final void LIZ(long j, String str) {
        C12460eI.LJIIIZ((C56292Iv) this.LIZ);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter.Listener
    public final void onEvent(int i, int i2, String str, Throwable th) {
        ((LiveStream) this.LIZ).lambda$initBmfVideoFilters$9(i, i2, str, th);
    }

    public /* synthetic */ C56212In(Object obj) {
        this.LIZ = obj;
    }
}
