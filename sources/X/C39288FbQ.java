package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FbQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39288FbQ extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public C39288FbQ(String mediaSource, String campaign, String campaignId, String adset, String adsetId, String gid, String afDP) {
        o.LJIIIZ(mediaSource, "mediaSource");
        o.LJIIIZ(campaign, "campaign");
        o.LJIIIZ(campaignId, "campaignId");
        o.LJIIIZ(adset, "adset");
        o.LJIIIZ(adsetId, "adsetId");
        o.LJIIIZ(gid, "gid");
        o.LJIIIZ(afDP, "afDP");
        this.LJLIL = mediaSource;
        this.LJLILLLLZI = campaign;
        this.LJLJI = campaignId;
        this.LJLJJI = adset;
        this.LJLJJL = adsetId;
        this.LJLJJLL = gid;
        this.LJLJL = afDP;
    }
}
