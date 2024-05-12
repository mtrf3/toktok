package X;

import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import java.util.HashMap;

/* renamed from: X.KTd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51761KTd extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C62846OlW LIZIZ;
    public final /* synthetic */ MusicClassDetailFragment LIZJ;

    public C51761KTd(MusicClassDetailFragment musicClassDetailFragment, C62846OlW c62846OlW) {
        this.LIZJ = musicClassDetailFragment;
        this.LIZIZ = c62846OlW;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        InterfaceC81599W0t interfaceC81599W0t = (InterfaceC81599W0t) obj;
        double LJIILL = C17N.LJIILL(21.0d);
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        layoutParams.width = (int) ((interfaceC81599W0t.getWidth() / interfaceC81599W0t.getHeight()) * LJIILL);
        layoutParams.height = (int) LJIILL;
        this.LIZIZ.setLayoutParams(layoutParams);
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "change_music_page");
        hashMap.put("category_name", this.LIZJ.LJLLLL);
        FMX.LJIIL("show_ad_sticker", hashMap);
    }
}
