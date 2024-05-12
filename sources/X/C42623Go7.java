package X;

import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.HashMap;

/* renamed from: X.Go7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42623Go7<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C42623Go7(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<SuggestMusicList> interfaceC73573Su9) {
        C10K c10k = (C10K) ((HashMap) C42622Go6.LJFF).get(this.LJLIL);
        if (c10k != null) {
            c10k.LIZLLL(new C42624Go8((C73433Srt) interfaceC73573Su9, this.LJLILLLLZI));
        }
    }
}
