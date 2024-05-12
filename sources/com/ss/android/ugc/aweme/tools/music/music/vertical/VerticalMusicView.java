package com.ss.android.ugc.aweme.tools.music.music.vertical;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C10K;
import X.C119684mq;
import X.C133295Kz;
import X.C135015Rp;
import X.C145995oB;
import X.C146615pB;
import X.C149795uJ;
import X.C161806Wq;
import X.C162476Zf;
import X.C164456cr;
import X.C167486hk;
import X.C16880lQ;
import X.C170296mH;
import X.C1B8;
import X.C221108m2;
import X.C223338pd;
import X.C26045AKb;
import X.C26338AVi;
import X.C29464BhM;
import X.C32151Nz;
import X.C42470Gle;
import X.C42625Go9;
import X.C43014GuQ;
import X.C43023GuZ;
import X.C43963HNf;
import X.C48203Ivv;
import X.C52908Kpc;
import X.C53235Kut;
import X.C60903NvH;
import X.C62049OWv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C6LR;
import X.C71897SJp;
import X.C73305Spp;
import X.C73306Spq;
import X.C73318Sq2;
import X.C73969T1h;
import X.C74216TAu;
import X.C76800UCe;
import X.C77275UUl;
import X.C77413UZt;
import X.C780334l;
import X.C78596Usy;
import X.C78915Uy7;
import X.C78996UzQ;
import X.C7MY;
import X.C80697Vll;
import X.C80698Vlm;
import X.C81232VuO;
import X.C82622Wbi;
import X.C82631Wbr;
import X.C82740Wdc;
import X.C84886XTe;
import X.C84900XTs;
import X.C84905XTx;
import X.C86V;
import X.EnumC133275Kx;
import X.FFL;
import X.FMX;
import X.G8G;
import X.HNW;
import X.InterfaceC115714gR;
import X.InterfaceC133285Ky;
import X.InterfaceC135635Tz;
import X.InterfaceC149485to;
import X.InterfaceC74236TBo;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.J9P;
import X.K2Z;
import X.KL2;
import X.L1D;
import X.O6R;
import X.ORZ;
import X.QD3;
import X.QXF;
import X.T16;
import X.T3A;
import X.TBT;
import X.TK7;
import X.UCI;
import X.ViewOnClickListenerC13880ga;
import X.WPY;
import X.XKX;
import X.XTS;
import X.XTV;
import X.XUM;
import X.XUQ;
import X.XW2;
import X.XW4;
import X.XYB;
import X.XZ2;
import X.XZ3;
import X.XZ5;
import X.XZ6;
import X.XZ7;
import X.XZ8;
import X.XZ9;
import X.XZA;
import X.XZB;
import X.XZC;
import X.XZD;
import X.XZE;
import X.XZF;
import X.XZG;
import X.XZH;
import X.XZI;
import X.XZJ;
import X.XZK;
import X.XZO;
import X.XZP;
import X.XZQ;
import X.XZR;
import X.XZS;
import X.XZT;
import X.XZX;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS40S0300000_15;
import Y.ACListenerS49S0200000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import Y.AfS55S0200000_6;
import Y.AfS58S0100000_6;
import Y.AfS67S0100000_15;
import Y.AgS41S0110000_15;
import Y.IDgS352S0100000_15;
import Y.IDiS167S0200000_15;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.performance.OpenEditMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.music.stream.MusicStreamServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS24S0000100_6;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class VerticalMusicView implements GenericLifecycleObserver, InterfaceC133285Ky, InterfaceC135635Tz {
    public static final XZ5 LLJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C82622Wbi LJLIL;
    public final XZI LJLILLLLZI;
    public XZE LJLJI;
    public View LJLJJI;
    public RecyclerView LJLJJL;
    public C161806Wq LJLJJLL;
    public XZH LJLJL;
    public C80698Vlm LJLJLJ;
    public C71897SJp LJLJLLL;
    public TextView LJLL;
    public RelativeLayout LJLLI;
    public C149795uJ LJLLILLLL;
    public LinearLayout LJLLJ;
    public LinearLayout LJLLL;
    public View LJLLLL;
    public TuxIconView LJLLLLLL;
    public View LJLZ;
    public C73305Spp LJZ;
    public FrameLayout LJZI;
    public RelativeLayout LJZL;
    public RelativeLayout LL;
    public View LLD;
    public FrameLayout LLF;
    public TuxIconView LLFF;
    public C81232VuO LLFFF;
    public TuxTextView LLFII;
    public TuxIconView LLFZ;
    public TuxIconView LLI;
    public View LLIFFJFJJ;
    public View LLII;
    public FrameLayout LLIIII;
    public C73305Spp LLIIIILZ;
    public TuxTextView LLIIIJ;
    public T3A LLIIIL;
    public C223338pd LLIIIZ;
    public C161806Wq LLIIJI;
    public final C82631Wbr LLIIJLIL;
    public T3A LLIIL;
    public C223338pd LLIILII;
    public LinearLayout LLIILZL;
    public LinearLayout LLIIZ;
    public LinearLayout LLIL;
    public C223338pd LLILII;
    public SafeHandler LLILIL;
    public C62049OWv LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public TuxSheet LLILZLL;
    public XUQ LLIZ;
    public final XZG LLIZLLLIL;
    public final XZG LLJ;
    public final C73318Sq2 LLJI;
    public final C73318Sq2 LLJIJIL;
    public boolean LLJILJIL;
    public XZC LLJILJILJ;
    public XZC LLJILLL;
    public XZJ LLJJ;
    public MusicModel LLJJI;
    public final C62822Ol8 LLJJIII;
    public final C62822Ol8 LLJJIJI;
    public XW2 LLJJIJIIJIL;
    public XW2 LLJJIJIL;
    public final Map<XW2, Set<String>> LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final HashMap<String, MusicModel> LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public volatile String LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final XZD LLJLLIL;

    static {
        TBT tbt = new TBT(VerticalMusicView.class, "recentMusicApi", "getRecentMusicApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicTabApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLJZ = new InterfaceC74236TBo[]{tbt};
        LLJLLL = new XZ5();
        LLJZIJLIL = 30;
    }

    public final void LJJIJIIJIL() {
        this.LLJJJJLIIL = false;
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_play_fill);
        } else {
            o.LJIJI("bottomPlayView");
            throw null;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void LIZIZ() {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
        if (extractAVMusic != null && extractAVMusic.isSpeechToSong()) {
            StsAssetModel stsAssetModel = this.LLIZLLLIL.LJIILIIL;
            if (stsAssetModel != null) {
                this.LJLILLLLZI.T9(stsAssetModel, extractAVMusic.getLocalMusicDuration());
                return;
            }
            return;
        }
        TuxSheet tuxSheet = this.LLILZLL;
        if ((tuxSheet != null && tuxSheet.isVisible()) || this.LLIZLLLIL.LJIIL.getMusicStatus() != 13) {
            return;
        }
        this.LLIZLLLIL.LJIIL.setMusicStatus(11);
        this.LLIZLLLIL.LJIIL.setMusicId("");
        this.LLIZLLLIL.LJIIL.setName(C86V.LJFF(R.string.rhu));
        this.LLIZLLLIL.LJIILIIL = null;
    }

    @Override // X.InterfaceC133285Ky
    public final void LIZJ() {
        if (this.LLJJJJ) {
            this.LLJJJJ = false;
            this.LLJJJJJIL = true;
            C149795uJ c149795uJ = this.LJLLILLLL;
            if (c149795uJ != null) {
                if (c149795uJ.LIZ && !c149795uJ.LJ) {
                    c149795uJ.LIZLLL = 1.0f;
                }
                LJJIJL();
                return;
            }
            o.LJIJI("originSoundParams");
            throw null;
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void LJ() {
        LIZLLL(this.LJLILLLLZI.R9());
        LJJIJL();
    }

    public final void LJII() {
        C223338pd c223338pd = this.LLILII;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
        }
        C223338pd c223338pd2 = this.LLILII;
        if (c223338pd2 != null) {
            c223338pd2.LIZIZ();
        }
        LinearLayout linearLayout = this.LLIIZ;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        XZG xzg = this.LLJ;
        xzg.LJFF = true;
        xzg.LJI = null;
        XTV xtv = XTV.LJIIIZ;
        xtv.LIZ = new C84886XTe(this);
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            int i = xzh.LJI;
            if (!xtv.LJ) {
                xtv.LJ = true;
                xtv.LJFF = 0;
                XKX.LIZLLL(C780334l.LJLIL, null, null, new XTS(i, xtv, null), 3);
                return;
            }
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public final IMusicService LJIIJJI() {
        Object value = this.LLJJIII.getValue();
        o.LJIIIIZZ(value, "<get-musicService>(...)");
        return (IMusicService) value;
    }

    public final XZQ LJIIL() {
        return (XZQ) this.LLIIJLIL.LIZ(this, LLJZ[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r1 = new com.ss.android.ugc.effectmanager.effect.model.Effect(null, 1, null);
        r1.setName(r7);
        r1.setEffectId(r9);
        r10.LJIILIIL = new com.ss.android.ugc.aweme.services.audio.StsAssetModel(r1, r8, r5);
        r1 = r11.LLIZLLLIL;
        r1.getClass();
        kotlin.jvm.internal.o.LJIIIZ(r3, "<set-?>");
        r1.LJIIL = r3;
        r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) X.ORZ.LJLLLL(r11.LLIZLLLIL.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
    
        if (r0.isSpeechToSong() != true) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        r0 = r11.LLIZLLLIL;
        com.bytedance.mt.protector.impl.collections.ListProtector.set(r0.LIZ, 0, r0.LJIIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ff, code lost:
    
        X.C135015Rp.LIZ(r11.LJLILLLLZI.LLLLIL());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
    
        r0 = r11.LLIZLLLIL;
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r0.LIZ, 0, r0.LJIIL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b9, code lost:
    
        r0 = r1.stsTemplateId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bb, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00bd, code lost:
    
        r5 = r1.stsWarp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00bf, code lost:
    
        if (r5 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0115, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00b0, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView.LJIJJLI():void");
    }

    public final void LJJIIZ() {
        TK7 tk7;
        XZX.LIZ = "-1";
        C149795uJ c149795uJ = this.LJLLILLLL;
        if (c149795uJ != null) {
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                xzh.LJIILJJIL.T9(c149795uJ);
                if (C52908Kpc.LIZ()) {
                    T3A t3a = this.LLIIL;
                    if (t3a != null) {
                        t3a.LIZJ();
                    }
                    View view = this.LJLZ;
                    if (view != null) {
                        if ((view instanceof T3A) && (tk7 = (TK7) view) != null) {
                            tk7.LIZJ();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("retryViewAI");
                    throw null;
                }
                return;
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("originSoundParams");
        throw null;
    }

    public final void LJJIJIL() {
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            if (!xzh.LJIIL) {
                return;
            }
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
            if (extractAVMusic != null) {
                RelativeLayout relativeLayout = this.LJZL;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                    if (extractAVMusic.musicType == MusicModel.MusicType.VIDEO_EXTRACT.ordinal()) {
                        C81232VuO c81232VuO = this.LLFFF;
                        if (c81232VuO != null) {
                            c81232VuO.LIZJ(extractAVMusic.getLocalThumbPath());
                        } else {
                            o.LJIJI("bottomIcon");
                            throw null;
                        }
                    } else if (extractAVMusic.musicType == MusicModel.MusicType.LOCAL_SCAN.ordinal()) {
                        if (extractAVMusic.getLocalThumbPath() != null) {
                            C81232VuO c81232VuO2 = this.LLFFF;
                            if (c81232VuO2 != null) {
                                c81232VuO2.LIZIZ(UriProtector.parse(extractAVMusic.getLocalThumbPath()));
                            } else {
                                o.LJIJI("bottomIcon");
                                throw null;
                            }
                        } else {
                            C81232VuO c81232VuO3 = this.LLFFF;
                            if (c81232VuO3 != null) {
                                XZH xzh2 = this.LJLJL;
                                if (xzh2 != null) {
                                    c81232VuO3.LIZ(xzh2.LIZLLL.getDrawable(R.drawable.b0n));
                                } else {
                                    o.LJIJI("params");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("bottomIcon");
                                throw null;
                            }
                        }
                    } else {
                        String picMedium = extractAVMusic.getPicMedium();
                        if (picMedium != null) {
                            C81232VuO c81232VuO4 = this.LLFFF;
                            if (c81232VuO4 != null) {
                                c81232VuO4.LIZLLL(picMedium);
                            } else {
                                o.LJIJI("bottomIcon");
                                throw null;
                            }
                        }
                    }
                    String musicName = extractAVMusic.getMusicName();
                    if (musicName != null) {
                        TuxTextView tuxTextView = this.LLFII;
                        if (tuxTextView != null) {
                            tuxTextView.setText(musicName);
                        } else {
                            o.LJIJI("bottomTitle");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("bottomMusicView");
                    throw null;
                }
            }
            C81232VuO c81232VuO5 = this.LLFFF;
            if (c81232VuO5 != null) {
                c81232VuO5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 138)));
                TuxIconView tuxIconView = this.LLI;
                if (tuxIconView != null) {
                    C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 139));
                    LJJIL();
                    TuxIconView tuxIconView2 = this.LLFZ;
                    if (tuxIconView2 != null) {
                        C16880lQ.LJJJ(tuxIconView2, new ACListenerS35S0100000_15(this, UserLevelGeckoUpdateSetting.DEFAULT));
                        AVMusic extractAVMusic2 = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
                        if (extractAVMusic2 != null && C78915Uy7.LJJIJIL(extractAVMusic2).isLocalMusic()) {
                            TuxIconView tuxIconView3 = this.LLFZ;
                            if (tuxIconView3 != null) {
                                tuxIconView3.setAlpha(0.6f);
                                return;
                            } else {
                                o.LJIJI("bottomFavorite");
                                throw null;
                            }
                        }
                        TuxIconView tuxIconView4 = this.LLFZ;
                        if (tuxIconView4 != null) {
                            tuxIconView4.setAlpha(1.0f);
                            return;
                        } else {
                            o.LJIJI("bottomFavorite");
                            throw null;
                        }
                    }
                    o.LJIJI("bottomFavorite");
                    throw null;
                }
                o.LJIJI("bottomCancel");
                throw null;
            }
            o.LJIJI("bottomIcon");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x009f, code lost:
    
        if (r0.LJI != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView.LJJIJL():void");
    }

    public final void LJJIJLIJ() {
        boolean z;
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            if (!xzh.LJIIL) {
                return;
            }
            for (Map.Entry<String, MusicModel> entry : this.LLJJL.entrySet()) {
                String key = entry.getKey();
                MusicModel value = entry.getValue();
                boolean z2 = false;
                if (value.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
                    z = true;
                } else {
                    z = false;
                }
                MusicModel.CollectionType type = value.getCollectionType();
                o.LJIIIIZZ(type, "type");
                Iterator<MusicModel> it = this.LLIZLLLIL.LIZ.iterator();
                while (it.hasNext()) {
                    MusicModel next = it.next();
                    if (o.LJ(next.getMusicId(), key)) {
                        next.setCollectionType(type);
                    }
                }
                if (this.LLJJIJIIJIL == XW2.TAB_COLLECT) {
                    z2 = true;
                }
                LJJ(value, type, z2);
                if (key != null) {
                    C133295Kz.LIZ.put(key, Boolean.valueOf(z));
                }
                this.LLJLILLLLZIIL = true;
            }
            XZC xzc = this.LLJILJILJ;
            if (xzc != null) {
                xzc.notifyDataSetChanged();
            }
            XZC xzc2 = this.LLJILLL;
            if (xzc2 != null) {
                xzc2.notifyDataSetChanged();
            }
            XZJ xzj = this.LLJJ;
            if (xzj != null) {
                xzj.notifyDataSetChanged();
                return;
            }
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJIL() {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
        if (extractAVMusic != null) {
            if (extractAVMusic.isCollected()) {
                TuxIconView tuxIconView = this.LLFZ;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_bookmark_fill);
                    return;
                } else {
                    o.LJIJI("bottomFavorite");
                    throw null;
                }
            }
            TuxIconView tuxIconView2 = this.LLFZ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_bookmark);
            } else {
                o.LJIJI("bottomFavorite");
                throw null;
            }
        }
    }

    public final void LJJIZ() {
        int i;
        MusicModel musicModel;
        MusicModel musicModel2;
        MusicModel musicModel3;
        ArrayList<MusicModel> arrayList = this.LLIZLLLIL.LIZ;
        if (arrayList == null || arrayList.isEmpty()) {
            this.LLIZLLLIL.LJI = Boolean.FALSE;
            LJJJ(false);
            return;
        }
        XZC xzc = this.LLJILJILJ;
        if (xzc == null) {
            XZA xza = new XZA(this);
            InterfaceC149485to Z9 = this.LJLILLLLZI.Z9();
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                this.LLJILJILJ = new XZC(xza, Z9, xzh.LIZ, new XZK(this));
                if (this.LJLJL != null) {
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                    RecyclerView recyclerView = this.LJLJJL;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(wrapLinearLayoutManager);
                        RecyclerView recyclerView2 = this.LJLJJL;
                        if (recyclerView2 != null) {
                            recyclerView2.setVisibility(0);
                            RecyclerView recyclerView3 = this.LJLJJL;
                            if (recyclerView3 != null) {
                                recyclerView3.setAdapter(this.LLJILJILJ);
                                XZC xzc2 = this.LLJILJILJ;
                                if (xzc2 != null) {
                                    xzc2.setData(this.LLIZLLLIL.LIZ);
                                }
                                XZC xzc3 = this.LLJILJILJ;
                                if (xzc3 != null) {
                                    xzc3.notifyDataSetChanged();
                                }
                                if (!this.LLIZLLLIL.LIZLLL) {
                                    XZC xzc4 = this.LLJILJILJ;
                                    if (xzc4 != null) {
                                        xzc4.setLoadEmptyText((CharSequence) null);
                                    }
                                    XZC xzc5 = this.LLJILJILJ;
                                    if (xzc5 != null) {
                                        xzc5.showLoadMoreEmpty();
                                    }
                                }
                                C223338pd c223338pd = this.LLIILII;
                                if (c223338pd != null) {
                                    c223338pd.setVisibility(8);
                                }
                                LinearLayout linearLayout = this.LLIILZL;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                                XZC xzc6 = this.LLJILJILJ;
                                if (xzc6 != null) {
                                    xzc6.setLoadMoreListener(new AqS157S0100000_7(new XZ3(this), 616));
                                }
                                XZH xzh2 = this.LJLJL;
                                if (xzh2 != null) {
                                    if (xzh2.LJIIJJI && MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ()) == null && this.LLIZLLLIL.LIZ.size() > 3) {
                                        if (C167486hk.LIZ() && this.LJLILLLLZI.P9() && (musicModel2 = (MusicModel) ORZ.LJLLLL(this.LLIZLLLIL.LIZ)) != null && musicModel2.isSpeechToSong() && (musicModel3 = (MusicModel) ORZ.LJLLLL(this.LLIZLLLIL.LIZ)) != null && musicModel3.getMusicStatus() == 11) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        XZC xzc7 = this.LLJILJILJ;
                                        if (xzc7 != null) {
                                            xzc7.LJZ(i);
                                        }
                                        String musicId = ((MusicModel) ListProtector.get(this.LLIZLLLIL.LIZ, i)).getMusicId();
                                        if (musicId == null) {
                                            musicId = "";
                                        }
                                        this.LLJLIL = musicId;
                                        MusicModel musicModel4 = (MusicModel) ListProtector.get(this.LLIZLLLIL.LIZ, i);
                                        this.LLJJI = musicModel4;
                                        if (musicModel4 != null) {
                                            if (C53235Kut.LIZ()) {
                                                XZH xzh3 = this.LJLJL;
                                                if (xzh3 != null) {
                                                    if (!xzh3.LJIIIIZZ && this.LJLJI != null && ((musicModel = this.LLJJI) == null || !musicModel.isSpeechToSong())) {
                                                        if (LJIILLIIL(this.LLJJI)) {
                                                            LJIJI(musicModel4);
                                                            XUQ xuq = this.LLIZ;
                                                            if (xuq != null) {
                                                                ((MusicDownloadPlayHelper) xuq).LJLLI = false;
                                                            }
                                                            LJJJJ(musicModel4, true);
                                                            return;
                                                        }
                                                        XZE xze = this.LJLJI;
                                                        if (xze != null) {
                                                            Context context = xze.getContext();
                                                            o.LJIIIIZZ(context, "thisView.context");
                                                            if (!C48203Ivv.LJ(context)) {
                                                                XZE xze2 = this.LJLJI;
                                                                if (xze2 != null) {
                                                                    C26045AKb c26045AKb = new C26045AKb(xze2);
                                                                    c26045AKb.LJIIIIZZ(R.string.img);
                                                                    c26045AKb.LJIIJ();
                                                                    XZC xzc8 = this.LLJILJILJ;
                                                                    if (xzc8 == null) {
                                                                        return;
                                                                    }
                                                                    xzc8.LJLJJL = -1;
                                                                    xzc8.notifyDataSetChanged();
                                                                    return;
                                                                }
                                                                o.LJIJI("thisView");
                                                                throw null;
                                                            }
                                                            XUQ xuq2 = this.LLIZ;
                                                            if (xuq2 != null) {
                                                                ((MusicDownloadPlayHelper) xuq2).LJLLI = false;
                                                            }
                                                            LJIJI(musicModel4);
                                                            LJIL(-10, musicModel4, XW2.TAB_AI);
                                                            return;
                                                        }
                                                        o.LJIJI("thisView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("params");
                                                    throw null;
                                                }
                                            }
                                            LJJJJ(musicModel4, true);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("params");
                                throw null;
                            }
                            o.LJIJI("aiRecycerView");
                            throw null;
                        }
                        o.LJIJI("aiRecycerView");
                        throw null;
                    }
                    o.LJIJI("aiRecycerView");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("params");
            throw null;
        }
        xzc.setDataAfterLoadMore(this.LLIZLLLIL.LIZ);
        C223338pd c223338pd2 = this.LLIILII;
        if (c223338pd2 != null) {
            c223338pd2.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.LLIILZL;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XZH xzh4 = this.LJLJL;
        if (xzh4 != null) {
            new SafeHandler(xzh4.LJ).post(new ARunnableS51S0100000_15(this, 48));
        } else {
            o.LJIJI("params");
            throw null;
        }
    }

    public final void LJJJJIZL() {
        if (this.LLIZLLLIL.LJIIJJI.length() > 0) {
            this.LJLILLLLZI.E5((IStsPrepareHelper) this.LLJJIJI.getValue(), this.LLIZLLLIL.LJIIJJI);
        }
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            recyclerView.post(new ARunnableS51S0100000_15(this, 50));
        } else {
            o.LJIJI("aiRecycerView");
            throw null;
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void destroy() {
        Lifecycle lifecycle;
        XTV xtv = XTV.LJIIIZ;
        xtv.LIZ = null;
        xtv.LIZIZ = null;
        xtv.LIZLLL = null;
        xtv.LJII.LIZ = true;
        LJIIJJI().LJJJLZIJ(null);
        this.LLJI.dispose();
        this.LLJIJIL.dispose();
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            if (xzh.LJIIL) {
                C42625Go9.LIZJ(this);
                TuxSheet tuxSheet = this.LLILZLL;
                if (tuxSheet != null && (lifecycle = tuxSheet.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                }
            }
            XUQ xuq = this.LLIZ;
            if (xuq != null) {
                xuq.onDestroy();
                return;
            }
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLFF != null) {
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                if (!xzh.LJIIL) {
                    return;
                }
                LJJIJIIJIL();
                return;
            }
            o.LJIJI("params");
            throw null;
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void refresh() {
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            if (!xzh.LJIIL) {
                return;
            }
            LJJIJLIJ();
            LJJIJIL();
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    @Override // X.InterfaceC133285Ky
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView.show():void");
    }

    @Override // X.InterfaceC133285Ky
    public final void LJFF() {
        if (C167486hk.LIZ() && this.LJLILLLLZI.P9() && this.LLIZLLLIL.LJIIL.getMusicStatus() == 10) {
            MusicModel musicModel = (MusicModel) ORZ.LJLLLL(this.LLIZLLLIL.LIZ);
            if (musicModel != null && musicModel.isSpeechToSong()) {
                this.LLIZLLLIL.LJIIL.setMusicStatus(13);
            } else {
                XZG xzg = this.LLIZLLLIL;
                ListProtector.add(xzg.LIZ, 0, xzg.LJIIL);
                this.LLIZLLLIL.LJIIL.setMusicStatus(11);
            }
            XZC xzc = this.LLJILJILJ;
            if (xzc != null) {
                xzc.setData(this.LLIZLLLIL.LIZ);
            }
            XZC xzc2 = this.LLJILJILJ;
            if (xzc2 != null) {
                xzc2.notifyDataSetChanged();
            }
            C135015Rp.LIZ(this.LJLILLLLZI.LLLLIL());
        }
    }

    public final void LJIILIIL() {
        XZQ LJIIL = LJIIL();
        if (LJIIL != null) {
            if (LJIIL.Kt()) {
                LJJJJJL(true);
            }
            this.LLJI.LIZ(LJIIL.dm().LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS67S0100000_15(this, 49), new AfS67S0100000_15(this, 50)));
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void hide() {
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_shoot");
        LJJIIZ();
        TuxSheet tuxSheet = this.LLILZLL;
        if (tuxSheet == null) {
            return;
        }
        o.LJI(tuxSheet);
        tuxSheet.dismiss();
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("music_panel_show", false);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC133285Ky
    public final void pause() {
        LJJIJIIJIL();
    }

    public static boolean LJIILLIIL(MusicModel musicModel) {
        String str;
        UrlModel url;
        List<String> urlList;
        XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
        if (LIZ != null) {
            if (musicModel != null && (url = musicModel.getUrl()) != null && (urlList = url.getUrlList()) != null) {
                str = (String) ORZ.LJLLLL(urlList);
            } else {
                str = null;
            }
            if (LIZ.LIZJ(str)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIJI(MusicModel musicModel) {
        String str;
        List<String> urlList;
        XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
        if (LIZ != null) {
            UrlModel url = musicModel.getUrl();
            if (url != null && (urlList = url.getUrlList()) != null) {
                str = (String) ORZ.LJLLLL(urlList);
            } else {
                str = null;
            }
            LIZ.LJ(-1L, str, musicModel.getMusicId(), true);
        }
    }

    @Override // X.InterfaceC133285Ky
    public final void LIZ(XZH xzh) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        View findViewById;
        boolean z;
        boolean z2;
        View view;
        View view2;
        int i;
        IAnotherMusicService iAnotherMusicService;
        if (xzh.LJIIL) {
            C42625Go9.LIZIZ(this);
        }
        this.LJLJL = xzh;
        this.LLJJJJ = xzh.LJIIJ;
        this.LLILIL = new SafeHandler(xzh.LJ);
        HNW LJJIJ = C60903NvH.LJIIJJI().LJJIJ();
        if ((LJJIJ instanceof IAnotherMusicService) && (iAnotherMusicService = (IAnotherMusicService) LJJIJ) != null) {
            iAnotherMusicService.LJIJI();
            this.LJLJI = new XZE(xzh.LJIIL, this.LJLILLLLZI, xzh.LJIILL, this.LLJJIJIIJIL, xzh.LIZLLL);
        }
        XZE xze = this.LJLJI;
        if (xze != null) {
            View findViewById2 = xze.findViewById(R.id.kzb);
            o.LJIIIIZZ(findViewById2, "thisView.findViewById(R.id.tablayout)");
            this.LJLJLJ = (C80698Vlm) findViewById2;
            XZE xze2 = this.LJLJI;
            if (xze2 != null) {
                View findViewById3 = xze2.findViewById(R.id.ne9);
                o.LJIIIIZZ(findViewById3, "thisView.findViewById(R.id.volume_view)");
                this.LJLLJ = (LinearLayout) findViewById3;
                XZE xze3 = this.LJLJI;
                if (xze3 != null) {
                    View findViewById4 = xze3.findViewById(R.id.lu8);
                    o.LJIIIIZZ(findViewById4, "thisView.findViewById(R.id.tux_checkbox)");
                    this.LJLJLLL = (C71897SJp) findViewById4;
                    XZE xze4 = this.LJLJI;
                    if (xze4 != null) {
                        View findViewById5 = xze4.findViewById(R.id.lu9);
                        o.LJIIIIZZ(findViewById5, "thisView.findViewById(R.id.tux_checkbox_text)");
                        this.LJLL = (TextView) findViewById5;
                        XZE xze5 = this.LJLJI;
                        if (xze5 != null) {
                            View findViewById6 = xze5.findViewById(R.id.lu_);
                            o.LJIIIIZZ(findViewById6, "thisView.findViewById(R.id.tux_checkbox_text_p)");
                            this.LJLLI = (RelativeLayout) findViewById6;
                            XZE xze6 = this.LJLJI;
                            if (xze6 != null) {
                                View findViewById7 = xze6.findViewById(R.id.d_j);
                                o.LJIIIIZZ(findViewById7, "thisView.findViewById(R.id.find_more)");
                                this.LJLLL = (LinearLayout) findViewById7;
                                XZE xze7 = this.LJLJI;
                                if (xze7 != null) {
                                    View findViewById8 = xze7.findViewById(R.id.m6r);
                                    o.LJIIIIZZ(findViewById8, "thisView.findViewById(R.id.tv_find_more)");
                                    this.LJLLLL = findViewById8;
                                    XZE xze8 = this.LJLJI;
                                    if (xze8 != null) {
                                        View findViewById9 = xze8.findViewById(R.id.lb1);
                                        o.LJIIIIZZ(findViewById9, "thisView.findViewById(R.id.tiv_find_more)");
                                        this.LJLLLLLL = (TuxIconView) findViewById9;
                                        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dsy, C16880lQ.LLZIL(xzh.LIZLLL), null);
                                        if (!(LLLZIIL instanceof FrameLayout) || (frameLayout = (FrameLayout) LLLZIIL) == null) {
                                            frameLayout = new FrameLayout(xzh.LIZLLL);
                                        }
                                        this.LJZI = frameLayout;
                                        View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.dsz, C16880lQ.LLZIL(xzh.LIZLLL), null);
                                        if (!(LLLZIIL2 instanceof FrameLayout) || (frameLayout2 = (FrameLayout) LLLZIIL2) == null) {
                                            frameLayout2 = new FrameLayout(xzh.LIZLLL);
                                        }
                                        this.LLF = frameLayout2;
                                        View LLLZIIL3 = C16880lQ.LLLZIIL(R.layout.dt0, C16880lQ.LLZIL(xzh.LIZLLL), null);
                                        if (!(LLLZIIL3 instanceof FrameLayout) || (frameLayout3 = (FrameLayout) LLLZIIL3) == null) {
                                            frameLayout3 = new FrameLayout(xzh.LIZLLL);
                                        }
                                        this.LLIIII = frameLayout3;
                                        FrameLayout frameLayout4 = this.LJZI;
                                        if (frameLayout4 != null) {
                                            View findViewById10 = frameLayout4.findViewById(R.id.j_u);
                                            o.LJIIIIZZ(findViewById10, "viewGroupAI.findViewById…d.rvw_ai_music_container)");
                                            RecyclerView recyclerView = (RecyclerView) findViewById10;
                                            this.LJLJJL = recyclerView;
                                            recyclerView.setItemAnimator(null);
                                            RecyclerView recyclerView2 = this.LJLJJL;
                                            if (recyclerView2 != null) {
                                                int i2 = 1;
                                                recyclerView2.LJII(new C119684mq(i2), -1);
                                                if (C52908Kpc.LIZ()) {
                                                    FrameLayout frameLayout5 = this.LJZI;
                                                    if (frameLayout5 != null) {
                                                        findViewById = LJIIIIZZ(frameLayout5, new AqS181S0100000_15(this, 155));
                                                    } else {
                                                        o.LJIJI("viewGroupAI");
                                                        throw null;
                                                    }
                                                } else {
                                                    FrameLayout frameLayout6 = this.LJZI;
                                                    if (frameLayout6 != null) {
                                                        findViewById = frameLayout6.findViewById(R.id.kfa);
                                                        ((C73305Spp) findViewById).setButtonTopMargin(KL2.LIZJ(xzh.LIZLLL, 20.0f));
                                                        o.LJIIIIZZ(findViewById, "{\n            viewGroupA…)\n            }\n        }");
                                                    } else {
                                                        o.LJIJI("viewGroupAI");
                                                        throw null;
                                                    }
                                                }
                                                this.LJLZ = findViewById;
                                                if (QXF.LIZLLL() && C77275UUl.LJIIIIZZ(2, 3, 4).contains(Integer.valueOf(QXF.LIZIZ()))) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    FrameLayout frameLayout7 = this.LJZI;
                                                    if (frameLayout7 != null) {
                                                        this.LLIILZL = (LinearLayout) frameLayout7.findViewById(R.id.k25);
                                                        FrameLayout frameLayout8 = this.LLF;
                                                        if (frameLayout8 != null) {
                                                            this.LLIIZ = (LinearLayout) frameLayout8.findViewById(R.id.k26);
                                                            FrameLayout frameLayout9 = this.LLIIII;
                                                            if (frameLayout9 != null) {
                                                                this.LLIL = (LinearLayout) frameLayout9.findViewById(R.id.k27);
                                                            } else {
                                                                o.LJIJI("viewGroupRecent");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("viewGroupCollect");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("viewGroupAI");
                                                        throw null;
                                                    }
                                                } else {
                                                    FrameLayout frameLayout10 = this.LJZI;
                                                    if (frameLayout10 != null) {
                                                        this.LLIILII = (C223338pd) frameLayout10.findViewById(R.id.g8y);
                                                        FrameLayout frameLayout11 = this.LLF;
                                                        if (frameLayout11 != null) {
                                                            this.LLILII = (C223338pd) frameLayout11.findViewById(R.id.g8z);
                                                            FrameLayout frameLayout12 = this.LLIIII;
                                                            if (frameLayout12 != null) {
                                                                this.LLIIIZ = (C223338pd) frameLayout12.findViewById(R.id.g91);
                                                            } else {
                                                                o.LJIJI("viewGroupRecent");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("viewGroupCollect");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("viewGroupAI");
                                                        throw null;
                                                    }
                                                }
                                                FrameLayout frameLayout13 = this.LLF;
                                                if (frameLayout13 != null) {
                                                    View findViewById11 = frameLayout13.findViewById(R.id.j_v);
                                                    o.LJIIIIZZ(findViewById11, "viewGroupCollect.findVie…_collect_music_container)");
                                                    C161806Wq c161806Wq = (C161806Wq) findViewById11;
                                                    this.LJLJJLL = c161806Wq;
                                                    c161806Wq.LJII(new C119684mq(i2), -1);
                                                    FrameLayout frameLayout14 = this.LLF;
                                                    if (frameLayout14 != null) {
                                                        View findViewById12 = frameLayout14.findViewById(R.id.kfb);
                                                        o.LJIIIIZZ(findViewById12, "viewGroupCollect.findVie…R.id.status_view_collect)");
                                                        this.LJZ = (C73305Spp) findViewById12;
                                                        FrameLayout frameLayout15 = this.LLIIII;
                                                        if (frameLayout15 != null) {
                                                            View findViewById13 = frameLayout15.findViewById(R.id.j_y);
                                                            o.LJIIIIZZ(findViewById13, "viewGroupRecent.findView…w_recent_music_container)");
                                                            C161806Wq c161806Wq2 = (C161806Wq) findViewById13;
                                                            this.LLIIJI = c161806Wq2;
                                                            c161806Wq2.LJII(new C119684mq(i2), -1);
                                                            FrameLayout frameLayout16 = this.LLIIII;
                                                            if (frameLayout16 != null) {
                                                                View findViewById14 = frameLayout16.findViewById(R.id.kfo);
                                                                o.LJIIIIZZ(findViewById14, "viewGroupRecent.findView…(R.id.status_view_recent)");
                                                                this.LLIIIILZ = (C73305Spp) findViewById14;
                                                                FrameLayout frameLayout17 = this.LLIIII;
                                                                if (frameLayout17 != null) {
                                                                    View findViewById15 = frameLayout17.findViewById(R.id.cvz);
                                                                    o.LJIIIIZZ(findViewById15, "viewGroupRecent.findView…d(R.id.empty_view_recent)");
                                                                    this.LLIIIJ = (TuxTextView) findViewById15;
                                                                    XZE xze9 = this.LJLJI;
                                                                    if (xze9 != null) {
                                                                        View findViewById16 = xze9.findViewById(R.id.aow);
                                                                        o.LJIIIIZZ(findViewById16, "thisView.findViewById(R.id.bottom_bar_music)");
                                                                        this.LJZL = (RelativeLayout) findViewById16;
                                                                        XZE xze10 = this.LJLJI;
                                                                        if (xze10 != null) {
                                                                            View findViewById17 = xze10.findViewById(R.id.gtz);
                                                                            o.LJIIIIZZ(findViewById17, "thisView.findViewById(R.id.music_tab_rl)");
                                                                            this.LL = (RelativeLayout) findViewById17;
                                                                            XZE xze11 = this.LJLJI;
                                                                            if (xze11 != null) {
                                                                                View findViewById18 = xze11.findViewById(R.id.aot);
                                                                                o.LJIIIIZZ(findViewById18, "thisView.findViewById(R.id.bottom_bar)");
                                                                                this.LLD = findViewById18;
                                                                                XZE xze12 = this.LJLJI;
                                                                                if (xze12 != null) {
                                                                                    View findViewById19 = xze12.findViewById(R.id.hrn);
                                                                                    o.LJIIIIZZ(findViewById19, "thisView.findViewById(R.id.play_button)");
                                                                                    this.LLFF = (TuxIconView) findViewById19;
                                                                                    XZE xze13 = this.LJLJI;
                                                                                    if (xze13 != null) {
                                                                                        View findViewById20 = xze13.findViewById(R.id.eu7);
                                                                                        o.LJIIIIZZ(findViewById20, "thisView.findViewById(R.id.item_img)");
                                                                                        this.LLFFF = (C81232VuO) findViewById20;
                                                                                        XZE xze14 = this.LJLJI;
                                                                                        if (xze14 != null) {
                                                                                            View findViewById21 = xze14.findViewById(R.id.title);
                                                                                            o.LJIIIIZZ(findViewById21, "thisView.findViewById(R.id.title)");
                                                                                            this.LLFII = (TuxTextView) findViewById21;
                                                                                            XZE xze15 = this.LJLJI;
                                                                                            if (xze15 != null) {
                                                                                                View findViewById22 = xze15.findViewById(R.id.d5k);
                                                                                                o.LJIIIIZZ(findViewById22, "thisView.findViewById(R.id.favorites)");
                                                                                                this.LLFZ = (TuxIconView) findViewById22;
                                                                                                XZE xze16 = this.LJLJI;
                                                                                                if (xze16 != null) {
                                                                                                    View findViewById23 = xze16.findViewById(R.id.b3n);
                                                                                                    o.LJIIIIZZ(findViewById23, "thisView.findViewById(R.id.cancel)");
                                                                                                    this.LLI = (TuxIconView) findViewById23;
                                                                                                    XZE xze17 = this.LJLJI;
                                                                                                    if (xze17 != null) {
                                                                                                        View findViewById24 = xze17.findViewById(R.id.aqd);
                                                                                                        o.LJIIIIZZ(findViewById24, "thisView.findViewById(R.id.bottom_line)");
                                                                                                        this.LLIFFJFJJ = findViewById24;
                                                                                                        XZE xze18 = this.LJLJI;
                                                                                                        if (xze18 != null) {
                                                                                                            View findViewById25 = xze18.findViewById(R.id.avl);
                                                                                                            o.LJIIIIZZ(findViewById25, "thisView.findViewById(R.id.btn_close)");
                                                                                                            this.LLII = findViewById25;
                                                                                                            XZE xze19 = this.LJLJI;
                                                                                                            if (xze19 != null) {
                                                                                                                View findViewById26 = xze19.findViewById(R.id.j3z);
                                                                                                                o.LJIIIIZZ(findViewById26, "thisView.findViewById(R.id.rl2)");
                                                                                                                this.LLILL = (C62049OWv) findViewById26;
                                                                                                                if (C52908Kpc.LIZ()) {
                                                                                                                    FrameLayout frameLayout18 = this.LLIIII;
                                                                                                                    if (frameLayout18 != null) {
                                                                                                                        this.LLIIIL = LJIIIIZZ(frameLayout18, new AqS181S0100000_15(this, 156));
                                                                                                                    } else {
                                                                                                                        o.LJIJI("viewGroupRecent");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (QXF.LIZJ()) {
                                                                                                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C7MY.LIZIZ(58));
                                                                                                                    RelativeLayout relativeLayout = this.LL;
                                                                                                                    if (relativeLayout != null) {
                                                                                                                        relativeLayout.setLayoutParams(layoutParams);
                                                                                                                    } else {
                                                                                                                        o.LJIJI("musicTabView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (xzh.LJIIL) {
                                                                                                                    RelativeLayout relativeLayout2 = this.LJZL;
                                                                                                                    if (relativeLayout2 != null) {
                                                                                                                        relativeLayout2.setVisibility(0);
                                                                                                                        View view3 = this.LLD;
                                                                                                                        if (view3 != null) {
                                                                                                                            view3.setVisibility(8);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("bottomBarView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("bottomMusicView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    RelativeLayout relativeLayout3 = this.LJZL;
                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                        relativeLayout3.setVisibility(8);
                                                                                                                        View view4 = this.LLD;
                                                                                                                        if (view4 != null) {
                                                                                                                            view4.setVisibility(0);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("bottomBarView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("bottomMusicView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                LJJIJIL();
                                                                                                                if (xzh.LJIIL && xzh.LJIILIIL) {
                                                                                                                    View view5 = this.LLII;
                                                                                                                    if (view5 != null) {
                                                                                                                        C16880lQ.LJIIJ(new ACListenerS49S0200000_15(this, xzh, 20), view5);
                                                                                                                    } else {
                                                                                                                        o.LJIJI("btnClose");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    View view6 = this.LLII;
                                                                                                                    if (view6 != null) {
                                                                                                                        view6.setVisibility(8);
                                                                                                                        LinearLayout linearLayout = this.LJLLL;
                                                                                                                        if (linearLayout != null) {
                                                                                                                            C26338AVi.LJI(linearLayout, 0, Integer.valueOf((int) KL2.LIZJ(xzh.LIZLLL, 15.0f)), Integer.valueOf((int) KL2.LIZJ(xzh.LIZLLL, 16.0f)), 0, false, 16);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("findMore");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("btnClose");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (K2Z.LIZ() == 2 || K2Z.LIZ() == 3 || K2Z.LIZ() == 4) {
                                                                                                                    z2 = true;
                                                                                                                } else {
                                                                                                                    z2 = false;
                                                                                                                }
                                                                                                                if (z2) {
                                                                                                                    View view7 = this.LJLLLL;
                                                                                                                    if (view7 != null) {
                                                                                                                        view7.setVisibility(0);
                                                                                                                        TuxIconView tuxIconView = this.LJLLLLLL;
                                                                                                                        if (tuxIconView != null) {
                                                                                                                            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
                                                                                                                            layoutParams2.width = C7MY.LIZIZ(18);
                                                                                                                            layoutParams2.height = C7MY.LIZIZ(18);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("findMoreTuxIcon");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("findMoreCopy");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    View view8 = this.LJLLLL;
                                                                                                                    if (view8 != null) {
                                                                                                                        view8.setVisibility(8);
                                                                                                                        TuxIconView tuxIconView2 = this.LJLLLLLL;
                                                                                                                        if (tuxIconView2 != null) {
                                                                                                                            ViewGroup.LayoutParams layoutParams3 = tuxIconView2.getLayoutParams();
                                                                                                                            layoutParams3.width = C7MY.LIZIZ(24);
                                                                                                                            layoutParams3.height = C7MY.LIZIZ(24);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("findMoreTuxIcon");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("findMoreCopy");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                if (C52908Kpc.LIZ()) {
                                                                                                                    FrameLayout frameLayout19 = this.LLF;
                                                                                                                    if (frameLayout19 != null) {
                                                                                                                        this.LLIIL = LJIIIIZZ(frameLayout19, new AqS181S0100000_15(this, 157));
                                                                                                                    } else {
                                                                                                                        o.LJIJI("viewGroupCollect");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                C73305Spp c73305Spp = this.LJZ;
                                                                                                                if (c73305Spp != null) {
                                                                                                                    c73305Spp.setButtonTopMargin(KL2.LIZJ(xzh.LIZLLL, 20.0f));
                                                                                                                    C223338pd c223338pd = this.LLIILII;
                                                                                                                    if (c223338pd != null) {
                                                                                                                        c223338pd.setVisibility(0);
                                                                                                                    }
                                                                                                                    C223338pd c223338pd2 = this.LLIILII;
                                                                                                                    if (c223338pd2 != null) {
                                                                                                                        c223338pd2.LIZIZ();
                                                                                                                    }
                                                                                                                    LinearLayout linearLayout2 = this.LLIILZL;
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        linearLayout2.setVisibility(0);
                                                                                                                    }
                                                                                                                    C223338pd c223338pd3 = this.LLILII;
                                                                                                                    if (c223338pd3 != null) {
                                                                                                                        c223338pd3.setVisibility(0);
                                                                                                                    }
                                                                                                                    C223338pd c223338pd4 = this.LLILII;
                                                                                                                    if (c223338pd4 != null) {
                                                                                                                        c223338pd4.LIZIZ();
                                                                                                                    }
                                                                                                                    LinearLayout linearLayout3 = this.LLIIZ;
                                                                                                                    if (linearLayout3 != null) {
                                                                                                                        linearLayout3.setVisibility(0);
                                                                                                                    }
                                                                                                                    C223338pd c223338pd5 = this.LLIIIZ;
                                                                                                                    if (c223338pd5 != null) {
                                                                                                                        C78996UzQ.LJJJJL(c223338pd5);
                                                                                                                        c223338pd5.LIZIZ();
                                                                                                                    }
                                                                                                                    LinearLayout linearLayout4 = this.LLIL;
                                                                                                                    if (linearLayout4 != null) {
                                                                                                                        C78996UzQ.LJJJJL(linearLayout4);
                                                                                                                    }
                                                                                                                    this.LLIZ = LJIIJJI().LJJIIZ(this.LLJLLIL);
                                                                                                                    RecyclerView recyclerView3 = this.LJLJJL;
                                                                                                                    if (recyclerView3 != null) {
                                                                                                                        recyclerView3.LJIIJJI(new C29464BhM());
                                                                                                                        C161806Wq c161806Wq3 = this.LJLJJLL;
                                                                                                                        if (c161806Wq3 != null) {
                                                                                                                            c161806Wq3.LJIIJJI(new C29464BhM());
                                                                                                                            C161806Wq c161806Wq4 = this.LLIIJI;
                                                                                                                            if (c161806Wq4 != null) {
                                                                                                                                c161806Wq4.LJIIJJI(new C29464BhM());
                                                                                                                                LinearLayout linearLayout5 = this.LJLLJ;
                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                    C16880lQ.LJIIZILJ(linearLayout5, new ACListenerS35S0100000_15(xzh, 143));
                                                                                                                                    this.LJLLILLLL = xzh.LJIIIZ;
                                                                                                                                    if (((Number) L1D.LIZ.getValue()).intValue() == 3 || L1D.LIZ()) {
                                                                                                                                        LinearLayout linearLayout6 = this.LJLLL;
                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                            C82740Wdc.LIZIZ(linearLayout6);
                                                                                                                                            RelativeLayout relativeLayout4 = this.LJLLI;
                                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                                C82740Wdc.LIZIZ(relativeLayout4);
                                                                                                                                                LinearLayout linearLayout7 = this.LJLLJ;
                                                                                                                                                if (linearLayout7 != null) {
                                                                                                                                                    C82740Wdc.LIZIZ(linearLayout7);
                                                                                                                                                    LinearLayout linearLayout8 = this.LJLLL;
                                                                                                                                                    if (linearLayout8 != null) {
                                                                                                                                                        linearLayout8.getLayoutParams().width = C7MY.LIZIZ(56);
                                                                                                                                                        linearLayout8.getLayoutParams().height = -1;
                                                                                                                                                        C26338AVi.LJI(linearLayout8, 0, 0, 0, 0, false, 16);
                                                                                                                                                        linearLayout8.setGravity(17);
                                                                                                                                                        RelativeLayout relativeLayout5 = this.LJLLI;
                                                                                                                                                        if (relativeLayout5 != null) {
                                                                                                                                                            relativeLayout5.getLayoutParams().height = -1;
                                                                                                                                                            relativeLayout5.setGravity(1);
                                                                                                                                                            relativeLayout5.setPadding(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0);
                                                                                                                                                            LinearLayout linearLayout9 = this.LJLLJ;
                                                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                                                linearLayout9.setGravity(17);
                                                                                                                                                                linearLayout9.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), 0, 0, 0);
                                                                                                                                                            } else {
                                                                                                                                                                o.LJIJI("volumeView");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            o.LJIJI("tuxCheckBoxTextViewParent");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        o.LJIJI("findMore");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    o.LJIJI("volumeView");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                o.LJIJI("tuxCheckBoxTextViewParent");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            o.LJIJI("findMore");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    LinearLayout linearLayout10 = this.LJLLL;
                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                        C16880lQ.LJIIZILJ(linearLayout10, new ACListenerS49S0200000_15(this, xzh, 19));
                                                                                                                                        C80698Vlm c80698Vlm = this.LJLJLJ;
                                                                                                                                        if (c80698Vlm != null) {
                                                                                                                                            c80698Vlm.setTabMode(0);
                                                                                                                                            Context context = c80698Vlm.getContext();
                                                                                                                                            o.LJI(context);
                                                                                                                                            C170296mH c170296mH = new C170296mH(context);
                                                                                                                                            C164456cr LJIIL = c80698Vlm.LJIIL();
                                                                                                                                            LJIIL.LIZLLL = c170296mH;
                                                                                                                                            LJIIL.LIZIZ();
                                                                                                                                            c80698Vlm.LIZJ(LJIIL);
                                                                                                                                            c170296mH.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 145)));
                                                                                                                                            C164456cr LJIIJJI = c80698Vlm.LJIIJJI(0);
                                                                                                                                            if (LJIIJJI != null) {
                                                                                                                                                view = LJIIJJI.LIZLLL;
                                                                                                                                            } else {
                                                                                                                                                view = null;
                                                                                                                                            }
                                                                                                                                            C170296mH c170296mH2 = (C170296mH) view;
                                                                                                                                            if (c170296mH2 != null) {
                                                                                                                                                c170296mH2.setText(xzh.LIZLLL.getString(R.string.evj));
                                                                                                                                                c170296mH2.setTextPaddingLR(8.0f);
                                                                                                                                            }
                                                                                                                                            ActivityC45651qj activityC45651qj = xzh.LIZLLL;
                                                                                                                                            o.LJI(activityC45651qj);
                                                                                                                                            C170296mH c170296mH3 = new C170296mH(activityC45651qj);
                                                                                                                                            C164456cr LJIIL2 = c80698Vlm.LJIIL();
                                                                                                                                            LJIIL2.LIZLLL = c170296mH3;
                                                                                                                                            LJIIL2.LIZIZ();
                                                                                                                                            c80698Vlm.LIZJ(LJIIL2);
                                                                                                                                            c170296mH3.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS40S0300000_15(xzh, c80698Vlm, this, 2)));
                                                                                                                                            C164456cr LJIIJJI2 = c80698Vlm.LJIIJJI(1);
                                                                                                                                            if (LJIIJJI2 != null) {
                                                                                                                                                view2 = LJIIJJI2.LIZLLL;
                                                                                                                                            } else {
                                                                                                                                                view2 = null;
                                                                                                                                            }
                                                                                                                                            C170296mH c170296mH4 = (C170296mH) view2;
                                                                                                                                            if (c170296mH4 != null) {
                                                                                                                                                c170296mH4.setText(xzh.LIZLLL.getString(R.string.pdz));
                                                                                                                                                c170296mH4.setTextPaddingLR(8.0f);
                                                                                                                                            }
                                                                                                                                            if (C146615pB.LIZ() && !xzh.LJIJJ && BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getAccountType() != 3) {
                                                                                                                                                Context context2 = c80698Vlm.getContext();
                                                                                                                                                o.LJI(context2);
                                                                                                                                                C170296mH c170296mH5 = new C170296mH(context2);
                                                                                                                                                c170296mH5.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 146)));
                                                                                                                                                FFL.LJIIIZ().getClass();
                                                                                                                                                int LJIIJ = FFL.LJIIJ(31744, 0, "show_recently_used_music_tab", true);
                                                                                                                                                if (LJIIJ == 1 || LJIIJ != 2) {
                                                                                                                                                    i = R.string.puj;
                                                                                                                                                } else {
                                                                                                                                                    i = R.string.puk;
                                                                                                                                                }
                                                                                                                                                c170296mH5.setText(xzh.LIZLLL.getString(i));
                                                                                                                                                c170296mH5.setTextPaddingLR(8.0f);
                                                                                                                                                C164456cr LJIIL3 = c80698Vlm.LJIIL();
                                                                                                                                                LJIIL3.LIZLLL = c170296mH5;
                                                                                                                                                LJIIL3.LIZIZ();
                                                                                                                                                c80698Vlm.LIZJ(LJIIL3);
                                                                                                                                                Object parent = c170296mH5.getParent();
                                                                                                                                                o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ViewGroup.LayoutParams layoutParams4 = ((View) parent).getLayoutParams();
                                                                                                                                                o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                                                                                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                                                                                                                                                marginLayoutParams.leftMargin = 0;
                                                                                                                                                marginLayoutParams.rightMargin = 0;
                                                                                                                                                Object parent2 = c170296mH5.getParent();
                                                                                                                                                o.LJII(parent2, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ((View) parent2).setLayoutParams(marginLayoutParams);
                                                                                                                                            }
                                                                                                                                            C80698Vlm c80698Vlm2 = this.LJLJLJ;
                                                                                                                                            if (c80698Vlm2 != null) {
                                                                                                                                                c80698Vlm2.LJIILLIIL(c80698Vlm2.LJIIJJI(0));
                                                                                                                                                Object parent3 = c170296mH.getParent();
                                                                                                                                                o.LJII(parent3, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ViewGroup.LayoutParams layoutParams5 = ((View) parent3).getLayoutParams();
                                                                                                                                                o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                                                                                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
                                                                                                                                                marginLayoutParams2.leftMargin = 0;
                                                                                                                                                marginLayoutParams2.rightMargin = 0;
                                                                                                                                                Object parent4 = c170296mH.getParent();
                                                                                                                                                o.LJII(parent4, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ((View) parent4).setLayoutParams(marginLayoutParams2);
                                                                                                                                                Object parent5 = c170296mH3.getParent();
                                                                                                                                                o.LJII(parent5, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ViewGroup.LayoutParams layoutParams6 = ((View) parent5).getLayoutParams();
                                                                                                                                                o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                                                                                                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                                                                                                                                marginLayoutParams3.leftMargin = 0;
                                                                                                                                                marginLayoutParams3.rightMargin = 0;
                                                                                                                                                Object parent6 = c170296mH3.getParent();
                                                                                                                                                o.LJII(parent6, "null cannot be cast to non-null type android.view.View");
                                                                                                                                                ((View) parent6).setLayoutParams(marginLayoutParams3);
                                                                                                                                                XZF xzf = new XZF(this, xzh);
                                                                                                                                                C62049OWv c62049OWv = this.LLILL;
                                                                                                                                                if (c62049OWv != null) {
                                                                                                                                                    c62049OWv.LJLILLLLZI = QXF.LIZLLL();
                                                                                                                                                    C62049OWv c62049OWv2 = this.LLILL;
                                                                                                                                                    if (c62049OWv2 != null) {
                                                                                                                                                        c62049OWv2.setAdapter(xzf);
                                                                                                                                                        C62049OWv c62049OWv3 = this.LLILL;
                                                                                                                                                        if (c62049OWv3 != null) {
                                                                                                                                                            c62049OWv3.setCurrentItem(0);
                                                                                                                                                            C62049OWv c62049OWv4 = this.LLILL;
                                                                                                                                                            if (c62049OWv4 != null) {
                                                                                                                                                                c62049OWv4.addOnPageChangeListener(new IDiS167S0200000_15(xzh, this, 1));
                                                                                                                                                                C62049OWv c62049OWv5 = this.LLILL;
                                                                                                                                                                if (c62049OWv5 != null) {
                                                                                                                                                                    C80698Vlm c80698Vlm3 = this.LJLJLJ;
                                                                                                                                                                    if (c80698Vlm3 != null) {
                                                                                                                                                                        c62049OWv5.addOnPageChangeListener(new C80697Vll(c80698Vlm3));
                                                                                                                                                                        if (xzh.LJIJ) {
                                                                                                                                                                            this.LLIZLLLIL.LJIIL.setMusicStatus(11);
                                                                                                                                                                        }
                                                                                                                                                                        MusicService.LJJLIIIJJI().LJJJLZIJ(new XZ6(this));
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    o.LJIJI("tablayout");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                o.LJIJI("viewPager");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            o.LJIJI("viewPager");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        o.LJIJI("viewPager");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    o.LJIJI("viewPager");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                o.LJIJI("viewPager");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            o.LJIJI("tablayout");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        o.LJIJI("tablayout");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                    o.LJIJI("findMore");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                o.LJIJI("volumeView");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            o.LJIJI("recentRecyclerView");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("collectionRecycerView");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("aiRecycerView");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("retryViewCollect");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("thisView");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("thisView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("thisView");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("thisView");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("thisView");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("thisView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("thisView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("thisView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("thisView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("thisView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("thisView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("viewGroupRecent");
                                                                throw null;
                                                            }
                                                            o.LJIJI("viewGroupRecent");
                                                            throw null;
                                                        }
                                                        o.LJIJI("viewGroupRecent");
                                                        throw null;
                                                    }
                                                    o.LJIJI("viewGroupCollect");
                                                    throw null;
                                                }
                                                o.LJIJI("viewGroupCollect");
                                                throw null;
                                            }
                                            o.LJIJI("aiRecycerView");
                                            throw null;
                                        }
                                        o.LJIJI("viewGroupAI");
                                        throw null;
                                    }
                                    o.LJIJI("thisView");
                                    throw null;
                                }
                                o.LJIJI("thisView");
                                throw null;
                            }
                            o.LJIJI("thisView");
                            throw null;
                        }
                        o.LJIJI("thisView");
                        throw null;
                    }
                    o.LJIJI("thisView");
                    throw null;
                }
                o.LJIJI("thisView");
                throw null;
            }
            o.LJIJI("thisView");
            throw null;
        }
        o.LJIJI("thisView");
        throw null;
    }

    @Override // X.InterfaceC133285Ky
    public final void LIZLLL(C149795uJ originSoundParams) {
        o.LJIIIZ(originSoundParams, "originSoundParams");
        this.LJLLILLLL = originSoundParams;
    }

    public final void LJIIJ(XW2 xw2) {
        AVMusic extractAVMusic;
        MusicModel LJJIJIL;
        int i;
        if (xw2 != this.LLJJIJIIJIL) {
            XZX.LIZ = "-1";
            XZC xzc = this.LLJILJILJ;
            if (xzc != null) {
                xzc.LJZ(-1);
            }
            XZC xzc2 = this.LLJILLL;
            if (xzc2 != null) {
                xzc2.LJZ(-1);
            }
            XZJ xzj = this.LLJJ;
            if (xzj != null) {
                xzj.LJZ(-1);
            }
            if (xw2 == XW2.TAB_AI) {
                Boolean bool = this.LLIZLLLIL.LJI;
                Boolean bool2 = Boolean.TRUE;
                if (o.LJ(bool, bool2) && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ())) != null && (LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic)) != null && o.LJ(this.LLIZLLLIL.LJI, bool2) && !C78915Uy7.LJIILIIL(this.LLIZLLLIL.LIZ, LJJIJIL)) {
                    ArrayList<MusicModel> arrayList = this.LLIZLLLIL.LIZ;
                    MusicModel musicModel = (MusicModel) ORZ.LJLLLL(arrayList);
                    if (musicModel != null && musicModel.isSpeechToSong()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    ListProtector.add(arrayList, i, LJJIJIL);
                    XZC xzc3 = this.LLJILJILJ;
                    if (xzc3 != null) {
                        xzc3.setData(this.LLIZLLLIL.LIZ);
                    }
                    XZC xzc4 = this.LLJILJILJ;
                    if (xzc4 != null) {
                        xzc4.notifyDataSetChanged();
                    }
                }
            }
        }
        C133295Kz.LIZ.clear();
        int i2 = XW4.LIZ[xw2.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                LJJIIJ(false);
                return;
            }
            LJJIII(false);
            return;
        }
        LJJIIJZLJL(false);
    }

    public final void LJIILJJIL(XZG xzg) {
        Iterator<MusicModel> it = xzg.LIZ.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getMusicItemType() == MusicModel.MusicItemType.MUSIC_SECTION_TITLE) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        ArrayList<MusicModel> arrayList = xzg.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<MusicModel> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MusicModel next = it2.next();
            MusicModel musicModel = next;
            if (musicModel.getMusicItemType() == MusicModel.MusicItemType.MUSIC_SECTION_TITLE || musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                arrayList2.add(next);
            }
        }
        if (i != -1) {
            xzg.LIZ.removeAll(ORZ.LLJJ(arrayList2));
            XZC xzc = this.LLJILLL;
            if (xzc != null) {
                xzc.notifyItemRangeRemoved(i, arrayList2.size());
            }
        }
    }

    public final int LJIILL(XZH xzh) {
        if (xzh.LJIJI || xzh.LJIIZILJ != EnumC133275Kx.REPLACEMUSICPAGE) {
            return 0;
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        if (!e1.LIZ(31744, "show_similar_tag_on_change_sound_page", true, false) || !this.LLILZIL) {
            return 0;
        }
        return 1;
    }

    public final void LJIIZILJ(XW2 tab) {
        o.LJIIIZ(tab, "tab");
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            new SafeHandler(xzh.LJ).post(new ARunnableS34S0200000_15(tab, this, 25));
        } else {
            o.LJIJI("params");
            throw null;
        }
    }

    public final void LJJIFFI(C43023GuZ c43023GuZ) {
        List<? extends MusicModel> list;
        List<? extends MusicModel> list2;
        MusicModel musicModel;
        if (c43023GuZ.LIZJ == 2) {
            this.LLIZLLLIL.LJIIIIZZ = true;
        }
        List<? extends MusicModel> list3 = c43023GuZ.LIZ;
        boolean z = false;
        if (list3 == null || list3.isEmpty() || ((list = c43023GuZ.LIZ) != null && list.size() == 1 && (list2 = c43023GuZ.LIZ) != null && (musicModel = (MusicModel) ORZ.LJLLLL(list2)) != null && musicModel.isSpeechToSong())) {
            this.LLIZLLLIL.LJI = Boolean.FALSE;
            LJIJJLI();
        } else {
            XZG xzg = this.LLIZLLLIL;
            xzg.LJI = Boolean.TRUE;
            LJJJJLI(xzg, c43023GuZ);
        }
        G8G.LIZ.end(OpenEditMusicPanelPerformanceMonitor.INSTANCE, "music_data_set");
        Boolean bool = this.LLIZLLLIL.LJI;
        if (bool != null) {
            z = bool.booleanValue();
        }
        WPY.LIZIZ(z, "edit_music", XW2.TAB_AI.getStringValue(), 8);
    }

    public final void LJJIII(boolean z) {
        XZC xzc;
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            xzh.LIZ.LIZLLL = false;
            XW2 xw2 = XW2.TAB_COLLECT;
            this.LLJJIJIIJIL = xw2;
            XZE xze = this.LJLJI;
            if (xze != null) {
                xze.setCurrentTab(xw2);
                XZH xzh2 = this.LJLJL;
                if (xzh2 != null) {
                    xzh2.LJIILL.LIZ(xw2.getStringValue(), z);
                    C62049OWv c62049OWv = this.LLILL;
                    if (c62049OWv != null) {
                        c62049OWv.setCurrentItem(1);
                        if (!this.LLJ.LJFF) {
                            this.LLJLILLLLZIIL = false;
                            if (!C1B8.LIZJ()) {
                                J9P.LIZIZ(C42470Gle.LIZ(), "video_edit_page", "edit_xpage_recommend_favourite", null, new IDgS352S0100000_15(this, 0));
                                return;
                            } else {
                                LJII();
                                return;
                            }
                        }
                        if ((!r1.LIZ.isEmpty()) && !z && (xzc = this.LLJILLL) != null) {
                            xzc.notifyDataSetChanged();
                        }
                        if (!this.LLJLILLLLZIIL) {
                            return;
                        }
                        this.LLJLILLLLZIIL = false;
                        this.LLJLL = true;
                        XTV xtv = XTV.LJIIIZ;
                        XZH xzh3 = this.LJLJL;
                        if (xzh3 != null) {
                            int i = xzh3.LJI;
                            if (xtv.LJ) {
                                return;
                            }
                            xtv.LJ = true;
                            xtv.LJFF = 0;
                            XKX.LIZLLL(C780334l.LJLIL, null, null, new XTS(i, xtv, null), 3);
                            return;
                        }
                        o.LJIJI("params");
                        throw null;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("thisView");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJIIJ(boolean z) {
        if (this.LLJJ == null) {
            XZ9 xz9 = new XZ9(this);
            InterfaceC149485to Z9 = this.LJLILLLLZI.Z9();
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                this.LLJJ = new XZJ(xz9, Z9, xzh.LIZ);
                if (this.LJLJL != null) {
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                    C161806Wq c161806Wq = this.LLIIJI;
                    if (c161806Wq != null) {
                        c161806Wq.setLayoutManager(wrapLinearLayoutManager);
                        C161806Wq c161806Wq2 = this.LLIIJI;
                        if (c161806Wq2 != null) {
                            c161806Wq2.setAdapter(this.LLJJ);
                            LJIIZILJ(XW2.TAB_RECENT);
                        } else {
                            o.LJIJI("recentRecyclerView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("recentRecyclerView");
                        throw null;
                    }
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        XZH xzh2 = this.LJLJL;
        if (xzh2 != null) {
            xzh2.LIZ.LIZLLL = false;
            XW2 xw2 = XW2.TAB_RECENT;
            this.LLJJIJIIJIL = xw2;
            XZE xze = this.LJLJI;
            if (xze != null) {
                xze.setCurrentTab(xw2);
                XZH xzh3 = this.LJLJL;
                if (xzh3 != null) {
                    xzh3.LJIILL.LIZ(xw2.getStringValue(), z);
                    C62049OWv c62049OWv = this.LLILL;
                    if (c62049OWv != null) {
                        c62049OWv.setCurrentItem(2);
                        if (!C60903NvH.LJIIJJI().getAccountService().isLogin()) {
                            J9P.LIZIZ(C42470Gle.LIZ(), "video_edit_page", "edit_page_recent", null, new IDgS352S0100000_15(this, 1));
                            return;
                        } else {
                            LJIILIIL();
                            return;
                        }
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("thisView");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJIIJZLJL(boolean z) {
        XZC xzc;
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            xzh.LIZ.LIZLLL = true;
            XZO xzo = xzh.LJIILL;
            XW2 xw2 = XW2.TAB_AI;
            xzo.LIZ(xw2.getStringValue(), z);
            this.LLJJIJIIJIL = xw2;
            XZE xze = this.LJLJI;
            if (xze != null) {
                xze.setCurrentTab(xw2);
                C62049OWv c62049OWv = this.LLILL;
                if (c62049OWv != null) {
                    c62049OWv.setCurrentItem(0);
                    ArrayList<MusicModel> arrayList = this.LLIZLLLIL.LIZ;
                    if (arrayList == null || arrayList.isEmpty() || z || (xzc = this.LLJILJILJ) == null) {
                        return;
                    }
                    xzc.notifyDataSetChanged();
                    return;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("thisView");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJJ(boolean z) {
        C73305Spp c73305Spp;
        TK7 tk7;
        if (z) {
            View view = this.LJLZ;
            if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                o.LJIJI("retryViewAI");
                throw null;
            }
        }
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
            View view2 = this.LJLZ;
            if (view2 != null) {
                C78596Usy.LJJJLIIL(view2.getContext(), true);
            } else {
                o.LJIJI("retryViewAI");
                throw null;
            }
        }
        C223338pd c223338pd = this.LLIILII;
        if (c223338pd != null) {
            c223338pd.setVisibility(8);
        }
        LinearLayout linearLayout = this.LLIILZL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view3 = this.LJLZ;
        if (view3 != null) {
            view3.setVisibility(0);
            if (C52908Kpc.LIZ()) {
                View view4 = this.LJLZ;
                if (view4 != null) {
                    if (!(view4 instanceof TK7) || (tk7 = (TK7) view4) == null) {
                        return;
                    }
                    tk7.LIZ();
                    return;
                }
                o.LJIJI("retryViewAI");
                throw null;
            }
            View view5 = this.LJLZ;
            if (view5 != null) {
                if (!(view5 instanceof C73305Spp) || (c73305Spp = (C73305Spp) view5) == null) {
                    return;
                }
                C73306Spq c73306Spq = new C73306Spq();
                XZH xzh = this.LJLJL;
                if (xzh != null) {
                    String string = xzh.LIZLLL.getString(R.string.ha1);
                    o.LJIIIIZZ(string, "params.activity.getStrin…messageapp_err_int_title)");
                    c73306Spq.LJFF = string;
                    XZH xzh2 = this.LJLJL;
                    if (xzh2 != null) {
                        String string2 = xzh2.LIZLLL.getString(R.string.ha0);
                        o.LJIIIIZZ(string2, "params.activity.getStrin….imessageapp_err_int_sub)");
                        c73306Spq.LJI = string2;
                        c73306Spq.LJII = new AqS181S0100000_15(this, 152);
                        c73305Spp.setStatus(c73306Spq);
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("retryViewAI");
            throw null;
        }
        o.LJIJI("retryViewAI");
        throw null;
    }

    public final void LJJJI(boolean z) {
        XZC xzc = this.LLJILLL;
        if (xzc == null || z) {
            XZ8 xz8 = new XZ8(this);
            InterfaceC149485to Z9 = this.LJLILLLLZI.Z9();
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                XZC xzc2 = new XZC(xz8, Z9, xzh.LIZ, null);
                this.LLJILLL = xzc2;
                xzc2.setData(this.LLJ.LIZ);
                if (this.LJLJL != null) {
                    WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
                    C161806Wq c161806Wq = this.LJLJJLL;
                    if (c161806Wq != null) {
                        c161806Wq.setLayoutManager(wrapLinearLayoutManager);
                        C161806Wq c161806Wq2 = this.LJLJJLL;
                        if (c161806Wq2 != null) {
                            c161806Wq2.setAdapter(this.LLJILLL);
                            if (!this.LLJ.LIZLLL) {
                                LJIIZILJ(XW2.TAB_COLLECT);
                            }
                            C223338pd c223338pd = this.LLILII;
                            if (c223338pd != null) {
                                c223338pd.setVisibility(8);
                            }
                            LinearLayout linearLayout = this.LLIIZ;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                            XZC xzc3 = this.LLJILLL;
                            if (xzc3 != null) {
                                xzc3.setLoadMoreListener(new AqS157S0100000_7(new XZ2(this), 616));
                                return;
                            }
                            return;
                        }
                        o.LJIJI("collectionRecycerView");
                        throw null;
                    }
                    o.LJIJI("collectionRecycerView");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("params");
            throw null;
        }
        xzc.setDataAfterLoadMore(this.LLJ.LIZ);
        SafeHandler safeHandler = this.LLILIL;
        if (safeHandler != null) {
            safeHandler.post(new ARunnableS51S0100000_15(this, 49));
        } else {
            o.LJIJI("safeHander");
            throw null;
        }
    }

    public final void LJJJJI(boolean z) {
        Effect Y9;
        String str;
        Effect effect;
        if (z) {
            XZI xzi = this.LJLILLLLZI;
            StsAssetModel stsAssetModel = this.LLIZLLLIL.LJIILIIL;
            if (stsAssetModel != null && (effect = stsAssetModel.getEffect()) != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            Y9 = xzi.aa(str);
        } else {
            StsAssetModel stsAssetModel2 = this.LLIZLLLIL.LJIILIIL;
            if (stsAssetModel2 == null || (Y9 = stsAssetModel2.getEffect()) == null) {
                Y9 = this.LJLILLLLZI.Y9();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Y9);
        this.LJLILLLLZI.S9((IStsPrepareHelper) this.LLJJIJI.getValue(), new StsRequestModel(arrayList), new XZB(this));
    }

    public final void LJJJJJ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LLIIIJ;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            tuxTextView.setVisibility(i);
            return;
        }
        o.LJIJI("emptyViewRecent");
        throw null;
    }

    public final void LJJJJJL(boolean z) {
        if (z) {
            C223338pd c223338pd = this.LLIIIZ;
            if (c223338pd != null) {
                c223338pd.setVisibility(0);
                c223338pd.LIZIZ();
            }
            LinearLayout linearLayout = this.LLIL;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        C223338pd c223338pd2 = this.LLIIIZ;
        if (c223338pd2 != null) {
            c223338pd2.setVisibility(4);
            c223338pd2.LIZJ();
        }
        LinearLayout linearLayout2 = this.LLIL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public final void LJJJJL(boolean z) {
        List<MusicModel> data;
        if (!z) {
            C73305Spp c73305Spp = this.LLIIIILZ;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
                T3A t3a = this.LLIIIL;
                if (t3a != null) {
                    t3a.setVisibility(8);
                    return;
                }
                return;
            }
            o.LJIJI("retryViewRecent");
            throw null;
        }
        XZJ xzj = this.LLJJ;
        if (xzj != null && (data = xzj.getData()) != null) {
            data.clear();
        }
        XZJ xzj2 = this.LLJJ;
        if (xzj2 != null) {
            xzj2.notifyDataSetChanged();
        }
        LJJJJJL(false);
        if (C52908Kpc.LIZ()) {
            T3A t3a2 = this.LLIIIL;
            if (t3a2 == null) {
                return;
            }
            t3a2.setVisibility(0);
            t3a2.LIZ();
            return;
        }
        C73305Spp c73305Spp2 = this.LLIIIILZ;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
            C73305Spp c73305Spp3 = this.LLIIIILZ;
            if (c73305Spp3 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                XZH xzh = this.LJLJL;
                if (xzh != null) {
                    String string = xzh.LIZLLL.getString(R.string.ha1);
                    o.LJIIIIZZ(string, "params.activity.getStrin…messageapp_err_int_title)");
                    c73306Spq.LJFF = string;
                    XZH xzh2 = this.LJLJL;
                    if (xzh2 != null) {
                        String string2 = xzh2.LIZLLL.getString(R.string.ha0);
                        o.LJIIIIZZ(string2, "params.activity.getStrin….imessageapp_err_int_sub)");
                        c73306Spq.LJI = string2;
                        c73306Spq.LJII = new AqS181S0100000_15(this, 154);
                        c73305Spp3.setStatus(c73306Spq);
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("retryViewRecent");
            throw null;
        }
        o.LJIJI("retryViewRecent");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectEvent(XYB event) {
        MusicModel.CollectionType collectionType;
        o.LJIIIZ(event, "event");
        HashMap<String, MusicModel> hashMap = this.LLJJL;
        String musicId = event.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "event.music.musicId");
        MusicModel m159clone = event.LJLIL.m159clone();
        if (event.LJLILLLLZI) {
            collectionType = MusicModel.CollectionType.COLLECTED;
        } else {
            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
        }
        m159clone.setCollectionType(collectionType);
        hashMap.put(musicId, m159clone);
    }

    public VerticalMusicView(C82622Wbi diContainer, XZI xzi) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = xzi;
        this.LLIIJLIL = UCI.LJII(diContainer, XZQ.class, null);
        this.LLILZIL = true;
        this.LLIZLLLIL = new XZG();
        this.LLJ = new XZG();
        this.LLJI = new C73318Sq2();
        this.LLJIJIL = new C73318Sq2();
        this.LLJILJIL = true;
        this.LLJJIII = C221108m2.LIZIZ(C84900XTs.LJLIL);
        this.LLJJIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 656));
        XW2 xw2 = XW2.TAB_AI;
        this.LLJJIJIIJIL = xw2;
        this.LLJJIJIL = xw2;
        this.LLJJJ = new LinkedHashMap();
        this.LLJJL = new HashMap<>();
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        this.LLJLIL = "-1";
        this.LLJLLIL = new XZD(this);
    }

    public final void LJI(boolean z, C43023GuZ c43023GuZ) {
        LinearLayout linearLayout;
        AbstractC73672Svk LJJIJIL;
        int i;
        String str;
        InterfaceC115714gR LJJJ;
        this.LLJJJIL = o.LJ(this.LLIZLLLIL.LJI, Boolean.FALSE);
        this.LLIZLLLIL.LJI = null;
        C223338pd c223338pd = this.LLIILII;
        if (c223338pd == null || c223338pd.getVisibility() != 0) {
            C223338pd c223338pd2 = this.LLIILII;
            if (c223338pd2 != null) {
                c223338pd2.setVisibility(0);
            }
            C223338pd c223338pd3 = this.LLIILII;
            if (c223338pd3 != null) {
                c223338pd3.LIZIZ();
            }
        }
        LinearLayout linearLayout2 = this.LLIILZL;
        if ((linearLayout2 == null || linearLayout2.getVisibility() != 0) && (linearLayout = this.LLIILZL) != null) {
            linearLayout.setVisibility(0);
        }
        XZG xzg = this.LLIZLLLIL;
        if (xzg.LJIIIZ) {
            final C6LR c6lr = C6LR.LIZIZ;
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                final List<String> list = xzh.LIZIZ;
                final MusicModel LIZJ = xzh.LJIILJJIL.LIZJ();
                final InterfaceC149485to musicDataListener = this.LJLILLLLZI.Z9();
                c6lr.getClass();
                o.LJIIIZ(musicDataListener, "musicDataListener");
                LJJIJIL = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.6ZV
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<MusicModel> interfaceC73573Su9) {
                        MusicModel musicModel = MusicModel.this;
                        if (musicModel != null) {
                            interfaceC73573Su9.onNext(musicModel);
                            interfaceC73573Su9.onComplete();
                        } else if (C78886Uxe.LJJIJ(list)) {
                            interfaceC73573Su9.onNext(new MusicModel());
                            interfaceC73573Su9.onComplete();
                        } else {
                            C6LR c6lr2 = c6lr;
                            final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                            c6lr2.LIZ = new C6LT() { // from class: X.6ZW
                                @Override // X.C6LT
                                public final void LIZ(MusicModel musicModel2, boolean z2) {
                                    if (musicModel2 != null) {
                                        InterfaceC73573Su9<MusicModel> interfaceC73573Su92 = c73433Srt;
                                        interfaceC73573Su92.onNext(musicModel2);
                                        interfaceC73573Su92.onComplete();
                                    } else {
                                        c73433Srt.onNext(new MusicModel());
                                        c73433Srt.onComplete();
                                    }
                                }
                            };
                            c6lr2.LIZ(list, musicDataListener);
                        }
                    }
                }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
            } else {
                o.LJIJI("params");
                throw null;
            }
        } else {
            LJJIJIL = AbstractC73672Svk.LJJIJIL(xzg.LJIIJ);
        }
        XZH xzh2 = this.LJLJL;
        if (xzh2 != null) {
            this.LLILZ = LJIILL(xzh2);
            C149795uJ c149795uJ = this.LJLLILLLL;
            if (c149795uJ != null) {
                if (c149795uJ.LJII && c149795uJ.LJIIIIZZ.length() > 0) {
                    i = 1;
                    C149795uJ c149795uJ2 = this.LJLLILLLL;
                    if (c149795uJ2 != null) {
                        str = c149795uJ2.LJIIIIZZ;
                    } else {
                        o.LJIJI("originSoundParams");
                        throw null;
                    }
                } else {
                    i = 0;
                    XZH xzh3 = this.LJLJL;
                    if (xzh3 != null) {
                        str = xzh3.LJIILLIIL;
                    } else {
                        o.LJIJI("params");
                        throw null;
                    }
                }
                if (c43023GuZ != null) {
                    LJJJ = AbstractC73672Svk.LJJIJIL(c43023GuZ);
                } else {
                    C43014GuQ c43014GuQ = C43014GuQ.LIZ;
                    XZH xzh4 = this.LJLJL;
                    if (xzh4 != null) {
                        long j = xzh4.LJFF;
                        int i2 = xzh4.LJI;
                        int i3 = LLJZIJLIL;
                        LJJJ = c43014GuQ.LIZ(null, j, i2, i3, i3, z, this.LLILLL, str, this.LLILZ, i, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                    } else {
                        o.LJIJI("params");
                        throw null;
                    }
                }
                this.LLILZIL = false;
                AbstractC73672Svk LJJLL = AbstractC73672Svk.LJJLL(LJJJ, LJJIJIL, new C84905XTx(this));
                C43963HNf isError = C43963HNf.LJLIL;
                o.LJIIIZ(isError, "isError");
                C74216TAu c74216TAu = C74216TAu.LIZIZ;
                if (c74216TAu.LIZIZ() && c74216TAu.LIZLLL() > 0) {
                    AqS24S0000100_6 aqS24S0000100_6 = new AqS24S0000100_6(System.currentTimeMillis(), 1);
                    LJJLL = LJJLL.LJJJ(T16.LIZ()).LJIJJLI(new AfS55S0200000_6(isError, aqS24S0000100_6, 9)).LJIJJ(new AfS58S0100000_6(aqS24S0000100_6, 41)).LJJJ(C73969T1h.LIZIZ());
                }
                this.LLJI.LIZ(LJJLL.LJJJLIIL(new AfS67S0100000_15(this, 47), new AfS67S0100000_15(this, 48)));
                return;
            }
            o.LJIJI("originSoundParams");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final T3A LJIIIIZZ(FrameLayout frameLayout, InterfaceC88472Yns<? super T3A, C76800UCe> interfaceC88472Yns) {
        XZE xze = this.LJLJI;
        if (xze != null) {
            Context context = xze.getContext();
            o.LJIIIIZZ(context, "thisView.context");
            T3A t3a = new T3A(context);
            t3a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            t3a.setRetryCallback(new AqS159S0200000_12((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super T3A, C76800UCe>) t3a, (T3A) 37));
            t3a.setVisibility(8);
            frameLayout.addView(t3a);
            return t3a;
        }
        o.LJIJI("thisView");
        throw null;
    }

    public final void LJIIIZ(XZC xzc, boolean z) {
        if (xzc == null) {
            return;
        }
        XZX.LIZ = "-1";
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            xzh.LJIILJJIL.V9(false);
            XZH xzh2 = this.LJLJL;
            if (xzh2 != null) {
                if (!C77413UZt.LJIILL(xzh2.LIZIZ) && !z) {
                    return;
                }
                xzc.LJLJJL = -1;
                xzc.notifyDataSetChanged();
                XZH xzh3 = this.LJLJL;
                if (xzh3 != null) {
                    XZS.LIZ(xzh3.LJIILJJIL, null, null, null, false, false, false, this.LLJJIJIIJIL.getStringValue(), null, 288);
                    return;
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJIJ(C43023GuZ c43023GuZ, MusicModel musicModel) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(musicModel.getMusicId())) {
            arrayList.add(musicModel);
        }
        List<? extends MusicModel> list = c43023GuZ.LIZ;
        if (list != null) {
            for (MusicModel musicModel2 : list) {
                if (!o.LJ(musicModel2.getMusicId(), musicModel.getMusicId())) {
                    arrayList.add(musicModel2);
                }
                Integer similarTag = musicModel2.getSimilarTag();
                if (similarTag != null && similarTag.intValue() == 1) {
                    this.LLILZIL = false;
                }
            }
        }
        c43023GuZ.LIZ = arrayList;
    }

    public final void LJJI(String str, boolean z) {
        String str2;
        MusicBuzModel LIZIZ;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
        if (extractAVMusic != null) {
            str2 = extractAVMusic.getMusicId();
        } else {
            str2 = null;
        }
        if (!o.LJ(str2, str) || (LIZIZ = this.LJLILLLLZI.Z9().LIZIZ()) == null) {
            return;
        }
        LIZIZ.isCollected = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJII(XZC xzc, MusicModel musicModel) {
        char c;
        String str;
        XZQ LJIIL;
        List<MusicModel> data;
        MusicModel.CollectionType collectionType;
        XZQ LJIIL2;
        String str2;
        boolean z = true;
        if (!C1B8.LIZJ()) {
            int i = XW4.LIZ[this.LLJJIJIIJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str2 = "edit_page_recent";
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    str2 = "edit_xpage_recommend_favourite";
                }
            } else {
                str2 = "edit_page_recommend";
            }
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                J9P.LIZIZ(xzh.LIZLLL, "video_edit_page", str2, null, new XZR(this, xzc, musicModel));
                return;
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        this.LLJLILLLLZIIL = true;
        MusicModel.CollectionType collectionType2 = musicModel.getCollectionType();
        MusicModel.CollectionType collectionType3 = MusicModel.CollectionType.COLLECTED;
        if (collectionType2 == collectionType3) {
            c = 1;
        } else {
            c = 0;
        }
        if (this.LLJJIJIIJIL != XW2.TAB_COLLECT) {
            z = false;
        }
        int LJIILL = C78915Uy7.LJIILL(this.LLIZLLLIL.LIZ, musicModel);
        if (c != 0) {
            MusicModel.CollectionType collectionType4 = MusicModel.CollectionType.NOT_COLLECTED;
            LJJ(musicModel, collectionType4, z);
            if (LJIILL >= 0) {
                ((MusicModel) ListProtector.get(this.LLIZLLLIL.LIZ, LJIILL)).setCollectionType(collectionType4);
            }
        } else {
            LJJ(musicModel, collectionType3, z);
            if (LJIILL >= 0) {
                ((MusicModel) ListProtector.get(this.LLIZLLLIL.LIZ, LJIILL)).setCollectionType(collectionType3);
            }
        }
        boolean z2 = c ^ 1;
        LJJI(musicModel.getMusicId(), z2);
        String musicId = musicModel.getMusicId();
        if (musicId != null && (LJIIL2 = LJIIL()) != null) {
            LJIIL2.bY(musicId, z2);
        }
        HashMap<String, Boolean> hashMap = C133295Kz.LIZ;
        String musicId2 = musicModel.getMusicId();
        o.LJIIIIZZ(musicId2, "musicModel.musicId");
        hashMap.put(musicId2, Boolean.valueOf(z2));
        if (xzc != null && (data = xzc.getData()) != null) {
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel2 : data) {
                if (o.LJ(musicModel2.getMusicId(), musicModel.getMusicId())) {
                    arrayList.add(musicModel2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MusicModel musicModel3 = (MusicModel) it.next();
                if (c != 0) {
                    collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                } else {
                    collectionType = MusicModel.CollectionType.COLLECTED;
                }
                musicModel3.setCollectionType(collectionType);
            }
        }
        XZC xzc2 = this.LLJILJILJ;
        if (xzc2 != null) {
            xzc2.notifyDataSetChanged();
        }
        XZC xzc3 = this.LLJILLL;
        if (xzc3 != null) {
            xzc3.notifyDataSetChanged();
        }
        XZJ xzj = this.LLJJ;
        if (xzj != null) {
            xzj.notifyDataSetChanged();
        }
        XZH xzh2 = this.LJLJL;
        if (xzh2 != null) {
            XZO xzo = xzh2.LJIILL;
            String stringValue = this.LLJJIJIIJIL.getStringValue();
            if (this.LLJJIJIIJIL == XW2.TAB_RECENT && (LJIIL = LJIIL()) != null) {
                String musicId3 = musicModel.getMusicId();
                o.LJIIIIZZ(musicId3, "musicModel.musicId");
                str = LJIIL.pp(musicId3);
            } else {
                str = null;
            }
            xzo.LJIIIZ(z2, musicModel, stringValue, str);
            XTV xtv = XTV.LJIIIZ;
            String musicId4 = musicModel.getMusicId();
            o.LJIIIIZZ(musicId4, "musicModel.musicId");
            XZ7 xz7 = new XZ7(musicModel, this);
            xtv.getClass();
            xtv.LIZIZ = xz7;
            MusicService.LJJLIIIJJI().collectMusic(musicId4, z2 ? 1 : 0).LJ(new AgS41S0110000_15(xz7, z2, 3), C10K.LJIIIIZZ, null);
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJIJIIJI(StsAssetModel stsAssetModel, boolean z) {
        String str;
        Effect effect;
        XZG xzg = this.LLIZLLLIL;
        xzg.getClass();
        xzg.LJIIJJI = "";
        MusicModel musicModel = null;
        if (this.LLIZLLLIL.LJIILIIL != null) {
            VideoPublishEditModel publishEditModel = this.LJLILLLLZI.LLLLIL();
            if (stsAssetModel != null && (effect = stsAssetModel.getEffect()) != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            o.LJIIIZ(publishEditModel, "publishEditModel");
            C145995oB LIZIZ = C135015Rp.LIZIZ(publishEditModel);
            if (str == null) {
                str = "";
            }
            LIZIZ.LJI("sts_template_name", str);
            FMX.LJIIL("change_sts_template", LIZIZ.LIZ);
        }
        this.LLIZLLLIL.LJIILIIL = stsAssetModel;
        int i = 10;
        if (stsAssetModel == null || TextUtils.isEmpty(stsAssetModel.getSongPath())) {
            musicModel = new MusicModel();
            musicModel.setMusicId("");
            musicModel.setName(C86V.LJFF(R.string.rhu));
            musicModel.setMusicType(MusicModel.MusicType.SPEECH2SONG);
            if (this.LLIZLLLIL.LJIIL.getMusicStatus() != 10) {
                i = 11;
            }
            musicModel.setMusicStatus(i);
        } else {
            MusicModel LJJIIZI = LJIIJJI().LJJIIZI(stsAssetModel.getSongPath());
            if (LJJIIZI != null) {
                LJJIIZI.setName(LJIIJJI().LJJJJZI(stsAssetModel.getEffect().getName()));
                LJJIIZI.setMusicType(MusicModel.MusicType.SPEECH2SONG);
                LJJIIZI.setPicPremium(AccountService.LJIJ().LJFF().getAvatarUrl());
                if (this.LLIZLLLIL.LJIIL.getMusicStatus() != 10 && C167486hk.LIZ()) {
                    i = 13;
                }
                LJJIIZI.setMusicStatus(i);
                musicModel = LJJIIZI;
            }
        }
        if (musicModel != null) {
            XZG xzg2 = this.LLIZLLLIL;
            xzg2.getClass();
            xzg2.LJIIL = musicModel;
            if (!this.LLIZLLLIL.LIZ.isEmpty()) {
                ListProtector.set(this.LLIZLLLIL.LIZ, 0, musicModel);
            }
        }
        XZC xzc = this.LLJILJILJ;
        if (xzc != null) {
            xzc.LJZ(-1);
        }
        if (z) {
            MusicModel musicModel2 = (MusicModel) ListProtector.get(this.LLIZLLLIL.LIZ, 0);
            this.LLJJI = musicModel2;
            if (musicModel2 != null) {
                LJJIIZI(0, musicModel2, XW2.TAB_AI);
                return;
            }
            return;
        }
        LJJIJL();
    }

    public final void LJJJIL(boolean z, boolean z2) {
        if (z2) {
            C73305Spp c73305Spp = this.LJZ;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
                T3A t3a = this.LLIIL;
                if (t3a != null) {
                    t3a.setVisibility(8);
                    return;
                }
                return;
            }
            o.LJIJI("retryViewCollect");
            throw null;
        }
        if (!z) {
            this.LLJ.LIZ.clear();
            XZC xzc = this.LLJILLL;
            if (xzc != null) {
                xzc.notifyDataSetChanged();
            }
            C223338pd c223338pd = this.LLILII;
            if (c223338pd != null) {
                c223338pd.setVisibility(8);
            }
            LinearLayout linearLayout = this.LLIIZ;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (C52908Kpc.LIZ()) {
                T3A t3a2 = this.LLIIL;
                if (t3a2 == null) {
                    return;
                }
                t3a2.setVisibility(0);
                t3a2.LIZ();
                return;
            }
            C73305Spp c73305Spp2 = this.LJZ;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJZ;
                if (c73305Spp3 != null) {
                    C73306Spq c73306Spq = new C73306Spq();
                    XZH xzh = this.LJLJL;
                    if (xzh != null) {
                        String string = xzh.LIZLLL.getString(R.string.ha1);
                        o.LJIIIIZZ(string, "params.activity.getStrin…messageapp_err_int_title)");
                        c73306Spq.LJFF = string;
                        XZH xzh2 = this.LJLJL;
                        if (xzh2 != null) {
                            String string2 = xzh2.LIZLLL.getString(R.string.ha0);
                            o.LJIIIIZZ(string2, "params.activity.getStrin….imessageapp_err_int_sub)");
                            c73306Spq.LJI = string2;
                            c73306Spq.LJII = new AqS181S0100000_15(this, 153);
                            c73305Spp3.setStatus(c73306Spq);
                            return;
                        }
                        o.LJIJI("params");
                        throw null;
                    }
                    o.LJIJI("params");
                    throw null;
                }
                o.LJIJI("retryViewCollect");
                throw null;
            }
            o.LJIJI("retryViewCollect");
            throw null;
        }
        this.LLJ.LIZ.clear();
        XZC xzc2 = this.LLJILLL;
        if (xzc2 != null) {
            xzc2.notifyDataSetChanged();
        }
        C223338pd c223338pd2 = this.LLILII;
        if (c223338pd2 != null) {
            c223338pd2.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.LLIIZ;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        C73305Spp c73305Spp4 = this.LJZ;
        if (c73305Spp4 != null) {
            c73305Spp4.setVisibility(0);
            C73305Spp c73305Spp5 = this.LJZ;
            if (c73305Spp5 != null) {
                C73306Spq c73306Spq2 = new C73306Spq();
                XZH xzh3 = this.LJLJL;
                if (xzh3 != null) {
                    String string3 = xzh3.LIZLLL.getString(R.string.itf);
                    o.LJIIIIZZ(string3, "params.activity.getStrin…n_favorited_sounds_title)");
                    c73306Spq2.LJFF = string3;
                    XZH xzh4 = this.LJLJL;
                    if (xzh4 != null) {
                        String string4 = xzh4.LIZLLL.getString(R.string.ite);
                        o.LJIIIIZZ(string4, "params.activity.getStrin…_favorited_sounds_detail)");
                        c73306Spq2.LJI = string4;
                        c73305Spp5.setStatus(c73306Spq2);
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            o.LJIJI("retryViewCollect");
            throw null;
        }
        o.LJIJI("retryViewCollect");
        throw null;
    }

    public final void LJJJJ(MusicModel musicModel, boolean z) {
        o.LJIIIZ(musicModel, "musicModel");
        String musicId = musicModel.getMusicId();
        o.LJIIIIZZ(musicId, "musicModel.musicId");
        XZX.LIZ = musicId;
        XZH xzh = this.LJLJL;
        if (xzh != null) {
            xzh.LJIILJJIL.V9(false);
            if (!z) {
                this.LLJLIL = "-1";
            } else {
                XZH xzh2 = this.LJLJL;
                if (xzh2 != null) {
                    XZT.LIZ(xzh2.LJIILL, musicModel, 0, XW2.TAB_AI.getStringValue(), z, false, null, 48);
                } else {
                    o.LJIJI("params");
                    throw null;
                }
            }
            XUQ xuq = this.LLIZ;
            if (xuq != null) {
                XZH xzh3 = this.LJLJL;
                if (xzh3 != null) {
                    ((MusicDownloadPlayHelper) xuq).LJLJLLL = xzh3.LJII;
                    XZH xzh4 = this.LJLJL;
                    if (xzh4 != null) {
                        ((MusicDownloadPlayHelper) xuq).LJLL = xzh4.LJIIIIZZ;
                        this.LJLILLLLZI.X9(musicModel);
                        ((MusicDownloadPlayHelper) xuq).LIZIZ(3, musicModel, false, false);
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                }
                o.LJIJI("params");
                throw null;
            }
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJJJLI(XZG xzg, C43023GuZ c43023GuZ) {
        MusicModel musicModel;
        int i;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLILLLLZI.Z9().LIZIZ());
        if (extractAVMusic != null) {
            musicModel = C78915Uy7.LJJIJIL(extractAVMusic);
        } else {
            musicModel = null;
        }
        ArrayList<MusicModel> arrayList = xzg.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<MusicModel> it = arrayList.iterator();
        while (it.hasNext()) {
            MusicModel next = it.next();
            if (true ^ next.isSpeechToSong()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.LJLILLLLZI.X9((MusicModel) it2.next());
        }
        int i2 = 0;
        if (musicModel != null && !C78915Uy7.LJIILIIL(xzg.LIZ, musicModel)) {
            XZH xzh = this.LJLJL;
            if (xzh != null) {
                if (!xzh.LJIIL) {
                    ArrayList<MusicModel> arrayList3 = xzg.LIZ;
                    MusicModel musicModel2 = (MusicModel) ORZ.LJLLLL(arrayList3);
                    if (musicModel2 != null && musicModel2.isSpeechToSong()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    ListProtector.add(arrayList3, i, musicModel);
                }
            } else {
                o.LJIJI("params");
                throw null;
            }
        }
        List<? extends MusicModel> list = c43023GuZ.LIZ;
        if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            for (MusicModel musicModel3 : list) {
                MusicModel musicModel4 = musicModel3;
                ArrayList<MusicModel> arrayList5 = xzg.LIZ;
                o.LJIIIZ(arrayList5, "<this>");
                if (musicModel4 != null && !arrayList5.isEmpty()) {
                    MusicModel.MusicType musicType = musicModel4.getMusicType();
                    MusicModel.MusicType musicType2 = MusicModel.MusicType.SPEECH2SONG;
                    if (musicType != musicType2 && (((MusicModel) ListProtector.get(arrayList5, 0)).getMusicType() != musicType2 || arrayList5.size() < 2 || !o.LJ(((MusicModel) ListProtector.get(arrayList5, 1)).getMusicId(), musicModel4.getMusicId()))) {
                        if (((MusicModel) ListProtector.get(arrayList5, 0)).getMusicType() != musicType2 && o.LJ(((MusicModel) ListProtector.get(arrayList5, 0)).getMusicId(), musicModel4.getMusicId())) {
                        }
                    }
                }
                arrayList4.add(musicModel3);
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                MusicModel musicModel5 = (MusicModel) it3.next();
                Iterator<MusicModel> it4 = xzg.LIZ.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (o.LJ(it4.next().getMusicId(), musicModel5.getMusicId())) {
                            break;
                        }
                    } else {
                        xzg.LIZ.add(musicModel5);
                        break;
                    }
                }
            }
        }
        xzg.LIZJ = c43023GuZ.LIZLLL;
        String str = c43023GuZ.LJFF;
        o.LJIIIZ(str, "<set-?>");
        xzg.LIZIZ = str;
        xzg.LIZLLL = c43023GuZ.LJ;
        List<? extends MusicModel> list2 = c43023GuZ.LIZ;
        if (list2 != null) {
            i2 = list2.size();
        }
        xzg.LJ = i2;
        LJJIZ();
    }

    public final void LJIL(int i, MusicModel musicModel, XW2 xw2) {
        List<String> urlList;
        String str = null;
        this.LLJL = null;
        XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
        if (LIZ != null) {
            UrlModel url = musicModel.getUrl();
            if (url != null && (urlList = url.getUrlList()) != null) {
                str = (String) ORZ.LJLLLL(urlList);
            }
            LIZ.LIZLLL(str, new XZP(i, musicModel, xw2, this));
        }
    }

    public final void LJJ(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        int LJIILL = C78915Uy7.LJIILL(this.LLJ.LIZ, musicModel);
        if (LJIILL == -1) {
            if (collectionType == MusicModel.CollectionType.COLLECTED) {
                ArrayList<MusicModel> arrayList = this.LLJ.LIZ;
                musicModel.setCollectionType(collectionType);
                ListProtector.add(arrayList, 0, musicModel);
                return;
            }
            return;
        }
        if (LJIILL == -1 || collectionType != MusicModel.CollectionType.NOT_COLLECTED) {
            return;
        }
        if (!z) {
            ListProtector.remove(this.LLJ.LIZ, LJIILL);
        } else {
            ((MusicModel) ListProtector.get(this.LLJ.LIZ, LJIILL)).setCollectionType(collectionType);
        }
    }

    public final void LJJIIZI(int i, MusicModel musicModel, XW2 xw2) {
        XW2 xw22;
        XZQ LJIIL;
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        LJJJJ(musicModel, false);
        XW2 xw23 = XW2.TAB_RECENT;
        if (xw2 == xw23) {
            xw22 = xw23;
        } else {
            xw22 = XW2.TAB_AI;
        }
        this.LLJJIJIL = xw22;
        XZH xzh = this.LJLJL;
        String str = null;
        if (xzh != null) {
            XZO xzo = xzh.LJIILL;
            String stringValue = xw2.getStringValue();
            XZH xzh2 = this.LJLJL;
            if (xzh2 != null) {
                boolean z = xzh2.LJIIL;
                if (xw2 == xw23 && (LJIIL = LJIIL()) != null) {
                    String musicId = musicModel.getMusicId();
                    o.LJIIIIZZ(musicId, "model.musicId");
                    str = LJIIL.pp(musicId);
                }
                XZT.LIZ(xzo, musicModel, i, stringValue, false, z, str, 8);
                return;
            }
            o.LJIJI("params");
            throw null;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJIJJ(MusicModel musicModel, XW2 xw2, int i, String str, String str2) {
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            return;
        }
        Set set = (Set) ((LinkedHashMap) this.LLJJJ).get(xw2);
        if (set != null && set.contains(musicId)) {
            return;
        }
        XZH xzh = this.LJLJL;
        String str3 = null;
        if (xzh != null) {
            XZO xzo = xzh.LJIILL;
            String stringValue = xw2.getStringValue();
            if (str == null) {
                if (musicModel.getMusicItemType() == MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC) {
                    str3 = "favorite_recommend";
                }
            } else {
                str3 = str;
            }
            xzo.LIZJ(musicModel, stringValue, i, str3, str2);
            if (!this.LLJJJ.containsKey(xw2)) {
                this.LLJJJ.put(xw2, C77275UUl.LJ(musicId));
                return;
            }
            Set set2 = (Set) ((LinkedHashMap) this.LLJJJ).get(xw2);
            if (set2 == null) {
                return;
            }
            set2.add(musicId);
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public final void LJJIJ(MusicModel musicModel, int i, View view, XW2 xw2, XZC xzc) {
        this.LLJJLIIIJLLLLLLLZ = System.currentTimeMillis();
        if (LJIILLIIL(musicModel)) {
            XUQ xuq = this.LLIZ;
            if (xuq != null) {
                ((MusicDownloadPlayHelper) xuq).LJLLI = false;
            }
            LJIJI(musicModel);
            LJJIIZI(i, musicModel, xw2);
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        if (!C48203Ivv.LJ(context)) {
            AnonymousClass030.LJ(view, R.string.img);
            if (xzc == null) {
                return;
            }
            xzc.LJLJJL = -1;
            xzc.notifyDataSetChanged();
            return;
        }
        XUQ xuq2 = this.LLIZ;
        if (xuq2 != null) {
            ((MusicDownloadPlayHelper) xuq2).LJLLI = false;
        }
        LJIJI(musicModel);
        LJIL(i, musicModel, xw2);
    }
}
