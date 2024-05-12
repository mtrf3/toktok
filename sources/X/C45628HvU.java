package X;

import Y.ACListenerS27S0100000_7;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS7S0101000_3;
import Y.IDLListenerS59S0200000_7;
import Y.IDiS269S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget.HorizontalCenterLayoutManager;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS111S0300000_7;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HvU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45628HvU extends WMH implements WGT, InterfaceC144185lG, C5HC {
    public static InterfaceC45637Hvd LLJILJIL;
    public InterfaceC45540Hu4 LJLJI;
    public C45644Hvk LJLJJL;
    public C45635Hvb LJLJJLL;
    public IDiS269S0100000_7 LJLJL;
    public TextView LJLJLJ;
    public ImageView LJLJLLL;
    public TextView LJLL;
    public ChooseMediaViewModel LJLLI;
    public ViewGroup LJLLILLLL;
    public RecyclerView LJLLJ;
    public TextView LJLLL;
    public ViewTreeObserverOnGlobalLayoutListenerC45629HvV LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public TextView LJZI;
    public ImageView LJZL;
    public View LL;
    public TextView LLD;
    public View LLF;
    public C45765Hxh LLFF;
    public C58C LLFFF;
    public TextView LLFII;
    public TuxIconView LLFZ;
    public C45632HvY LLI;
    public AbstractC43973HNp LLIFFJFJJ;
    public int LLII;
    public ShortVideoContext LLIIII;
    public boolean LLIIIILZ;
    public long LLIIIJ;
    public boolean LLIIIZ;
    public InterfaceC82683Wch LLIIL;
    public AVMusic LLIILZL;
    public String LLIIZ;
    public int LLIL;
    public int LLILII;
    public InterfaceC45633HvZ LLILIL;
    public MediaModel LLILLIZIL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLIZLLLIL;
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;
    public int LJLJJI = -1;
    public ChoosePhotoPreviewPageConfig LLIIIL = new ChoosePhotoPreviewPageConfig(0);
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(C45641Hvh.LJLIL);
    public final float LLIIJLIL = 76.0f;
    public final C45548HuC LLIILII = new C45548HuC();
    public final java.util.Set<MyMediaModel> LLILL = new LinkedHashSet();
    public final SafeHandler LLILZLL = new SafeHandler(this);
    public final int LLIZ = 16;
    public final C62822Ol8 LLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 251));
    public final C62822Ol8 LLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, LiveCoverMinSizeSetting.DEFAULT));
    public boolean LLJIJIL = true;

    @Override // X.WGT
    public final void LJLIIIL() {
        this.LJLIL = false;
    }

    @Override // X.WGT
    public final void LLIZ() {
        LLJLILLLLZIIL(true);
    }

    @Override // X.WGT
    public final void onScaleBegin() {
        LLJLILLLLZIIL(false);
    }

    @Override // X.WGT
    public final C45700Hwe LJJJIL() {
        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV = this.LJLLLL;
        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV != null) {
            return viewTreeObserverOnGlobalLayoutListenerC45629HvV.getPreviewVideoClipAdapter();
        }
        o.LJIJI("timeSelectView");
        throw null;
    }

    @Override // X.WGT
    public final void LJJJJLL() {
        boolean z;
        View view = this.LJZ;
        if (view != null) {
            if (view.getAlpha() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            LLJLIL(z);
            return;
        }
        o.LJIJI("bottomDockMask");
        throw null;
    }

    @Override // X.WGT
    public final void LJJJJZI() {
        ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
        if (chooseMediaViewModel != null) {
            List LLJI = ORZ.LLJI(this.LLILL);
            if (LLJI == null) {
                return;
            }
            chooseMediaViewModel.setState(new AqS173S0100000_7(LLJI, (List<AutoCutThemeData>) 286));
            return;
        }
        o.LJIJI("chooseMediaViewModel");
        throw null;
    }

    @Override // X.WGT
    public final void LJJJLL() {
        InterfaceC45633HvZ interfaceC45633HvZ = this.LLILIL;
        if (interfaceC45633HvZ != null) {
            interfaceC45633HvZ.Wi();
        }
    }

    @Override // X.WGT
    public final View LJJLJLI() {
        C45635Hvb c45635Hvb = this.LJLJJLL;
        if (c45635Hvb != null) {
            List<MyMediaModel> list = c45635Hvb.LJLJLJ;
            C45644Hvk c45644Hvk = this.LJLJJL;
            if (c45644Hvk != null) {
                MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk.getCurrentItem(), list);
                InterfaceC45637Hvd interfaceC45637Hvd = LLJILJIL;
                if (interfaceC45637Hvd == null) {
                    return null;
                }
                return interfaceC45637Hvd.LJFF(myMediaModel);
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPagerAdapter");
        throw null;
    }

    public final PreviewVideoScene LLJJI() {
        C45635Hvb c45635Hvb = this.LJLJJLL;
        if (c45635Hvb != null) {
            C45644Hvk c45644Hvk = this.LJLJJL;
            if (c45644Hvk != null) {
                InterfaceC45640Hvg LJJIIJ = c45635Hvb.LJJIIJ(c45644Hvk.getCurrentItem());
                if (!(LJJIIJ instanceof PreviewVideoScene)) {
                    return null;
                }
                return (PreviewVideoScene) LJJIIJ;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPagerAdapter");
        throw null;
    }

    public final TextView LLJJIII() {
        TextView textView;
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
        if (choosePhotoPreviewPageConfig.showAutoCutBtn || choosePhotoPreviewPageConfig.showEditorPro) {
            textView = this.LLFII;
            if (textView == null) {
                o.LJIJI("autoCutStyleNextBtn");
                throw null;
            }
        } else {
            textView = this.LLD;
            if (textView == null) {
                o.LJIJI("nextBtn");
                throw null;
            }
        }
        return textView;
    }

    public final void LLJJIJIIJIL() {
        C45635Hvb c45635Hvb;
        List<MyMediaModel> list;
        String str;
        String str2;
        String str3;
        InterfaceC45637Hvd interfaceC45637Hvd;
        C45644Hvk c45644Hvk = this.LJLJJL;
        if (c45644Hvk != null) {
            PagerAdapter adapter = c45644Hvk.getAdapter();
            if ((adapter instanceof C45635Hvb) && (c45635Hvb = (C45635Hvb) adapter) != null && (list = c45635Hvb.LJLJLJ) != null) {
                C45644Hvk c45644Hvk2 = this.LJLJJL;
                if (c45644Hvk2 != null) {
                    MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk2.getCurrentItem(), list);
                    if (myMediaModel == null) {
                        return;
                    }
                    if (myMediaModel.libraryState != null) {
                        LJJJJZ(myMediaModel);
                    }
                    InterfaceC45637Hvd interfaceC45637Hvd2 = LLJILJIL;
                    if (interfaceC45637Hvd2 != null && !interfaceC45637Hvd2.LJIIIIZZ(myMediaModel)) {
                        return;
                    }
                    if (this.LLIIIL.supportRepeatSelect && (interfaceC45637Hvd = LLJILJIL) != null && interfaceC45637Hvd.LIZIZ()) {
                        InterfaceC45637Hvd interfaceC45637Hvd3 = LLJILJIL;
                        if (interfaceC45637Hvd3 != null) {
                            interfaceC45637Hvd3.LJII();
                            return;
                        }
                        return;
                    }
                    if (myMediaModel.selectIndex >= 0 && !this.LLIIIL.supportRepeatSelect) {
                        LLJLLIL(myMediaModel);
                        C188727au c188727au = new C188727au();
                        ShortVideoContext shortVideoContext = this.LLIIII;
                        if (shortVideoContext != null) {
                            str = shortVideoContext.LJI();
                        } else {
                            str = null;
                        }
                        c188727au.LJIIIZ("creation_id", str);
                        ShortVideoContext shortVideoContext2 = this.LLIIII;
                        if (shortVideoContext2 != null) {
                            str2 = shortVideoContext2.shootWay;
                        } else {
                            str2 = null;
                        }
                        c188727au.LJIIIZ("shoot_way", str2);
                        ShortVideoContext shortVideoContext3 = this.LLIIII;
                        if (shortVideoContext3 != null) {
                            str3 = shortVideoContext3.enterFrom;
                        } else {
                            str3 = null;
                        }
                        c188727au.LJIIIZ("enter_from", str3);
                        c188727au.LIZLLL(myMediaModel.type, "content_type");
                        c188727au.LIZLLL(C79057V0z.LJJIJ(myMediaModel) ? 1 : 0, "is_adjust_clip");
                        FMX.LJIIL("cancel_chosen_content", c188727au.LIZ);
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
                        if (choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace) {
                            ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV = this.LJLLLL;
                            if (viewTreeObserverOnGlobalLayoutListenerC45629HvV != null) {
                                viewTreeObserverOnGlobalLayoutListenerC45629HvV.setVisibility(8);
                                return;
                            } else {
                                o.LJIJI("timeSelectView");
                                throw null;
                            }
                        }
                        return;
                    }
                    ShortVideoContext shortVideoContext4 = this.LLIIII;
                    if (shortVideoContext4 != null) {
                        shortVideoContext4.isAutoSelectedAlbumPreview = false;
                    }
                    ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
                    if (chooseMediaViewModel != null) {
                        chooseMediaViewModel.setState(new AqS173S0100000_7(myMediaModel, 118));
                        return;
                    } else {
                        o.LJIJI("chooseMediaViewModel");
                        throw null;
                    }
                }
                o.LJIJI("viewPager");
                throw null;
            }
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r0 >= 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJ() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45628HvU.LLJJJ():void");
    }

    public final void LLJJJIL() {
        WM7 wm7 = this.mParentScene;
        if (wm7 instanceof SelectMaterialScene) {
            o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
            ((WMH) wm7).remove(this);
        } else {
            C78923UyF.LJIILLIIL(this).onBackPressed();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (X.C43820HHs.LIZ() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJ() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45628HvU.LLJJJJ():void");
    }

    public final void LLJJLIIIJLLLLLLLZ() {
        MusicBuzModel musicBuzModel;
        int i;
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = this.LLIIII;
        String str = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        this.LLIILZL = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        ShortVideoContext shortVideoContext2 = this.LLIIII;
        int i2 = 0;
        if (shortVideoContext2 != null) {
            i = shortVideoContext2.LJIIJJI();
        } else {
            i = 0;
        }
        this.LLIL = i;
        ShortVideoContext shortVideoContext3 = this.LLIIII;
        if (shortVideoContext3 != null) {
            str = shortVideoContext3.cameraComponentModel.mMusicPath;
        }
        this.LLIIZ = str;
        if (shortVideoContext3 != null) {
            i2 = shortVideoContext3.cameraComponentModel.mMusicStart;
        }
        this.LLILII = i2;
    }

    public final void LLJLLL() {
        String str;
        if (this.LJLLLL == null) {
            return;
        }
        C45635Hvb c45635Hvb = this.LJLJJLL;
        if (c45635Hvb != null) {
            List<MyMediaModel> list = c45635Hvb.LJLJLJ;
            C45644Hvk c45644Hvk = this.LJLJJL;
            if (c45644Hvk != null) {
                MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk.getCurrentItem(), list);
                if (myMediaModel == null) {
                    return;
                }
                if (myMediaModel.canClip) {
                    ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV = this.LJLLLL;
                    if (viewTreeObserverOnGlobalLayoutListenerC45629HvV != null) {
                        viewTreeObserverOnGlobalLayoutListenerC45629HvV.setVisibility(0);
                    } else {
                        o.LJIJI("timeSelectView");
                        throw null;
                    }
                } else {
                    ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV2 = this.LJLLLL;
                    if (viewTreeObserverOnGlobalLayoutListenerC45629HvV2 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC45629HvV2.setVisibility(8);
                    } else {
                        o.LJIJI("timeSelectView");
                        throw null;
                    }
                }
                if (!myMediaModel.LJ()) {
                    long j = myMediaModel.duration;
                    if (j <= 0) {
                        return;
                    }
                    this.LLILZIL = myMediaModel.clipDuration;
                    this.LLILLL = myMediaModel.startTime;
                    this.LLILZ = j;
                    MyMediaModel.Companion.getClass();
                    this.LLILLIZIL = C43966HNi.LIZ(myMediaModel);
                    if (myMediaModel.selectIndex >= 0 || this.LLIIIL.isEditorProReplace) {
                        String str2 = myMediaModel.id;
                        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV3 = this.LJLLLL;
                        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV3 != null) {
                            MyMediaModel currentSelectTimeMedia = viewTreeObserverOnGlobalLayoutListenerC45629HvV3.getCurrentSelectTimeMedia();
                            if (currentSelectTimeMedia != null) {
                                str = currentSelectTimeMedia.id;
                            } else {
                                str = null;
                            }
                            if (!o.LJ(str2, str)) {
                                ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV4 = this.LJLLLL;
                                if (viewTreeObserverOnGlobalLayoutListenerC45629HvV4 != null) {
                                    viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LJLJL = myMediaModel;
                                    C45700Hwe c45700Hwe = viewTreeObserverOnGlobalLayoutListenerC45629HvV4.LJLJJL;
                                    if (c45700Hwe != null) {
                                        c45700Hwe.LJLJJI = myMediaModel;
                                        c45700Hwe.LJZ(myMediaModel.width, myMediaModel.height);
                                        c45700Hwe.LJLJLJ.LIZ();
                                        c45700Hwe.notifyDataSetChanged();
                                        MyMediaModel myMediaModel2 = c45700Hwe.LJLJJI;
                                        if (myMediaModel2 != null) {
                                            c45700Hwe.LJLLLLLL(myMediaModel2);
                                        }
                                        Iterator<MyMediaModel> it = c45700Hwe.LJLJLLL.iterator();
                                        while (it.hasNext()) {
                                            c45700Hwe.LJLLLLLL(it.next());
                                        }
                                    } else {
                                        o.LJIJI("frameAdapter");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("timeSelectView");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("timeSelectView");
                            throw null;
                        }
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV5 = this.LJLLLL;
                    if (viewTreeObserverOnGlobalLayoutListenerC45629HvV5 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC45629HvV5.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS59S0200000_7(this, myMediaModel, 1));
                        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV6 = this.LJLLLL;
                        if (viewTreeObserverOnGlobalLayoutListenerC45629HvV6 != null) {
                            viewTreeObserverOnGlobalLayoutListenerC45629HvV6.getScrollCoverView().setOnFrameCoverDragListener(new C45631HvX(this, myMediaModel));
                            return;
                        } else {
                            o.LJIJI("timeSelectView");
                            throw null;
                        }
                    }
                    o.LJIJI("timeSelectView");
                    throw null;
                }
                return;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPagerAdapter");
        throw null;
    }

    @Override // X.WGT
    public final void onExit() {
        WMH wmh;
        ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.LJLJLLL = true;
            WM7 wm7 = this.mParentScene;
            if (wm7 instanceof NavigationScene) {
                NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
                if (LJIIJJI != null) {
                    new C42653Gob();
                    LJIIJJI.LLJJJ(new C42654Goc(new C82161WMj()));
                    return;
                }
                return;
            }
            if (!(wm7 instanceof WMH) || (wmh = (WMH) wm7) == null) {
                return;
            }
            wmh.remove(this);
            return;
        }
        o.LJIJI("chooseMediaViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroy() {
        C45635Hvb c45635Hvb;
        List<MyMediaModel> list;
        super.onDestroy();
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LJLJI;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityResultListener(this);
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this);
        }
        C45644Hvk c45644Hvk = this.LJLJJL;
        if (c45644Hvk != null) {
            PagerAdapter adapter = c45644Hvk.getAdapter();
            if ((adapter instanceof C45635Hvb) && (c45635Hvb = (C45635Hvb) adapter) != null && (list = c45635Hvb.LJLJLJ) != null) {
                C45644Hvk c45644Hvk2 = this.LJLJJL;
                if (c45644Hvk2 != null) {
                    MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk2.getCurrentItem(), list);
                    if (myMediaModel != null && this.LLIIIL.isEditorProReplace) {
                        if (myMediaModel.selectIndex >= 0) {
                            LLJLLIL(myMediaModel);
                        }
                        if (myMediaModel.selectIndex >= 0) {
                            C145995oB LJI = C5QW.LJI((Bundle) this.LLJI.getValue(), String.valueOf(this.LLILZIL));
                            if (LJI != null) {
                                FMX.LJIIL("choose_longer_video_replace_done", LJI.LIZ);
                                return;
                            }
                            return;
                        }
                        C145995oB LJI2 = C5QW.LJI((Bundle) this.LLJI.getValue(), String.valueOf(this.LLILZIL));
                        if (LJI2 != null) {
                            FMX.LJIIL("choose_longer_video_replace_exit", LJI2.LIZ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        C45765Hxh c45765Hxh = this.LLFF;
        if (c45765Hxh != null) {
            c45765Hxh.LIZ();
        }
        InterfaceC82683Wch interfaceC82683Wch = this.LLIIL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        InterfaceC45633HvZ interfaceC45633HvZ;
        super.onResume();
        if (HOA.LIZ() && this.LLIIIL.enablePreviewClipAdjust) {
            C45635Hvb c45635Hvb = this.LJLJJLL;
            if (c45635Hvb != null) {
                List<MyMediaModel> list = c45635Hvb.LJLJLJ;
                C45644Hvk c45644Hvk = this.LJLJJL;
                if (c45644Hvk != null) {
                    MediaModel mediaModel = (MediaModel) ORZ.LJLLLLLL(c45644Hvk.getCurrentItem(), list);
                    if (mediaModel != null && mediaModel.LJI() && ((float) mediaModel.duration) >= ((Number) this.LLIIJI.getValue()).floatValue() && (interfaceC45633HvZ = this.LLILIL) != null) {
                        interfaceC45633HvZ.show(true);
                        return;
                    }
                    return;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPagerAdapter");
            throw null;
        }
    }

    @Override // X.WGT
    public final boolean LJJJLZIJ() {
        return this.LJLIL;
    }

    @Override // X.WGT
    public final ChoosePhotoPreviewPageConfig LJJZZI() {
        return this.LLIIIL;
    }

    @Override // X.WGT
    public final void LJIIJJI(float f) {
        boolean z;
        ArrayList<MyMediaModel> arrayList;
        int max = Math.max(0, (int) (255 * f));
        C45644Hvk c45644Hvk = this.LJLJJL;
        if (c45644Hvk != null) {
            c45644Hvk.setBackgroundColor(Color.argb(max, 0, 0, 0));
            if (f == 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
                if (choosePhotoPreviewPageConfig.showDockInPreviewPage) {
                    if (this.LJLILLLLZI && !choosePhotoPreviewPageConfig.isFromCutSame && !choosePhotoPreviewPageConfig.isSoundSync && !choosePhotoPreviewPageConfig.isUgcTemplate && !choosePhotoPreviewPageConfig.isAutoCutSoundSyncMode) {
                        this.LJLILLLLZI = false;
                        AbstractC43973HNp abstractC43973HNp = this.LLIFFJFJJ;
                        if (abstractC43973HNp != null && ((arrayList = abstractC43973HNp.LJLIL) == null || arrayList.isEmpty())) {
                            View view = this.LJZ;
                            if (view != null) {
                                view.setAlpha(0.0f);
                                RecyclerView recyclerView = this.LJLLJ;
                                if (recyclerView != null) {
                                    recyclerView.setAlpha(0.0f);
                                } else {
                                    o.LJIJI("mediaRecyclerView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("bottomDockMask");
                                throw null;
                            }
                        }
                    }
                    View view2 = this.LJLZ;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLIIIL;
                        if (choosePhotoPreviewPageConfig2.isSoundSync || choosePhotoPreviewPageConfig2.isUgcTemplate || choosePhotoPreviewPageConfig2.isEditorProReplace || choosePhotoPreviewPageConfig2.isAutoCutSoundSyncMode) {
                            RecyclerView recyclerView2 = this.LJLLJ;
                            if (recyclerView2 != null) {
                                recyclerView2.setVisibility(8);
                            } else {
                                o.LJIJI("mediaRecyclerView");
                                throw null;
                            }
                        }
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = this.LLIIIL;
                        if (choosePhotoPreviewPageConfig3.showAutoCutBtn || choosePhotoPreviewPageConfig3.showEditorPro) {
                            TextView textView = this.LJLJLJ;
                            if (textView != null) {
                                textView.setVisibility(0);
                                TextView textView2 = this.LJLL;
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                    return;
                                } else {
                                    o.LJIJI("tipTxt");
                                    throw null;
                                }
                            }
                            o.LJIJI("indexTxt");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("previewDockView");
                    throw null;
                }
                ImageView imageView = this.LJLJLLL;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    TextView textView3 = this.LJLJLJ;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        TextView textView4 = this.LJLL;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            o.LJIJI("tipTxt");
                            throw null;
                        }
                    }
                    o.LJIJI("indexTxt");
                    throw null;
                }
                o.LJIJI("backBtn");
                throw null;
            }
            if (this.LLIIIL.showDockInPreviewPage) {
                View view3 = this.LJLZ;
                if (view3 != null) {
                    view3.setVisibility(4);
                    ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig4 = this.LLIIIL;
                    if (!choosePhotoPreviewPageConfig4.showAutoCutBtn && !choosePhotoPreviewPageConfig4.showEditorPro) {
                        return;
                    }
                    TextView textView5 = this.LJLJLJ;
                    if (textView5 != null) {
                        textView5.setVisibility(4);
                        TextView textView6 = this.LJLL;
                        if (textView6 != null) {
                            textView6.setVisibility(4);
                            return;
                        } else {
                            o.LJIJI("tipTxt");
                            throw null;
                        }
                    }
                    o.LJIJI("indexTxt");
                    throw null;
                }
                o.LJIJI("previewDockView");
                throw null;
            }
            ImageView imageView2 = this.LJLJLLL;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                TextView textView7 = this.LJLJLJ;
                if (textView7 != null) {
                    textView7.setVisibility(4);
                    TextView textView8 = this.LJLL;
                    if (textView8 != null) {
                        textView8.setVisibility(4);
                        return;
                    } else {
                        o.LJIJI("tipTxt");
                        throw null;
                    }
                }
                o.LJIJI("indexTxt");
                throw null;
            }
            o.LJIJI("backBtn");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.WGT
    public final void LJJJJZ(MyMediaModel myMediaModel) {
        o.LJIIIZ(myMediaModel, "myMediaModel");
        if (myMediaModel.selectIndex != -1 && myMediaModel.libraryState.isFailed()) {
            myMediaModel.libraryState.setLastDownloadFailed(true);
        }
        ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.Nv0(myMediaModel);
        } else {
            o.LJIJI("chooseMediaViewModel");
            throw null;
        }
    }

    @Override // X.WGT
    public final void LJJLIL(int i) {
        InterfaceC45633HvZ interfaceC45633HvZ = this.LLILIL;
        if (interfaceC45633HvZ != null) {
            interfaceC45633HvZ.EZ(i);
        }
    }

    @Override // X.WGT
    public final void LLIIL(MyMediaModel myMediaModel) {
        Activity activity = this.mActivity;
        if (activity != null) {
            GND.LIZ(activity, myMediaModel.id);
        }
    }

    @Override // X.WGT
    public final void LLILZ(int i) {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            C5S1 c5s1 = new C5S1(requireActivity());
            c5s1.LIZJ(i);
            c5s1.LJ();
            SceneExtensionsKt.LIZJ(this, new ARunnableS43S0100000_7(this, 37), 2000L);
        }
    }

    public final void LLJILJIL(int i) {
        View view;
        if (i < 0) {
            return;
        }
        RecyclerView recyclerView = this.LJLLJ;
        if (recyclerView != null) {
            RecyclerView.ViewHolder LJJIZ = recyclerView.LJJIZ(i);
            if (LJJIZ != null) {
                view = LJJIZ.itemView;
            } else {
                view = null;
            }
            int i2 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.LJLLJ;
                if (recyclerView2 != null) {
                    int i3 = i - 1;
                    if (i3 > 0) {
                        i2 = i3;
                    }
                    recyclerView2.LJLI(i2);
                    return;
                }
                o.LJIJI("mediaRecyclerView");
                throw null;
            }
            RecyclerView recyclerView3 = this.LJLLJ;
            if (recyclerView3 != null) {
                int i4 = i - 1;
                if (i4 > 0) {
                    i2 = i4;
                }
                recyclerView3.LJLIL(i2);
                return;
            }
            o.LJIJI("mediaRecyclerView");
            throw null;
        }
        o.LJIJI("mediaRecyclerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (X.C42117Gfx.LJ() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel r11) {
        /*
            r10 = this;
            X.Hvd r0 = X.C45628HvU.LLJILJIL
            r9 = 0
            r1 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.LIZLLL()
            if (r0 != r1) goto L18
        Lc:
            X.Hvd r0 = X.C45628HvU.LLJILJIL
            if (r0 == 0) goto L1d
            boolean r0 = r0.LIZIZ()
            if (r0 != r1) goto L1d
        L16:
            r9 = 1
        L17:
            return r9
        L18:
            int r0 = r11.selectIndex
            if (r0 >= 0) goto L1d
            goto Lc
        L1d:
            boolean r0 = r11.LJI()
            if (r0 == 0) goto L3b
            long r3 = r11.duration
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3b
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r1 = r10.LLIIIL
            boolean r0 = r1.isUgcTemplate
            if (r0 != 0) goto L3b
            boolean r0 = r1.isEditorProReplace
            if (r0 != 0) goto L3b
            boolean r0 = X.C42117Gfx.LJ()
            if (r0 == 0) goto L16
        L3b:
            int r8 = r11.width
            double r3 = (double) r8
            int r7 = r11.height
            double r1 = (double) r7
            r5 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r1 = r1 * r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L52
            double r3 = (double) r7
            double r1 = (double) r8
            double r1 = r1 * r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
        L52:
            boolean r0 = X.C42117Gfx.LIZ()
            if (r0 == 0) goto L16
        L58:
            boolean r0 = X.WGW.LIZIZ(r11)
            if (r0 == 0) goto L17
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45628HvU.LLJJ(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel):boolean");
    }

    public final void LLJJIJI(boolean z) {
        C45635Hvb c45635Hvb;
        List<MyMediaModel> list;
        MyMediaModel myMediaModel;
        CreativeFlowData creativeFlowData;
        long currentTimeMillis = System.currentTimeMillis() - this.LLIIIJ;
        if (1 <= currentTimeMillis && currentTimeMillis < 500) {
            return;
        }
        this.LLIIIJ = System.currentTimeMillis();
        ShortVideoContext shortVideoContext = this.LLIIII;
        if (shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null) {
            if (creativeFlowData.getEditorProModel() == null) {
                creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, null, null, null, false, false, 0, false, false, null, false, null, null, null, null, null, false, null, z, false, false, false, null, 32501759, null));
            } else {
                EditorProModel editorProModel = creativeFlowData.getEditorProModel();
                if (editorProModel != null) {
                    editorProModel.setFromEditorProEntranceInAlbum(z);
                }
            }
        }
        if (this.LLIIIL.stickerMultiPhotosMode) {
            if (LLJJIII().getAlpha() == 1.0f) {
                LLJLIL(true);
                ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.setState(C45572Hua.LJLIL);
                    return;
                } else {
                    o.LJIJI("chooseMediaViewModel");
                    throw null;
                }
            }
            return;
        }
        RecyclerView recyclerView = this.LJLLJ;
        if (recyclerView != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (adapter != null && adapter.getItemCount() == 0 && this.LLII >= 0 && this.LLIIIILZ) {
                C45644Hvk c45644Hvk = this.LJLJJL;
                if (c45644Hvk != null) {
                    PagerAdapter adapter2 = c45644Hvk.getAdapter();
                    if (!(adapter2 instanceof C45635Hvb) || (c45635Hvb = (C45635Hvb) adapter2) == null || (list = c45635Hvb.LJLJLJ) == null || (myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(this.LLII, list)) == null) {
                        return;
                    }
                    ChooseMediaViewModel chooseMediaViewModel2 = this.LJLLI;
                    if (chooseMediaViewModel2 != null) {
                        InterfaceC45637Hvd interfaceC45637Hvd = LLJILJIL;
                        if (interfaceC45637Hvd != null && !interfaceC45637Hvd.LJIIIIZZ(myMediaModel)) {
                            return;
                        }
                        ShortVideoContext shortVideoContext2 = this.LLIIII;
                        if (shortVideoContext2 != null) {
                            shortVideoContext2.isAutoSelectedAlbumPreview = true;
                        }
                        chooseMediaViewModel2.LJLLI = myMediaModel;
                        chooseMediaViewModel2.LJLL = true;
                        chooseMediaViewModel2.setState(new AqS173S0100000_7(myMediaModel, 118));
                        return;
                    }
                    o.LJIJI("chooseMediaViewModel");
                    throw null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            LLJLIL(true);
            ChooseMediaViewModel chooseMediaViewModel3 = this.LJLLI;
            if (chooseMediaViewModel3 != null) {
                chooseMediaViewModel3.setState(C45572Hua.LJLIL);
                return;
            } else {
                o.LJIJI("chooseMediaViewModel");
                throw null;
            }
        }
        o.LJIJI("mediaRecyclerView");
        throw null;
    }

    public final void LLJJIJIL(List<MyMediaModel> list) {
        ArrayList arrayList;
        String str;
        String str2 = null;
        if (list != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (MyMediaModel myMediaModel : list) {
                C63B c63b = AutoCutMediaModel.Companion;
                Context sceneContext = getSceneContext();
                c63b.getClass();
                arrayList.add(C63B.LIZ(sceneContext, myMediaModel));
            }
        } else {
            arrayList = null;
        }
        ShortVideoContext shortVideoContext = this.LLIIII;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
            str2 = shortVideoContext.LJI();
        } else {
            str = null;
        }
        C45049Hm9.LJIIJ(arrayList, "preview_page", str, str2, false, 0, "");
    }

    public final void LLJJL(boolean z) {
        if (getSceneContext() == null) {
            return;
        }
        TextView LLJJIII = LLJJIII();
        Context requireSceneContext = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        LLJJIII.setBackground(C44729Hgz.LJJJJ(requireSceneContext, !z));
        if (!z) {
            TextView LLJJIII2 = LLJJIII();
            Context requireSceneContext2 = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
            LLJJIII2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, requireSceneContext2));
            return;
        }
        TextView LLJJIII3 = LLJJIII();
        Context requireSceneContext3 = requireSceneContext();
        o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
        LLJJIII3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, requireSceneContext3));
    }

    public final void LLJLIL(boolean z) {
        ArrayList<MyMediaModel> arrayList;
        boolean z2;
        InterfaceC45637Hvd interfaceC45637Hvd;
        InterfaceC45633HvZ interfaceC45633HvZ = this.LLILIL;
        if (interfaceC45633HvZ != null) {
            interfaceC45633HvZ.mV(z);
        }
        View view = this.LJZ;
        if (view != null) {
            C45803HyJ.LIZ(view, z);
            AbstractC43973HNp abstractC43973HNp = this.LLIFFJFJJ;
            if (abstractC43973HNp != null) {
                arrayList = abstractC43973HNp.LJLIL;
            } else {
                arrayList = null;
            }
            boolean z3 = false;
            if (arrayList == null || arrayList.isEmpty() || (((interfaceC45637Hvd = LLJILJIL) != null && interfaceC45637Hvd.LIZ() == 5) || (HOA.LIZ() && this.LLIIIL.enablePreviewClipAdjust))) {
                z2 = false;
            } else {
                z2 = true;
            }
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
            if (!choosePhotoPreviewPageConfig.isSoundSync && !choosePhotoPreviewPageConfig.isUgcTemplate && !choosePhotoPreviewPageConfig.isEditorProReplace && !choosePhotoPreviewPageConfig.isAutoCutSoundSyncMode) {
                RecyclerView recyclerView = this.LJLLJ;
                if (recyclerView != null) {
                    if (z && z2) {
                        z3 = true;
                    }
                    C45803HyJ.LIZ(recyclerView, z3);
                    return;
                }
                o.LJIJI("mediaRecyclerView");
                throw null;
            }
            return;
        }
        o.LJIJI("bottomDockMask");
        throw null;
    }

    public final void LLJLILLLLZIIL(boolean z) {
        if (z) {
            View view = this.LJLZ;
            if (view != null) {
                view.setVisibility(0);
                ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
                if (choosePhotoPreviewPageConfig.isSoundSync || choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace || choosePhotoPreviewPageConfig.isAutoCutSoundSyncMode) {
                    RecyclerView recyclerView = this.LJLLJ;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        return;
                    } else {
                        o.LJIJI("mediaRecyclerView");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("previewDockView");
            throw null;
        }
        View view2 = this.LJLZ;
        if (view2 != null) {
            view2.setVisibility(8);
        } else {
            o.LJIJI("previewDockView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLJLL(List<MyMediaModel> list) {
        ViewTreeObserverOnGlobalLayoutListenerC45629HvV viewTreeObserverOnGlobalLayoutListenerC45629HvV;
        ArrayList arrayList = new ArrayList();
        Integer[] numArr = new Integer[2];
        C45644Hvk c45644Hvk = this.LJLJJL;
        if (c45644Hvk != null) {
            numArr[0] = Integer.valueOf(c45644Hvk.getCurrentItem() - 1);
            C45644Hvk c45644Hvk2 = this.LJLJJL;
            if (c45644Hvk2 != null) {
                numArr[1] = Integer.valueOf(c45644Hvk2.getCurrentItem() + 1);
                Iterator it = C47261Igj.LJJIJIIJI(numArr).iterator();
                while (it.hasNext()) {
                    MediaModel mediaModel = (MediaModel) ORZ.LJLLLLLL(((Number) it.next()).intValue(), list);
                    if (mediaModel != null && mediaModel.LJI()) {
                        arrayList.add(mediaModel);
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC45633HvZ interfaceC45633HvZ = this.LLILIL;
                    if (interfaceC45633HvZ != null) {
                        interfaceC45633HvZ.NZ(arrayList);
                    }
                    ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLIIIL;
                    if ((choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace) && (viewTreeObserverOnGlobalLayoutListenerC45629HvV = this.LJLLLL) != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            MediaModel mediaModel2 = (MediaModel) it2.next();
                            if (mediaModel2.fileLocalUriPath != null) {
                                C45700Hwe c45700Hwe = viewTreeObserverOnGlobalLayoutListenerC45629HvV.LJLJJL;
                                if (c45700Hwe != null) {
                                    c45700Hwe.LJLJLLL.add(mediaModel2);
                                } else {
                                    o.LJIJI("frameAdapter");
                                    throw null;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public final void LLJLLIL(MyMediaModel media) {
        C45584Hum<String> BY;
        InterfaceC45633HvZ interfaceC45633HvZ = this.LLILIL;
        if (interfaceC45633HvZ != null && (BY = interfaceC45633HvZ.BY()) != null) {
            String str = media.id;
            o.LJIIIIZZ(str, "myMediaModel.id");
            MediaModel mediaModel = (MediaModel) ((LinkedHashMap) BY.LIZ).get(str);
            if (mediaModel != null) {
                media.startTime = mediaModel.startTime;
                media.endTime = mediaModel.endTime;
            }
        }
        InterfaceC45633HvZ interfaceC45633HvZ2 = this.LLILIL;
        if (interfaceC45633HvZ2 != null) {
            interfaceC45633HvZ2.xq(media);
        }
        InterfaceC45633HvZ interfaceC45633HvZ3 = this.LLILIL;
        if (interfaceC45633HvZ3 != null) {
            interfaceC45633HvZ3.gO();
        }
        this.LLILL.remove(media);
        ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
        if (chooseMediaViewModel != null) {
            o.LJIIIZ(media, "media");
            chooseMediaViewModel.setState(new AqS173S0100000_7(media, 276));
            if (this.LLIIIZ) {
                C45635Hvb c45635Hvb = this.LJLJJLL;
                if (c45635Hvb != null) {
                    if (c45635Hvb.getCount() < 2) {
                        return;
                    }
                    C45635Hvb c45635Hvb2 = this.LJLJJLL;
                    if (c45635Hvb2 != null) {
                        int i = media.mediaIndex;
                        if (i < c45635Hvb2.LJLJLJ.size() && i >= 0) {
                            ((LinkedHashMap) c45635Hvb2.LJLJL).clear();
                            ListProtector.remove(c45635Hvb2.LJLJLJ, i);
                            c45635Hvb2.LJJIIJZLJL();
                            c45635Hvb2.notifyDataSetChanged();
                        }
                        ChooseMediaViewModel chooseMediaViewModel2 = this.LJLLI;
                        if (chooseMediaViewModel2 != null) {
                            C45635Hvb c45635Hvb3 = this.LJLJJLL;
                            if (c45635Hvb3 != null) {
                                List<MyMediaModel> list = c45635Hvb3.LJLJLJ;
                                o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> }");
                                chooseMediaViewModel2.LJLLJ = 0;
                                chooseMediaViewModel2.Rv0((ArrayList) list);
                                return;
                            }
                            o.LJIJI("viewPagerAdapter");
                            throw null;
                        }
                        o.LJIJI("chooseMediaViewModel");
                        throw null;
                    }
                    o.LJIJI("viewPagerAdapter");
                    throw null;
                }
                o.LJIJI("viewPagerAdapter");
                throw null;
            }
            return;
        }
        o.LJIJI("chooseMediaViewModel");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        CreativeInfo creativeInfo;
        LiveEvent<OSZ<Integer, Integer>> mU;
        LiveEvent<OSZ<Integer, Integer>> q70;
        LiveEvent<Boolean> GF;
        LiveEvent<Integer> qU;
        AbstractC43973HNp abstractC43973HNp;
        boolean z;
        View view;
        Activity activity;
        Window window;
        int i;
        View view2;
        InterfaceC45633HvZ interfaceC45633HvZ;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = (ChoosePhotoPreviewPageConfig) bundle2.getParcelable("PREVIEW_CONFIG");
            if (choosePhotoPreviewPageConfig != null) {
                this.LLIIIL = choosePhotoPreviewPageConfig;
                this.LLIIIILZ = choosePhotoPreviewPageConfig.nextRuleAdjustment;
            }
            this.LLIIII = (ShortVideoContext) bundle2.getParcelable("key_short_video_context");
            this.LLIIIZ = bundle2.getBoolean("from_album_thumbnail");
        }
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C78688UuS.LJIIIZ(this, false, new AqS133S0200000_2(requireActivity, this, 44));
        C44384HbQ.LJIIIZ(this, new AqS173S0100000_7(this, 138));
        if (HOA.LIZ() && this.LLIIIL.enablePreviewClipAdjust) {
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI != null) {
                interfaceC45633HvZ = (InterfaceC45633HvZ) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC45633HvZ.class);
            } else {
                interfaceC45633HvZ = null;
            }
            this.LLILIL = interfaceC45633HvZ;
        }
        View requireViewById = requireViewById(R.id.el1);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.index_txt)");
        this.LJLJLJ = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.l8w);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tip_txt)");
        TextView textView = (TextView) requireViewById2;
        this.LJLL = textView;
        textView.setShadowLayer(C32151Nz.LJIIZILJ(3), 0.0f, C32151Nz.LJIIZILJ(1), ColorProtector.parseColor("#33000000"));
        View requireViewById3 = requireViewById(R.id.aej);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.back_btn)");
        ImageView imageView = (ImageView) requireViewById3;
        this.LJLJLLL = imageView;
        C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 45));
        View requireViewById4 = requireViewById(R.id.jlo);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.select_layout)");
        this.LJLLILLLL = (ViewGroup) requireViewById4;
        TextView textView2 = this.LJLJLJ;
        if (textView2 != null) {
            int LIZJ = (int) KL2.LIZJ(requireActivity(), 20.0f);
            Object parent = textView2.getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                view2.post(new ARunnableS7S0101000_3(LIZJ, textView2, 5));
            }
            ViewGroup viewGroup = this.LJLLILLLL;
            if (viewGroup != null) {
                C16880lQ.LJIIL(viewGroup, new IDlS63S0100000_7(this, 5));
                boolean z2 = this.LLIIIL.showDockInPreviewPage;
                ShortVideoContext shortVideoContext = this.LLIIII;
                if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
                    creativeInfo = new CreativeInfo(null, 0, null, 7, null);
                }
                this.LJLJJLL = new C45635Hvb(this, this, z2, creativeInfo);
                View requireViewById5 = requireViewById(R.id.nb6);
                o.LJIIIIZZ(requireViewById5, "requireViewById<PreviewG…ewPager>(R.id.view_pager)");
                this.LJLJJL = (C45644Hvk) requireViewById5;
                JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChooseMediaViewModel.class);
                o.LJIIIIZZ(LIZ, "of(this)\n            .ge…diaViewModel::class.java)");
                this.LJLLI = (ChooseMediaViewModel) LIZ;
                if (this.LLIIIL.showDockInPreviewPage) {
                    ImageView imageView2 = this.LJLJLLL;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LLIIIL;
                        if (!choosePhotoPreviewPageConfig2.showAutoCutBtn && !choosePhotoPreviewPageConfig2.showEditorPro) {
                            TextView textView3 = this.LJLJLJ;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                                ViewGroup viewGroup2 = this.LJLLILLLL;
                                if (viewGroup2 != null) {
                                    viewGroup2.setVisibility(8);
                                } else {
                                    o.LJIJI("selectLayout");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("indexTxt");
                                throw null;
                            }
                        }
                        if (getSceneContext() != null && (activity = this.mActivity) != null && (window = activity.getWindow()) != null) {
                            Context requireSceneContext = requireSceneContext();
                            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                            Integer LJI = C79045V0n.LJI(R.attr.d4, requireSceneContext);
                            if (LJI != null) {
                                i = LJI.intValue();
                            } else {
                                i = -16777216;
                            }
                            window.setNavigationBarColor(i);
                        }
                        View requireViewById6 = requireViewById(R.id.i2o);
                        o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.preview_dock)");
                        this.LJLZ = requireViewById6;
                        View requireViewById7 = requireViewById(R.id.apl);
                        o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.bottom_dock_mask)");
                        this.LJZ = requireViewById7;
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig3 = this.LLIIIL;
                        if (choosePhotoPreviewPageConfig3.showAutoCutBtn || choosePhotoPreviewPageConfig3.showEditorPro) {
                            ViewGroup.LayoutParams layoutParams = requireViewById7.getLayoutParams();
                            layoutParams.height = (int) KL2.LIZJ(requireSceneContext(), this.LLIIJLIL);
                            View view3 = this.LJZ;
                            if (view3 != null) {
                                view3.setLayoutParams(layoutParams);
                            } else {
                                o.LJIJI("bottomDockMask");
                                throw null;
                            }
                        }
                        if (HOA.LIZ() && this.LLIIIL.enablePreviewClipAdjust) {
                            View view4 = this.LJZ;
                            if (view4 != null) {
                                int i2 = view4.getLayoutParams().height;
                                InterfaceC45633HvZ interfaceC45633HvZ2 = this.LLILIL;
                                if (interfaceC45633HvZ2 != null) {
                                    interfaceC45633HvZ2.oW(i2);
                                }
                            } else {
                                o.LJIJI("bottomDockMask");
                                throw null;
                            }
                        }
                        View requireViewById8 = requireViewById(R.id.k10);
                        o.LJIIIIZZ(requireViewById8, "requireViewById(R.id.single_select_indicator)");
                        this.LJLLL = (TextView) requireViewById8;
                        View requireViewById9 = requireViewById(R.id.gpb);
                        o.LJIIIIZZ(requireViewById9, "requireViewById(R.id.multi_select_indicator)");
                        this.LJLLLLLL = requireViewById9;
                        View requireViewById10 = requireViewById(R.id.ggm);
                        o.LJIIIIZZ(requireViewById10, "requireViewById(R.id.media_recyclerview)");
                        this.LJLLJ = (RecyclerView) requireViewById10;
                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig4 = this.LLIIIL;
                        if (choosePhotoPreviewPageConfig4.isSoundSync || choosePhotoPreviewPageConfig4.isUgcTemplate || choosePhotoPreviewPageConfig4.isEditorProReplace || choosePhotoPreviewPageConfig4.isAutoCutSoundSyncMode || (HOA.LIZ() && this.LLIIIL.enablePreviewClipAdjust)) {
                            RecyclerView recyclerView = this.LJLLJ;
                            if (recyclerView != null) {
                                recyclerView.setVisibility(8);
                            } else {
                                o.LJIJI("mediaRecyclerView");
                                throw null;
                            }
                        }
                        RecyclerView recyclerView2 = this.LJLLJ;
                        if (recyclerView2 != null) {
                            Context sceneContext = getSceneContext();
                            o.LJII(sceneContext, "null cannot be cast to non-null type android.content.Context");
                            recyclerView2.setLayoutManager(new HorizontalCenterLayoutManager(sceneContext));
                            RecyclerView recyclerView3 = this.LJLLJ;
                            if (recyclerView3 != null) {
                                C40171ht c40171ht = new C40171ht();
                                c40171ht.LIZJ = 250L;
                                c40171ht.LIZLLL = 250L;
                                c40171ht.LJ = 250L;
                                c40171ht.LJFF = 250L;
                                recyclerView3.setItemAnimator(c40171ht);
                                View requireViewById11 = requireViewById(R.id.ei2);
                                o.LJIIIIZZ(requireViewById11, "requireViewById(R.id.image_select_tips)");
                                this.LJZI = (TextView) requireViewById11;
                                View requireViewById12 = requireViewById(R.id.gz7);
                                o.LJIIIIZZ(requireViewById12, "requireViewById(R.id.new_back_btn)");
                                this.LJZL = (ImageView) requireViewById12;
                                if (e1.LIZ(31744, "studio_zoom_in_on_the_selected_hot_zone", true, false) && !HOE.LIZ) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    ImageView imageView3 = this.LJZL;
                                    if (imageView3 != null) {
                                        int LIZIZ = C7MY.LIZIZ(20);
                                        Object parent2 = imageView3.getParent();
                                        if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                                            view.post(new ARunnableS7S0101000_3(LIZIZ, imageView3, 5));
                                        }
                                    } else {
                                        o.LJIJI("newBackBtn");
                                        throw null;
                                    }
                                }
                                ImageView imageView4 = this.LJZL;
                                if (imageView4 != null) {
                                    C16880lQ.LJIILLIIL(imageView4, new ACListenerS27S0100000_7(this, 46));
                                    View requireViewById13 = requireViewById(R.id.jlp);
                                    o.LJIIIIZZ(requireViewById13, "requireViewById(R.id.select_layout_preview_dock)");
                                    this.LL = requireViewById13;
                                    C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 7), requireViewById13);
                                    if (this.LLIIIL.isEditorProReplace) {
                                        View view5 = this.LL;
                                        if (view5 != null) {
                                            view5.setVisibility(8);
                                        } else {
                                            o.LJIJI("previewSelectLayout");
                                            throw null;
                                        }
                                    }
                                    View requireViewById14 = requireViewById(R.id.h0v);
                                    o.LJIIIIZZ(requireViewById14, "requireViewById(R.id.next_btn)");
                                    this.LLD = (TextView) requireViewById14;
                                    View requireViewById15 = requireViewById(R.id.b0g);
                                    o.LJIIIIZZ(requireViewById15, "requireViewById(R.id.btns_dock)");
                                    this.LLF = requireViewById15;
                                    View requireViewById16 = requireViewById(R.id.aac);
                                    o.LJIIIIZZ(requireViewById16, "requireViewById(R.id.auto_cut_btn)");
                                    this.LLFF = (C45765Hxh) requireViewById16;
                                    View requireViewById17 = requireViewById(R.id.cqn);
                                    o.LJIIIIZZ(requireViewById17, "requireViewById(R.id.editor_pro_btn)");
                                    this.LLFFF = (C58C) requireViewById17;
                                    View requireViewById18 = requireViewById(R.id.h0w);
                                    o.LJIIIIZZ(requireViewById18, "requireViewById(R.id.next_btn_auto_cut_style)");
                                    this.LLFII = (TextView) requireViewById18;
                                    View requireViewById19 = requireViewById(R.id.h0x);
                                    o.LJIIIIZZ(requireViewById19, "requireViewById(R.id.next_btn_ep_auto_cut_style)");
                                    this.LLFZ = (TuxIconView) requireViewById19;
                                    if (C58B.LIZ()) {
                                        C45765Hxh c45765Hxh = this.LLFF;
                                        if (c45765Hxh != null) {
                                            Context requireSceneContext2 = requireSceneContext();
                                            o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                                            c45765Hxh.setBackground(C44729Hgz.LIZIZ(requireSceneContext2, true));
                                            C58C c58c = this.LLFFF;
                                            if (c58c != null) {
                                                Context requireSceneContext3 = requireSceneContext();
                                                o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
                                                c58c.setBackground(C44729Hgz.LIZIZ(requireSceneContext3, true));
                                                TextView textView4 = this.LLD;
                                                if (textView4 != null) {
                                                    Context requireSceneContext4 = requireSceneContext();
                                                    o.LJIIIIZZ(requireSceneContext4, "requireSceneContext()");
                                                    textView4.setBackground(C44729Hgz.LJJJJ(requireSceneContext4, true));
                                                    TuxIconView tuxIconView = this.LLFZ;
                                                    if (tuxIconView != null) {
                                                        Context requireSceneContext5 = requireSceneContext();
                                                        o.LJIIIIZZ(requireSceneContext5, "requireSceneContext()");
                                                        tuxIconView.setBackground(C44729Hgz.LJIILIIL(requireSceneContext5, true, false));
                                                    } else {
                                                        o.LJIJI("epAutoCutStyleNextBtn");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("nextBtn");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("editorProBtn");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("autoCutBtn");
                                            throw null;
                                        }
                                    }
                                    C16880lQ.LJIJI(LLJJIII(), new IDlS63S0100000_7(this, 8));
                                    TuxIconView tuxIconView2 = this.LLFZ;
                                    if (tuxIconView2 != null) {
                                        C16880lQ.LJJJ(tuxIconView2, new IDlS63S0100000_7(this, 9));
                                        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig5 = this.LLIIIL;
                                        if (choosePhotoPreviewPageConfig5.showAutoCutBtn || choosePhotoPreviewPageConfig5.showEditorPro) {
                                            View view6 = this.LL;
                                            if (view6 != null) {
                                                view6.setVisibility(8);
                                                TextView textView5 = this.LLD;
                                                if (textView5 != null) {
                                                    textView5.setVisibility(8);
                                                    View view7 = this.LLF;
                                                    if (view7 != null) {
                                                        view7.setVisibility(0);
                                                        C45765Hxh c45765Hxh2 = this.LLFF;
                                                        if (c45765Hxh2 != null) {
                                                            c45765Hxh2.setAnimListener(new C45634Hva(this));
                                                            C45161Hnx.LIZIZ(null);
                                                            LLJJJJ();
                                                            C58C c58c2 = this.LLFFF;
                                                            if (c58c2 != null) {
                                                                c58c2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 47)));
                                                                C45765Hxh c45765Hxh3 = this.LLFF;
                                                                if (c45765Hxh3 != null) {
                                                                    c45765Hxh3.setOnClickListener(new ViewOnClickListenerC13880ga(new C45627HvT(this)));
                                                                } else {
                                                                    o.LJIJI("autoCutBtn");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("editorProBtn");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("autoCutBtn");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("btnsDock");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("nextBtn");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("previewSelectLayout");
                                                throw null;
                                            }
                                        }
                                        ChooseMediaViewModel chooseMediaViewModel = this.LJLLI;
                                        if (chooseMediaViewModel == null) {
                                            o.LJIJI("chooseMediaViewModel");
                                            throw null;
                                        }
                                        chooseMediaViewModel.Iv0(this, new TBT() { // from class: X.Hur
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((ChooseMediaState) obj).getPreviewDockerState();
                                            }
                                        }, new C73165SnZ(), new AqS173S0100000_7(this, 135));
                                        View requireViewById20 = requireViewById(R.id.d2n);
                                        o.LJIIIIZZ(requireViewById20, "requireViewById(R.id.extract_music_view)");
                                        this.LLI = (C45632HvY) requireViewById20;
                                        InterfaceC45637Hvd interfaceC45637Hvd = LLJILJIL;
                                        if (interfaceC45637Hvd != null && interfaceC45637Hvd.LIZ() == 5) {
                                            Context sceneContext2 = getSceneContext();
                                            if (sceneContext2 != null) {
                                                int LIZIZ2 = C04330Ez.LIZIZ(sceneContext2, R.color.ey);
                                                C45632HvY c45632HvY = this.LLI;
                                                if (c45632HvY != null) {
                                                    c45632HvY.setBackGroundColor(LIZIZ2);
                                                } else {
                                                    o.LJIJI("extractMusicView");
                                                    throw null;
                                                }
                                            }
                                            C45632HvY c45632HvY2 = this.LLI;
                                            if (c45632HvY2 != null) {
                                                c45632HvY2.setVisibility(0);
                                                C45632HvY c45632HvY3 = this.LLI;
                                                if (c45632HvY3 != null) {
                                                    c45632HvY3.setOnExtractClick(new ACListenerS27S0100000_7(this, 44));
                                                    RecyclerView recyclerView4 = this.LJLLJ;
                                                    if (recyclerView4 != null) {
                                                        recyclerView4.setVisibility(8);
                                                        TextView textView6 = this.LLD;
                                                        if (textView6 != null) {
                                                            textView6.setVisibility(8);
                                                            View view8 = this.LL;
                                                            if (view8 != null) {
                                                                view8.setVisibility(8);
                                                            } else {
                                                                o.LJIJI("previewSelectLayout");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("nextBtn");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("mediaRecyclerView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("extractMusicView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("extractMusicView");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIJI("epAutoCutStyleNextBtn");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("newBackBtn");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("mediaRecyclerView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mediaRecyclerView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("backBtn");
                        throw null;
                    }
                }
                TextView textView7 = this.LJLL;
                if (textView7 != null) {
                    textView7.setShadowLayer(C32151Nz.LJIIZILJ(3), 0.0f, C32151Nz.LJIIZILJ(1), ColorProtector.parseColor("#33000000"));
                    IDiS269S0100000_7 iDiS269S0100000_7 = new IDiS269S0100000_7(this, 2);
                    this.LJLJL = iDiS269S0100000_7;
                    C45644Hvk c45644Hvk = this.LJLJJL;
                    if (c45644Hvk != null) {
                        c45644Hvk.addOnPageChangeListener(iDiS269S0100000_7);
                        C45644Hvk c45644Hvk2 = this.LJLJJL;
                        if (c45644Hvk2 != null) {
                            c45644Hvk2.setGestureCallback(new C45638Hve(this));
                            C45644Hvk c45644Hvk3 = this.LJLJJL;
                            if (c45644Hvk3 != null) {
                                C45635Hvb c45635Hvb = this.LJLJJLL;
                                if (c45635Hvb != null) {
                                    c45644Hvk3.setAdapter(c45635Hvb);
                                    if (this.LLIIIL.isEditorProReplace) {
                                        C45644Hvk c45644Hvk4 = this.LJLJJL;
                                        if (c45644Hvk4 != null) {
                                            c45644Hvk4.setCanScroll(false);
                                        } else {
                                            o.LJIJI("viewPager");
                                            throw null;
                                        }
                                    }
                                    ChooseMediaViewModel chooseMediaViewModel2 = this.LJLLI;
                                    if (chooseMediaViewModel2 == null) {
                                        o.LJIJI("chooseMediaViewModel");
                                        throw null;
                                    }
                                    chooseMediaViewModel2.Iv0(this, new TBT() { // from class: X.Hug
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((ChooseMediaState) obj).getMediaListState();
                                        }
                                    }, new C73165SnZ(), new AqS173S0100000_7(this, 133));
                                    if (HBT.LIZ() && !this.LLIIIL.isEditorProReplace) {
                                        ChooseMediaViewModel chooseMediaViewModel3 = this.LJLLI;
                                        if (chooseMediaViewModel3 == null) {
                                            o.LJIJI("chooseMediaViewModel");
                                            throw null;
                                        }
                                        chooseMediaViewModel3.Iv0(this, new TBT() { // from class: X.Huf
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((ChooseMediaState) obj).getLibraryDownloadResultState();
                                            }
                                        }, new C73165SnZ(), new AqS173S0100000_7(this, 134));
                                        ChooseMediaViewModel chooseMediaViewModel4 = this.LJLLI;
                                        if (chooseMediaViewModel4 == null) {
                                            o.LJIJI("chooseMediaViewModel");
                                            throw null;
                                        }
                                        chooseMediaViewModel4.Iv0(this, new TBT() { // from class: X.Hue
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((ChooseMediaState) obj).getLibraryDownloadProgressState();
                                            }
                                        }, new C73165SnZ(), new AqS173S0100000_7(this, 131));
                                    }
                                    C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new C45636Hvc(this));
                                    if (this.LLIIIL.showDockInPreviewPage && (abstractC43973HNp = this.LLIFFJFJJ) != null) {
                                        abstractC43973HNp.LJLJJLL = new C45630HvW(abstractC43973HNp, this);
                                        ChooseMediaViewModel chooseMediaViewModel5 = this.LJLLI;
                                        if (chooseMediaViewModel5 == null) {
                                            o.LJIJI("chooseMediaViewModel");
                                            throw null;
                                        }
                                        chooseMediaViewModel5.Iv0(this, new TBT() { // from class: X.Hus
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((ChooseMediaState) obj).getPreviewDockerInitMediaList();
                                            }
                                        }, new C73165SnZ(), new AqS173S0100000_7(this, 141));
                                        ChooseMediaViewModel chooseMediaViewModel6 = this.LJLLI;
                                        if (chooseMediaViewModel6 != null) {
                                            C45591Hut c45591Hut = new TBT() { // from class: X.Hut
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((ChooseMediaState) obj).getPreviewDockerDelMediaState();
                                                }
                                            };
                                            C73165SnZ c73165SnZ = new C73165SnZ();
                                            c73165SnZ.LIZ = true;
                                            chooseMediaViewModel6.Iv0(this, c45591Hut, c73165SnZ, new AqS138S0200000_7(abstractC43973HNp, this, 21));
                                            ChooseMediaViewModel chooseMediaViewModel7 = this.LJLLI;
                                            if (chooseMediaViewModel7 != null) {
                                                C45587Hup c45587Hup = new TBT() { // from class: X.Hup
                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                    public final Object get(Object obj) {
                                                        return ((ChooseMediaState) obj).getPreviewDockerAddMediaState();
                                                    }
                                                };
                                                C73165SnZ c73165SnZ2 = new C73165SnZ();
                                                c73165SnZ2.LIZ = true;
                                                chooseMediaViewModel7.Iv0(this, c45587Hup, c73165SnZ2, new AqS138S0200000_7(abstractC43973HNp, this, 22));
                                                ChooseMediaViewModel chooseMediaViewModel8 = this.LJLLI;
                                                if (chooseMediaViewModel8 == null) {
                                                    o.LJIJI("chooseMediaViewModel");
                                                    throw null;
                                                }
                                                chooseMediaViewModel8.Iv0(this, new TBT() { // from class: X.Huq
                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                    public final Object get(Object obj) {
                                                        return ((ChooseMediaState) obj).getPreviewNextBtnState();
                                                    }
                                                }, new C73165SnZ(), new AqS173S0100000_7(this, 130));
                                            } else {
                                                o.LJIJI("chooseMediaViewModel");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("chooseMediaViewModel");
                                            throw null;
                                        }
                                    }
                                    InterfaceC45633HvZ interfaceC45633HvZ3 = this.LLILIL;
                                    if (interfaceC45633HvZ3 != null && (qU = interfaceC45633HvZ3.qU()) != null) {
                                        qU.LIZLLL(this, new AObjectS86S0100000_7(this, 64));
                                    }
                                    InterfaceC45633HvZ interfaceC45633HvZ4 = this.LLILIL;
                                    if (interfaceC45633HvZ4 != null && (GF = interfaceC45633HvZ4.GF()) != null) {
                                        GF.LIZLLL(this, new AObjectS86S0100000_7(this, 65));
                                    }
                                    InterfaceC45633HvZ interfaceC45633HvZ5 = this.LLILIL;
                                    if (interfaceC45633HvZ5 != null && (q70 = interfaceC45633HvZ5.q70()) != null) {
                                        q70.LIZLLL(this, new AObjectS86S0100000_7(this, 66));
                                    }
                                    InterfaceC45633HvZ interfaceC45633HvZ6 = this.LLILIL;
                                    if (interfaceC45633HvZ6 != null && (mU = interfaceC45633HvZ6.mU()) != null) {
                                        mU.LIZLLL(this, new AObjectS86S0100000_7(this, 67));
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("viewPagerAdapter");
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
                o.LJIJI("tipTxt");
                throw null;
            }
            o.LJIJI("selectLayout");
            throw null;
        }
        o.LJIJI("indexTxt");
        throw null;
    }

    public final void LLJILJILJ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        C45644Hvk c45644Hvk = this.LJLJJL;
        if (c45644Hvk != null) {
            MyMediaModel myMediaModel = (MyMediaModel) ORZ.LJLLLLLL(c45644Hvk.getCurrentItem(), list);
            if (myMediaModel == null) {
                return;
            }
            C45508HtY.LIZ(myMediaModel.fileLocalUriPath, true, new AqS111S0300000_7(this, (C45628HvU) myMediaModel, (MyMediaModel) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 4));
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            H7B.LIZ("PreviewRootScene -> onKeyDown");
            LLJJJIL();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44718Hgo interfaceC44718Hgo;
        CreativeModel creativeModel;
        if (i == 12347) {
            ShortVideoContext shortVideoContext = this.LLIIII;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
                creativeModel.autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
            }
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
            if (LJJLIIIJJI != null && (interfaceC44718Hgo = (InterfaceC44718Hgo) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC44718Hgo.class)) != null) {
                interfaceC44718Hgo.LJJJLL();
            }
            ShortVideoContext shortVideoContext2 = this.LLIIII;
            if (shortVideoContext2 != null) {
                C44703HgZ.LIZ(shortVideoContext2, this.LLIILZL, this.LLIIZ, this.LLILII, Integer.valueOf(this.LLIL));
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this);
        this.LJLJI = LIZIZ;
        if (LIZIZ != null) {
            LIZIZ.registerActivityResultListener(this);
            LIZIZ.registerActivityOnKeyDownListenerHead(this);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ce1, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) LLLLIILL;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
