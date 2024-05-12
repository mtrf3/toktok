package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.File;

/* renamed from: X.HFz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43775HFz<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C43772HFw LJLILLLLZI;

    public C43775HFz(String str, C43772HFw c43772HFw) {
        this.LJLIL = str;
        this.LJLILLLLZI = c43772HFw;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C76800UCe> interfaceC73573Su9) {
        if (!new File(this.LJLIL).exists()) {
            interfaceC73573Su9.onError(new IllegalStateException("File not exists"));
            return;
        }
        AbstractC48384Iyq abstractC48384Iyq = (AbstractC48384Iyq) W5I.LIZ().LJ(W5P.LIZLLL(android.net.Uri.fromFile(new File(this.LJLIL))).LIZ(), this.LJLILLLLZI);
        abstractC48384Iyq.LJ(new C81839W9z((C73433Srt) interfaceC73573Su9, this.LJLILLLLZI, this.LJLIL), PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("LibraryGalleryExtractor$extractImage$1")));
    }
}
