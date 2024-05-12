package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC44957Hkf;
import X.C221108m2;
import X.C44952Hka;
import X.C47261Igj;
import X.C62822Ol8;
import X.C78857UxB;
import X.InterfaceC87755YcJ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.downloadv2.protocol.DefaultDownloadAbilityProtocol;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;

/* loaded from: classes8.dex */
public final class StoryPhotoDownloadAbilityProtocol extends DefaultDownloadAbilityProtocol {
    public final List<String> LJLJI;
    public final String LJLJJI;
    public final C78857UxB LJLJJL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final InterfaceC87755YcJ LIZLLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final String LJ() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol
    public final List<String> LJFF() {
        return this.LJLJI;
    }

    public StoryPhotoDownloadAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        Aweme aweme;
        String aid;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(abstractC44957Hkf, 627));
        C44952Hka c44952Hka = (C44952Hka) LIZIZ.getValue();
        String value = c44952Hka != null ? c44952Hka.LJIJ.getValue() : null;
        String str = "";
        this.LJLJI = C47261Igj.LJJIJ(value == null ? "" : value);
        AbstractC44957Hkf abstractC44957Hkf2 = (AbstractC44957Hkf) LIZIZ.getValue();
        if (abstractC44957Hkf2 != null && (aweme = abstractC44957Hkf2.LJFF) != null && (aid = aweme.getAid()) != null) {
            str = aid;
        }
        this.LJLJJI = str;
        this.LJLJJL = new C78857UxB();
    }
}
