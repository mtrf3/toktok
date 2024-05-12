package X;

import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;

/* renamed from: X.1sA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46541sA extends AbstractC65781Prl implements InterfaceC65784Pro<MultiGuestStickerViewModel> {
    public static final C46541sA LJLIL = new C46541sA();

    public C46541sA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel, androidx.lifecycle.ViewModel] */
    @Override // X.InterfaceC65784Pro
    public final MultiGuestStickerViewModel invoke() {
        return new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(null, null)).get(MultiGuestStickerViewModel.class);
    }
}
