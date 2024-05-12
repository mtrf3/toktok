package X;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import kotlin.jvm.internal.AqS13S0500000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS53S0400000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HRO extends WMH {
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(HRR.LJLIL);
    public ShortVideoContext LJLIL;
    public MvChoosePhotoScene LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 709));

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        Object obj;
        boolean z;
        int i;
        InterfaceC44086HRy LIZ;
        FrameLayout LLIILZL;
        int i2;
        super.onActivityCreated(bundle);
        this.LJLIL = (ShortVideoContext) C78946Uyc.LIZJ(((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            obj = C16880lQ.LLJJIII(bundle2, "local_media_argument");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument");
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
        HRM hrm = HRM.LIZ;
        ShortVideoContext shortVideoContext = this.LJLIL;
        if (shortVideoContext != null) {
            hrm.getClass();
            Bundle LIZIZ = HRM.LIZIZ(localMediaArgument, shortVideoContext);
            G8G.LIZ.step(OpenAlbumPanelPerformanceMonitor.INSTANCE, "startPhotoChoose");
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                LIZIZ.putBoolean("from_album_tab_selected", bundle3.getBoolean("from_album_tab_selected", false));
                LIZIZ.putBoolean("album_tab_is_default_selected", bundle3.getBoolean("album_tab_is_default_selected", false));
                Bundle bundle4 = (Bundle) this.LJLJI.getValue();
                if (bundle4 != null) {
                    z = bundle4.getBoolean("Key_enable_multi_select", false);
                } else {
                    z = false;
                }
                LIZIZ.putBoolean("Key_enable_multi_select", z);
                BaseBundle baseBundle = (BaseBundle) this.LJLJI.getValue();
                if (baseBundle != null) {
                    i = baseBundle.getInt("key_default_landing_tab", -1);
                } else {
                    i = -1;
                }
                LIZIZ.putInt("key_default_landing_tab", i);
                if (bundle3.getBoolean("from_upload_btn_click") && !C1DG.LJIIIIZZ()) {
                    Activity activity = this.mActivity;
                    if (activity == null || (LIZ = HRQ.LIZ(this)) == null || (LLIILZL = LIZ.LLIILZL()) == null) {
                        return;
                    }
                    C62822Ol8 c62822Ol8 = LJLJJI;
                    if (LLIILZL.findViewById(((Number) c62822Ol8.getValue()).intValue()) != null) {
                        return;
                    }
                    AbstractC42651GoZ LJIIL = C78840Uwu.LJIIL(LLIILZL);
                    MvChoosePhotoScene mvChoosePhotoScene = new MvChoosePhotoScene();
                    Bundle bundle5 = this.mArguments;
                    if (bundle5 != null) {
                        LIZIZ.putBoolean("from_upload_btn_click", bundle5.getBoolean("from_upload_btn_click"));
                        LIZIZ.putLong("click_album_icon_time", bundle5.getLong("click_album_icon_time", 0L));
                    }
                    int i3 = localMediaArgument.requestCode;
                    if (i3 > 0) {
                        LIZIZ.putInt("key_start_activity_request_code", i3);
                    }
                    BaseBundle baseBundle2 = (BaseBundle) this.LJLJI.getValue();
                    if (baseBundle2 != null) {
                        i2 = baseBundle2.getInt("key_default_landing_tab", -1);
                    } else {
                        i2 = -1;
                    }
                    LIZIZ.putInt("key_default_landing_tab", i2);
                    Bundle bundle6 = localMediaArgument.extraBundle;
                    if (bundle6 != null) {
                        LIZIZ.putBoolean("is_from_extend_album", bundle6.getBoolean("is_from_extend_album"));
                    }
                    mvChoosePhotoScene.mArguments = LIZIZ;
                    this.LJLILLLLZI = mvChoosePhotoScene;
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.setId(((Number) c62822Ol8.getValue()).intValue());
                    LLIILZL.addView(frameLayout, -1, -1);
                    if (LJIIL != null) {
                        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLILLLLZI;
                        if (mvChoosePhotoScene2 != null) {
                            NavigationScene LIZ2 = C42025GeT.LIZ(mvChoosePhotoScene2);
                            LJIIL.add(frameLayout.getId(), LIZ2, "attachMvChoosePhotoScene");
                            LIZ2.disableSceneRestore();
                            LIZ2.LJLIL = false;
                            JediViewModel LIZ3 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChooseMediaViewModel.class);
                            o.LJIIIIZZ(LIZ3, "of(this).get(ChooseMediaViewModel::class.java)");
                            ((BaseJediViewModel) LIZ3).Iv0(this, new TBT() { // from class: X.HTv
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj2) {
                                    return ((ChooseMediaState) obj2).getClosingChooseMediaPageState();
                                }
                            }, new C73165SnZ(), new AqS13S0500000_7(LJIIL, LIZ2, LLIILZL, frameLayout, this, 3));
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    HEP hep = new HEP(requireActivity(), MvChoosePhotoScene.class);
                    hep.LJI = false;
                    hep.LJIIIIZZ = "attachMvChoosePhotoScene";
                    hep.LJII = new HRP(this);
                    hep.LIZLLL = false;
                    hep.LJ = false;
                    hep.LJFF = frameLayout.getId();
                    HXO LIZ4 = hep.LIZ();
                    JediViewModel LIZ5 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChooseMediaViewModel.class);
                    o.LJIIIIZZ(LIZ5, "of(this).get(ChooseMediaViewModel::class.java)");
                    ((BaseJediViewModel) LIZ5).Iv0(this, new TBT() { // from class: X.HTw
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj2) {
                            return ((ChooseMediaState) obj2).getClosingChooseMediaPageState();
                        }
                    }, new C73165SnZ(), new AqS53S0400000_7(LIZ4, LLIILZL, frameLayout, this, 6));
                    return;
                }
                Intent intent = new Intent(this.mActivity, (Class<?>) MvChoosePhotoActivity.class);
                intent.putExtras(LIZIZ);
                ICreativeSAAService LIZ6 = SAAService.LIZ();
                int i4 = localMediaArgument.requestCode;
                if (i4 > 0) {
                    intent.putExtra("key_start_activity_request_code", i4);
                    Activity requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    LIZ6.invokeMethodsSafely(requireActivity, new AqS96S0300000_7(this, intent, localMediaArgument, 28));
                } else {
                    Activity requireActivity2 = requireActivity();
                    o.LJIIIIZZ(requireActivity2, "requireActivity()");
                    LIZ6.invokeMethodsSafely(requireActivity2, new AqS154S0200000_7(this, intent, 132));
                }
                C78923UyF.LJIILLIIL(this).remove(this);
                return;
            }
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        return new FrameLayout(requireSceneContext());
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
