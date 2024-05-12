package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I52 implements InterfaceC46060I5w {
    public final /* synthetic */ I56 LIZ;

    public I52(I56 i56) {
        this.LIZ = i56;
    }

    @Override // X.InterfaceC46060I5w
    public final void LIZ(int i, String str) {
        ArrayList<String> arrayList;
        Long l;
        I56 i56 = this.LIZ;
        CutVideoEditViewModel cutVideoEditViewModel = i56.LJZI;
        if (cutVideoEditViewModel != null) {
            if (cutVideoEditViewModel.LJLJJLL == 2 || i56.LLII) {
                return;
            }
            if (i == 10003) {
                Activity activity = i56.mActivity;
                C46048I5k c46048I5k = i56.LJLIL;
                if (c46048I5k != null) {
                    arrayList = c46048I5k.LLD();
                } else {
                    arrayList = null;
                }
                C46048I5k c46048I5k2 = this.LIZ.LJLIL;
                if (c46048I5k2 != null) {
                    l = Long.valueOf(c46048I5k2.LL());
                } else {
                    l = null;
                }
                o.LJI(l);
                long longValue = l.longValue();
                CutVideoViewModel cutVideoViewModel = this.LIZ.LJLLL;
                if (cutVideoViewModel != null) {
                    CreativeInfo creativeInfo = cutVideoViewModel.Mv0().LJIIZILJ;
                    o.LJIIIZ(creativeInfo, "creativeInfo");
                    Bundle LIZ = C45771Hxn.LIZ(activity, arrayList, longValue, creativeInfo);
                    if (LIZ == null || activity == null) {
                        return;
                    }
                    HZV.LIZ().LJIILL(activity, LIZ, 2, 1001);
                    return;
                }
                o.LJIJI("cutVideoViewModel");
                throw null;
            }
            CutVideoListViewModel cutVideoListViewModel = i56.LL;
            if (cutVideoListViewModel != null) {
                cutVideoListViewModel.LJLJJLL = i;
                VideoEditViewModel videoEditViewModel = i56.LJLLJ;
                if (videoEditViewModel != null) {
                    cutVideoListViewModel.LJLJL = videoEditViewModel.jv0(str);
                    I56 i562 = this.LIZ;
                    CutVideoListViewModel cutVideoListViewModel2 = i562.LL;
                    if (cutVideoListViewModel2 != null) {
                        int i2 = cutVideoListViewModel2.LJLJL;
                        if (i2 < 0) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("edit index:");
                            CutVideoListViewModel cutVideoListViewModel3 = this.LIZ.LL;
                            if (cutVideoListViewModel3 != null) {
                                LIZ2.append(cutVideoListViewModel3.LJLJJLL);
                                LIZ2.append(", origin_index:");
                                CutVideoListViewModel cutVideoListViewModel4 = this.LIZ.LL;
                                if (cutVideoListViewModel4 != null) {
                                    LIZ2.append(cutVideoListViewModel4.LJLJL);
                                    LIZ2.append(", path:");
                                    LIZ2.append(str);
                                    H7B.LJFF(X1D.LIZIZ(LIZ2));
                                    return;
                                }
                                o.LJIJI("cutVideoListViewModel");
                                throw null;
                            }
                            o.LJIJI("cutVideoListViewModel");
                            throw null;
                        }
                        CutMultiVideoViewModel cutMultiVideoViewModel = i562.LJLLILLLL;
                        if (cutMultiVideoViewModel != null) {
                            cutMultiVideoViewModel.gv0(cutVideoListViewModel2.LJLJJLL, i2);
                            return;
                        } else {
                            o.LJIJI("cutMultiVideoViewModel");
                            throw null;
                        }
                    }
                    o.LJIJI("cutVideoListViewModel");
                    throw null;
                }
                o.LJIJI("videoEditViewModel");
                throw null;
            }
            o.LJIJI("cutVideoListViewModel");
            throw null;
        }
        o.LJIJI("cutVideoEditViewModel");
        throw null;
    }
}
