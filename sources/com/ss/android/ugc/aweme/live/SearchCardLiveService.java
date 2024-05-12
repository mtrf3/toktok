package com.ss.android.ugc.aweme.live;

import X.C2U8;
import X.C55333Lnd;
import X.C58096Mr6;
import X.C80796VnM;
import X.C86144XrQ;
import X.IKN;
import X.InterfaceC55347Lnr;

/* loaded from: classes16.dex */
public final class SearchCardLiveService implements ISearchCardLiveService {
    public static ISearchCardLiveService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISearchCardLiveService.class, false);
        if (LIZ != null) {
            return (ISearchCardLiveService) LIZ;
        }
        if (C58096Mr6.w2 == null) {
            synchronized (ISearchCardLiveService.class) {
                if (C58096Mr6.w2 == null) {
                    C58096Mr6.w2 = new SearchCardLiveService();
                }
            }
        }
        return C58096Mr6.w2;
    }

    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void LIZIZ() {
        C2U8.LIZ(new IKN());
    }

    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void searchScrollToNextItem() {
        InterfaceC55347Lnr interfaceC55347Lnr = C86144XrQ.LIZ;
        if (interfaceC55347Lnr != null) {
            ((C55333Lnd) interfaceC55347Lnr).LIZ.advanceToNextItem(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ISearchCardLiveService
    public final void LIZ() {
        C80796VnM c80796VnM;
        boolean LIZIZ = C86144XrQ.LIZIZ();
        if (C86144XrQ.LJFF != LIZIZ) {
            InterfaceC55347Lnr interfaceC55347Lnr = C86144XrQ.LIZ;
            if (interfaceC55347Lnr != null && (c80796VnM = ((C55333Lnd) interfaceC55347Lnr).LIZ.mViewPager) != null) {
                c80796VnM.setDisableScroll(!LIZIZ);
            }
            C86144XrQ.LJFF = LIZIZ;
        }
    }
}
