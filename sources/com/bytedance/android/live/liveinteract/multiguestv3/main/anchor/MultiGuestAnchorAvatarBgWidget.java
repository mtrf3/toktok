package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor;

import X.C15650jR;
import X.C29044Baa;
import X.C31665Cbl;
import X.C47061t0;
import X.C47121t6;
import X.C73411SrX;
import X.C73969T1h;
import X.C78720Uuy;
import X.C78739UvH;
import X.C81705W4v;
import X.InterfaceC64592gB;
import X.InterfaceC75487Tjv;
import X.TMC;
import X.W4R;
import X.W5I;
import X.W5P;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestAnchorAvatarBgWidget extends LiveWidget implements InterfaceC75487Tjv {
    public C47061t0 LJLIL;
    public C47061t0 LJLILLLLZI;
    public C47121t6 LJLJI;
    public C73411SrX LJLJJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dft;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.W5O, REQUEST] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ImageModel imageModel;
        List<String> urls;
        User owner;
        super.onCreate();
        View findViewById = findViewById(R.id.hb1);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.online_player_avatar)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = findViewById(R.id.hb4);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.online_player_mute_video_bg)");
        this.LJLILLLLZI = (C47061t0) findViewById2;
        View findViewById3 = findViewById(R.id.m35);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tv_count_down)");
        C47121t6 c47121t6 = (C47121t6) findViewById3;
        this.LJLJI = c47121t6;
        c47121t6.setVisibility(0);
        this.LJLJJI = (C73411SrX) TMC.LJIL(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(6L).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS57S0100000_5(this, 270), new InterfaceC64592gB() { // from class: X.9Cw
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null && (owner = room.getOwner()) != null) {
                imageModel = owner.getAvatarThumb();
            } else {
                imageModel = null;
            }
            C47061t0 c47061t02 = this.LJLIL;
            if (c47061t02 != null) {
                int width = c47061t02.getWidth();
                C47061t0 c47061t03 = this.LJLIL;
                if (c47061t03 != null) {
                    C31665Cbl.LJIIJ(c47061t02, imageModel, width, c47061t03.getHeight(), R.drawable.cuk);
                    C47061t0 c47061t04 = this.LJLILLLLZI;
                    if (c47061t04 != null) {
                        c47061t04.setVisibility(0);
                        C78739UvH c78739UvH = new C78739UvH(0.74698794f);
                        if (imageModel != null && (urls = imageModel.getUrls()) != null && urls.size() == 0) {
                            W5P LIZJ = W5P.LIZJ(R.drawable.cuk);
                            LIZJ.LJIIJ = c78739UvH;
                            ?? LIZ = LIZJ.LIZ();
                            C81705W4v LIZJ2 = W5I.LIZJ();
                            LIZJ2.LIZLLL = LIZ;
                            C47061t0 c47061t05 = this.LJLILLLLZI;
                            if (c47061t05 != null) {
                                LIZJ2.LJIIL = c47061t05.getController();
                                W4R LIZ2 = LIZJ2.LIZ();
                                C47061t0 c47061t06 = this.LJLILLLLZI;
                                if (c47061t06 != null) {
                                    c47061t06.setController(LIZ2);
                                    return;
                                } else {
                                    o.LJIJI("mAvatarBg");
                                    throw null;
                                }
                            }
                            o.LJIJI("mAvatarBg");
                            throw null;
                        }
                        C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
                        LJIIIZ.LIZIZ(0.74698794f);
                        C47061t0 c47061t07 = this.LJLILLLLZI;
                        if (c47061t07 != null) {
                            LJIIIZ.LJIIJJI(c47061t07);
                            return;
                        } else {
                            o.LJIJI("mAvatarBg");
                            throw null;
                        }
                    }
                    o.LJIJI("mAvatarBg");
                    throw null;
                }
                o.LJIJI("mAvatarIcon");
                throw null;
            }
            o.LJIJI("mAvatarIcon");
            throw null;
        }
        o.LJIJI("mAvatarIcon");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }
}
