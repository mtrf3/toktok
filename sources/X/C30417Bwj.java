package X;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBeautyWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30417Bwj implements InterfaceC08050Th<LiveEffect> {
    public final /* synthetic */ PreviewBeautyWidget LIZ;

    @Override // X.InterfaceC08050Th
    public final void LIZ(float f, FilterModel filterModel) {
    }

    public C30417Bwj(PreviewBeautyWidget previewBeautyWidget) {
        this.LIZ = previewBeautyWidget;
    }

    @Override // X.InterfaceC08050Th
    public final void LIZIZ(int i) {
        String str;
        List<? extends LiveEffect> LIZ = this.LIZ.LJLJI.LIZ();
        if (i < LIZ.size()) {
            str = ((LiveEffect) ListProtector.get(LIZ, i)).getFilterId();
        } else {
            str = "";
        }
        if (!C38354F3m.LJ(str) && !o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_click_change_filter");
            LIZLLL.LJ("preview");
            LIZLLL.LIZLLL("select_filter_id", str);
            LIZLLL.LIZ(Integer.valueOf(i), "select_filter_position");
            LIZLLL.LJIIIZ();
        }
    }
}
