package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I3z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46011I3z implements InterfaceC44259HYp {
    public View _bottomLayout;
    public TuxIconView _flashView;
    public View _flipView;
    public TuxIconView _ivDownload;
    public TuxIconView _ivNextStep;
    public View _ivRetake;
    public View _ivStoryPublishButton;
    public View _publishBtn;
    public View _uploadBtn;

    public abstract int getBottomLayoutRes();

    @Override // X.InterfaceC44259HYp
    public View getBottomLayout() {
        View view = this._bottomLayout;
        if (view != null) {
            return view;
        }
        o.LJIJI("_bottomLayout");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public View getBtnStoryPublish() {
        View view = this._ivStoryPublishButton;
        if (view != null) {
            return view;
        }
        o.LJIJI("_ivStoryPublishButton");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public View getIvDownload() {
        TuxIconView tuxIconView = this._ivDownload;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("_ivDownload");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public View getIvNextStep() {
        TuxIconView tuxIconView = this._ivNextStep;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("_ivNextStep");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public View getIvRetake() {
        View view = this._ivRetake;
        if (view != null) {
            return view;
        }
        o.LJIJI("_ivRetake");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public View getPublishBtn() {
        View view = this._publishBtn;
        if (view != null) {
            return view;
        }
        o.LJIJI("_publishBtn");
        throw null;
    }

    public final TuxIconView get_flashView() {
        TuxIconView tuxIconView = this._flashView;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("_flashView");
        throw null;
    }

    public final View get_flipView() {
        View view = this._flipView;
        if (view != null) {
            return view;
        }
        o.LJIJI("_flipView");
        throw null;
    }

    @Override // X.InterfaceC44259HYp
    public TuxIconView getFlashView() {
        return get_flashView();
    }

    @Override // X.InterfaceC44259HYp
    public View getFlipView() {
        return get_flipView();
    }

    @Override // X.InterfaceC44259HYp
    public View getUploadBtn() {
        return this._uploadBtn;
    }

    public final void set_flashView(TuxIconView tuxIconView) {
        o.LJIIIZ(tuxIconView, "<set-?>");
        this._flashView = tuxIconView;
    }

    public final void set_flipView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this._flipView = view;
    }

    public void onViewCreated(View view, boolean z) {
        View findViewById;
        UrlModel avatarThumb;
        o.LJIIIZ(view, "view");
        View findViewById2 = view.findViewById(R.id.ary);
        o.LJII(findViewById2, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) findViewById2;
        viewStub.setLayoutResource(getBottomLayoutRes());
        View inflate = viewStub.inflate();
        o.LJIIIIZZ(inflate, "inflate()");
        this._bottomLayout = inflate;
        View findViewById3 = inflate.findViewById(R.id.ifb);
        o.LJIIIIZZ(findViewById3, "_bottomLayout.findViewById(R.id.publish_button)");
        this._publishBtn = findViewById3;
        if (z) {
            View view2 = this._bottomLayout;
            if (view2 != null) {
                findViewById = view2.findViewById(R.id.ayl);
                o.LJIIIIZZ(findViewById, "{\n            _bottomLay…btn_retake_new)\n        }");
            } else {
                o.LJIJI("_bottomLayout");
                throw null;
            }
        } else {
            View view3 = this._bottomLayout;
            if (view3 != null) {
                findViewById = view3.findViewById(R.id.ayk);
                o.LJIIIIZZ(findViewById, "{\n            _bottomLay….id.btn_retake)\n        }");
            } else {
                o.LJIJI("_bottomLayout");
                throw null;
            }
        }
        this._ivRetake = findViewById;
        if (z) {
            C44423Hc3 LJ = C73098SmU.LJ();
            if (LJ != null && (avatarThumb = LJ.getAvatarThumb()) != null) {
                View view4 = this._bottomLayout;
                if (view4 != null) {
                    C78764Uvg.LJI((W5G) view4.findViewById(R.id.kl2), avatarThumb, -1, -1);
                } else {
                    o.LJIJI("_bottomLayout");
                    throw null;
                }
            }
            View view5 = this._bottomLayout;
            if (view5 != null) {
                ((C1303559r) view5.findViewById(R.id.abp)).setRingWidth(C32151Nz.LJIIZILJ(Double.valueOf(2.0d)));
                if (C60903NvH.LJIIJJI().LJJIII().getNowUIService().enlargeEffectAndUploadEntrance()) {
                    View view6 = this._bottomLayout;
                    if (view6 != null) {
                        View findViewById4 = view6.findViewById(R.id.kl6);
                        o.LJIIIIZZ(findViewById4, "_bottomLayout.findViewBy…Group>(R.id.story_layout)");
                        setViewSize(findViewById4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), C7MY.LIZIZ(40));
                        View view7 = this._bottomLayout;
                        if (view7 != null) {
                            View findViewById5 = view7.findViewById(R.id.kl2);
                            o.LJIIIIZZ(findViewById5, "_bottomLayout.findViewBy…<View>(R.id.story_avatar)");
                            setViewSize(findViewById5, O6R.LJJIIZ(C32151Nz.LJIIZILJ(34)), C7MY.LIZIZ(34));
                            View view8 = this._bottomLayout;
                            if (view8 != null) {
                                View findViewById6 = view8.findViewById(R.id.izl);
                                o.LJIIIIZZ(findViewById6, "_bottomLayout.findViewBy…ew>(R.id.retake_new_icon)");
                                setViewSize(findViewById6, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), C7MY.LIZIZ(40));
                            } else {
                                o.LJIJI("_bottomLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("_bottomLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("_bottomLayout");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("_bottomLayout");
                throw null;
            }
        }
        View view9 = this._bottomLayout;
        if (view9 != null) {
            View findViewById7 = view9.findViewById(R.id.azf);
            o.LJIIIIZZ(findViewById7, "_bottomLayout.findViewById(R.id.btn_story_avatar)");
            this._ivStoryPublishButton = findViewById7;
            View view10 = this._bottomLayout;
            if (view10 != null) {
                View findViewById8 = view10.findViewById(R.id.ayt);
                o.LJIIIIZZ(findViewById8, "_bottomLayout.findViewById(R.id.btn_save_local)");
                this._ivDownload = (TuxIconView) findViewById8;
                View view11 = this._bottomLayout;
                if (view11 != null) {
                    View findViewById9 = view11.findViewById(R.id.axh);
                    o.LJIIIIZZ(findViewById9, "_bottomLayout.findViewById(R.id.btn_next_step)");
                    this._ivNextStep = (TuxIconView) findViewById9;
                    return;
                }
                o.LJIJI("_bottomLayout");
                throw null;
            }
            o.LJIJI("_bottomLayout");
            throw null;
        }
        o.LJIJI("_bottomLayout");
        throw null;
    }

    private final void setViewSize(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = i2;
        view.setLayoutParams(layoutParams);
    }
}
