package X;

import android.widget.SeekBar;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestBeautyLevelAdjustFragment;

/* renamed from: X.TfM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75204TfM implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MultiGuestBeautyLevelAdjustFragment LJLIL;

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C75204TfM(MultiGuestBeautyLevelAdjustFragment multiGuestBeautyLevelAdjustFragment) {
        this.LJLIL = multiGuestBeautyLevelAdjustFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        InterfaceC75203TfL interfaceC75203TfL;
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLIL.LJLIL;
        if (absMultiGuestEffectViewModel != null && (interfaceC75203TfL = absMultiGuestEffectViewModel.LJLLJ) != null) {
            interfaceC75203TfL.LIZJ();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        InterfaceC24140x8 interfaceC24140x8;
        InterfaceC75203TfL interfaceC75203TfL;
        if (z) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLIL.LJLIL;
            if (absMultiGuestEffectViewModel != null && (interfaceC75203TfL = absMultiGuestEffectViewModel.LJLLJ) != null) {
                interfaceC75203TfL.LJI(i);
            }
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LJLIL.LJLIL;
            if (absMultiGuestEffectViewModel2 != null && (interfaceC24140x8 = absMultiGuestEffectViewModel2.LJLJJI) != null) {
                interfaceC24140x8.LJIIIZ(i);
            }
        }
    }
}
