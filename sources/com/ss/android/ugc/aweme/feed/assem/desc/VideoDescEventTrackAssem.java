package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C2051383h;
import X.C2051483i;
import X.C2051583j;
import X.C2051783l;
import X.C2054084i;
import X.C2058586b;
import X.C2058886e;
import X.C213688a4;
import X.C214348b8;
import X.C38891fp;
import X.C47261Igj;
import X.C55096Ljo;
import X.C5H3;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C78685UuP;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC54035LIp;
import X.InterfaceC60152Xr;
import X.InterfaceC74236TBo;
import X.TBT;
import X.Y0N;
import X.Y0Y;
import X.Y1Y;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoDescEventTrackAssem extends ReusedAssem<VideoDescEventTrackAssem> implements C8XO<VideoItemParams> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final InterfaceC115514g7 LJLLJ = C38891fp.LJJIZ(this);
    public final C5H3 LJLLL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C2051583j.INSTANCE);
    public final VideoDescEventTrackAssem$titleParamsProvider$1 LJLLLL = new ETParamsProvider<C2051383h>() { // from class: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescEventTrackAssem$titleParamsProvider$1
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final C2051383h t() {
            int i;
            C2058586b c2058586b;
            Aweme aweme;
            int i2;
            int i3;
            Aweme aweme2;
            String desc;
            String str;
            List<TextExtraStruct> list;
            Aweme aweme3;
            Aweme aweme4;
            Aweme aweme5;
            String desc2;
            VideoDescEventTrackAssem videoDescEventTrackAssem = VideoDescEventTrackAssem.this;
            VideoDescVM videoDescVM = (VideoDescVM) videoDescEventTrackAssem.LJLLJ.LIZ(videoDescEventTrackAssem, VideoDescEventTrackAssem.LJLZ[0]);
            VideoItemParams gv0 = videoDescVM.gv0();
            if (gv0 != null && (aweme5 = gv0.getAweme()) != null && (desc2 = aweme5.getDesc()) != null) {
                i = desc2.length();
            } else {
                i = 0;
            }
            int length = videoDescVM.LLF.length();
            C2054084i c2054084i = videoDescVM.LLIIIJ;
            Aweme aweme6 = null;
            if (c2054084i != null) {
                c2058586b = c2054084i.LJLZ.LJFF;
            } else {
                c2058586b = null;
            }
            VideoItemParams gv02 = videoDescVM.gv0();
            if (gv02 != null) {
                aweme = gv02.getAweme();
            } else {
                aweme = null;
            }
            boolean LIZ = C2058886e.LIZ(aweme);
            if (c2058586b != null) {
                Y1Y y1y = videoDescVM.LLIIII;
                if ((y1y instanceof Y0Y) || !(y1y instanceof Y0N) || !LIZ) {
                    i2 = 0;
                } else {
                    i2 = 1;
                    String str2 = c2058586b.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (videoDescVM.LLFF.length() == 0) {
                        VideoItemParams gv03 = videoDescVM.gv0();
                        if (gv03 != null && (aweme4 = gv03.getAweme()) != null) {
                            str = aweme4.getDesc();
                        } else {
                            str = null;
                        }
                        VideoItemParams gv04 = videoDescVM.gv0();
                        if (gv04 != null && (aweme3 = gv04.getAweme()) != null) {
                            list = aweme3.getTextExtra();
                        } else {
                            list = null;
                        }
                        videoDescVM.LLFF = i0.LJFF(str2, C2051783l.LIZ(str, list));
                    }
                    CharSequence charSequence = c2058586b.LIZIZ;
                    if (charSequence != null) {
                        i = charSequence.length();
                    } else {
                        i = 0;
                    }
                    length = videoDescVM.LLFF.length();
                }
            } else {
                i2 = 0;
            }
            VideoItemParams gv05 = videoDescVM.gv0();
            if (gv05 != null && (aweme2 = gv05.getAweme()) != null && (desc = aweme2.getDesc()) != null && C78685UuP.LJJJZ(desc)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            VideoItemParams gv06 = videoDescVM.gv0();
            if (gv06 != null) {
                aweme6 = gv06.getAweme();
            }
            return new C2051383h(i3, i, C2058886e.LIZJ(aweme6), length, LIZ ? 1 : 0, i2);
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC54035LIp getParam() {
            if (d2(C2051383h.class)) {
                return t();
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean d2(Class<? extends InterfaceC60152Xr> clazz) {
            o.LJIIIZ(clazz, "clazz");
            if (!o.LJ(clazz, C2051383h.class)) {
                return false;
            }
            return true;
        }
    };
    public final VideoDescEventTrackAssem$descExpandModeProtocol$1 LJLLLLLL = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescEventTrackAssem$descExpandModeProtocol$1
        @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
        public final void I() {
        }

        @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
        public final void LLILLJJLI() {
            VideoDescProviderAbility videoDescProviderAbility = (VideoDescProviderAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(VideoDescEventTrackAssem.this), VideoDescProviderAbility.class, null);
            if (videoDescProviderAbility != null) {
                videoDescProviderAbility.Di();
            }
        }
    };

    static {
        TBT tbt = new TBT(VideoDescEventTrackAssem.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LJLLL.getValue(), new TBT() { // from class: X.83k
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJLL;
            }
        }, C213688a4.LJ(), C2051483i.LJLIL, 4);
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), ETParamsProvider.class, C47261Igj.LJJIJIL(this.LJLLLL));
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LJLLLLLL));
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(VideoItemParams videoItemParams) {
    }
}
