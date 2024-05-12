package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IGg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC46330IGg extends IDV, InterfaceC245709kc, InterfaceC232739Bl {
    void LIZIZ();

    void LJFF(float f);

    void LJI(float f);

    void LJIIIIZZ();

    void LJIIIZ(String str);

    void LJIIJ(C46745IWf c46745IWf);

    String LJIIJJI(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C46259IDn c46259IDn);

    void LJIIL(Long l);

    void LJIILIIL();

    void LJIILJJIL();

    void LJIILL(List<Aweme> list);

    void LJIILLIIL(Aweme aweme, C46367IHr c46367IHr);

    String LJIIZILJ(IWJ iwj);

    void LJIJ();

    String LJIJI(Video video, Audio audio, boolean z, boolean z2);

    void LJIJJ();

    void LJIJJLI();

    Integer LJIL();

    void LJJ();

    Integer LJJI();

    String LJJIFFI(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i);

    void LJJII(IWH iwh);

    void LJJIII(OnUIPlayListener onUIPlayListener);

    String LJJIIJ(C46745IWf c46745IWf, OnUIPlayListener onUIPlayListener);

    void LJJIIJZLJL(float f, float f2);

    void LJJIIZ();

    String LJJIIZI(Video video, boolean z, boolean z2, HashMap hashMap);

    String LJJIJIIJIL(VideoUrlModel videoUrlModel, boolean z, C46259IDn c46259IDn);

    IWH LJJIJIL();

    void LJJIJL(Aweme aweme);

    void LJJIJLIJ(IGM igm);

    void LJJIL();

    void LJJIZ(Aweme aweme, C46367IHr c46367IHr);

    Long LJJJ();

    String LJJJI(C46745IWf c46745IWf);

    String LJJJIL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, boolean z2, HashMap hashMap, C46259IDn c46259IDn);

    String LJJJJI(Video video, boolean z);

    String LJJJJIZL();

    void LJJJJJ(Aweme aweme, boolean z, boolean z2);

    String LJJJJJL(Video video, Audio audio, boolean z, boolean z2, boolean z3, OnUIPlayListener onUIPlayListener, int i, C46259IDn c46259IDn, boolean z4);

    void LJJJJL(boolean z);

    void LJJJLIIL();

    void LJJJLL(OnUIPlayListener onUIPlayListener);

    void LJJJLZIJ(int i);

    void LJJJZ();

    void LJJL();

    boolean LJJLIIIJLJLI(OnUIPlayListener onUIPlayListener);

    void LJJLIL();

    void LLLLLL();

    float getSpeed();

    void release();

    void setSurface(Surface surface);
}
