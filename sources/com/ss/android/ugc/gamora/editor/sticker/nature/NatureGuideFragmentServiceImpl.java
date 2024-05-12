package com.ss.android.ugc.gamora.editor.sticker.nature;

import X.ASL;
import X.ActivityC45651qj;
import X.AnonymousClass641;
import X.C145995oB;
import X.C1DG;
import X.C58096Mr6;
import X.FMX;
import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService;

/* loaded from: classes3.dex */
public final class NatureGuideFragmentServiceImpl implements INatureGuideFragmentService {
    public static INatureGuideFragmentService LIZ() {
        Object LIZ = C58096Mr6.LIZ(INatureGuideFragmentService.class, false);
        if (LIZ != null) {
            return (INatureGuideFragmentService) LIZ;
        }
        if (C58096Mr6.C8 == null) {
            synchronized (INatureGuideFragmentService.class) {
                if (C58096Mr6.C8 == null) {
                    C58096Mr6.C8 = new NatureGuideFragmentServiceImpl();
                }
            }
        }
        return C58096Mr6.C8;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService
    public final void mobNatureGuideFragmentShow(String str) {
        if (!new AnonymousClass641().LIZ.getBoolean("has_shown_nature_sticker_guide", false)) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZLLL("enter_from", str);
            FMX.LJIIL("show_nature_first_info", c145995oB.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.INatureGuideFragmentService
    public final void showNatureStickerGuide(Activity activity) {
        if (activity != null && !new AnonymousClass641().LIZ.getBoolean("has_shown_nature_sticker_guide", false)) {
            NatureStickerGuideFragment natureStickerGuideFragment = new NatureStickerGuideFragment();
            TuxSheet tuxSheet = new ASL().LIZ;
            tuxSheet.LJLLILLLL = natureStickerGuideFragment;
            tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.63d
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    new AnonymousClass641().LIZ.storeBoolean("has_shown_nature_sticker_guide", true);
                }
            };
            C1DG.LJII((ActivityC45651qj) activity, "activity as FragmentActi…y).supportFragmentManager", tuxSheet, "NatureStickerGuideFragment");
        }
    }
}
