package X;

import android.os.Build;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherBackgroundImageOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.TtliveGameOtherMaskLayerOptimizeSetting;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xv4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86370Xv4<T> implements Observer {
    public final /* synthetic */ CoverWidget LJLIL;

    public C86370Xv4(CoverWidget coverWidget) {
        this.LJLIL = coverWidget;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        MutableLiveData<C86361Xuv> mutableLiveData;
        C86361Xuv value;
        C86343Xud LJLZ;
        C86343Xud LJLZ2;
        int i;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        String str;
        LivePreviewPlayerVM LJZI = this.LJLIL.LJZI();
        String str2 = null;
        if (LJZI != null && (mutableLiveData = LJZI.LJLILLLLZI) != null && (value = mutableLiveData.getValue()) != null) {
            CoverWidget coverWidget = this.LJLIL;
            if (Build.VERSION.SDK_INT >= 23) {
                C62846OlW c62846OlW = coverWidget.LJLJI;
                if (c62846OlW != null) {
                    c62846OlW.setVisibility(8);
                }
                if (value.LJLIL > value.LJLILLLLZI) {
                    C29306Beo.LJJLIIIJJI(coverWidget.LJLILLLLZI, true);
                    C62846OlW c62846OlW2 = coverWidget.LJLILLLLZI;
                    if (c62846OlW2 != null) {
                        c62846OlW2.setForeground(null);
                    }
                    C86343Xud LJLZ3 = coverWidget.LJLZ();
                    if (LJLZ3 != null) {
                        str = C78963Uyt.LJIIZILJ(LJLZ3);
                    } else {
                        str = null;
                    }
                    if (C86373Xv7.LIZ(str)) {
                        coverWidget.LJZ();
                    }
                } else {
                    C62846OlW c62846OlW3 = coverWidget.LJLILLLLZI;
                    if (c62846OlW3 != null) {
                        c62846OlW3.setVisibility(8);
                    }
                }
                if (TtliveGameOtherBackgroundImageOptimizeSetting.INSTANCE.isBackgroundImmutable()) {
                    if (C30922CBq.LIZIZ) {
                        C86343Xud LJLZ4 = coverWidget.LJLZ();
                        if (LJLZ4 != null) {
                            str2 = C78963Uyt.LJIIZILJ(LJLZ4);
                        }
                        if (C86373Xv7.LIZ(str2)) {
                            C0NB.LJIIIZ("CoverWidget", "use surfaceView experiment -> true");
                        } else {
                            C0NB.LJIIIZ("CoverWidget", "use surfaceView experiment -> false");
                        }
                    }
                    if (coverWidget.LJLJL == 0) {
                        if (value.LJLIL > value.LJLILLLLZI) {
                            C86343Xud LJLZ5 = coverWidget.LJLZ();
                            if ((LJLZ5 != null && (liveRoomStruct3 = LJLZ5.LIZIZ) != null && liveRoomStruct3.liveRoomMode == 1) || (((LJLZ = coverWidget.LJLZ()) != null && (liveRoomStruct2 = LJLZ.LIZIZ) != null && liveRoomStruct2.liveRoomMode == 4) || ((LJLZ2 = coverWidget.LJLZ()) != null && (liveRoomStruct = LJLZ2.LIZIZ) != null && liveRoomStruct.liveRoomMode == 6))) {
                                if (!TtliveGameOtherMaskLayerOptimizeSetting.INSTANCE.showMaskLayer()) {
                                    View findViewById = coverWidget.contentView.findViewById(R.id.gradual_bottom);
                                    if (findViewById != null) {
                                        findViewById.setVisibility(8);
                                    }
                                    View findViewById2 = coverWidget.contentView.findViewById(R.id.gradual_top);
                                    if (findViewById2 != null) {
                                        findViewById2.setVisibility(8);
                                    }
                                }
                            } else {
                                i = 1;
                                coverWidget.LJLJL = i;
                            }
                        }
                        i = 2;
                        coverWidget.LJLJL = i;
                    }
                    if (coverWidget.LJLJL == 1) {
                        C29306Beo.LJJLIIIJJI(coverWidget.LJLILLLLZI, true);
                        return;
                    }
                    C62846OlW c62846OlW4 = coverWidget.LJLILLLLZI;
                    if (c62846OlW4 == null) {
                        return;
                    }
                    c62846OlW4.setVisibility(8);
                }
            }
        }
    }
}
