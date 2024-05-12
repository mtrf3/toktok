package X;

import android.os.Bundle;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;

/* renamed from: X.aig, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94542aig extends AbstractC65781Prl implements InterfaceC65784Pro<GifsFragment> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94542aig(String str) {
        super(0);
        this.LJLIL = str;
    }

    @Override // X.InterfaceC65784Pro
    public final GifsFragment invoke() {
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        GifsFragment gifsFragment = new GifsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_gif_source", str);
        gifsFragment.setArguments(bundle);
        return gifsFragment;
    }
}
