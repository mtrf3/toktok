package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C47261Igj;
import X.C61878OQg;
import X.C62846OlW;
import X.C74181T9l;
import X.C78765Uvh;
import X.C78857UxB;
import X.C81156VtA;
import X.HBW;
import Y.IDLCallbackS106S0200000_7;
import Y.IDLCallbackS18S0300000_7;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class LibraryFeedPanel extends ShootFeedPanel {
    public final LibraryMaterialInfo LLJLIL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.hrk;
    }

    public LibraryFeedPanel(Bundle bundle) {
        Serializable serializable;
        if (bundle != null) {
            serializable = bundle.getSerializable("feed_data_material_info");
        } else {
            serializable = null;
        }
        this.LLJLIL = (LibraryMaterialInfo) serializable;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View v) {
        MusicModel musicModel;
        List<String> list;
        Music music;
        o.LJIIIZ(v, "v");
        if (this.activity != null && MSAdaptionService.LJIIL().LJI(this.activity)) {
            Activity activity = this.activity;
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
            return;
        }
        LibraryMaterialInfo libraryMaterialInfo = this.LLJLIL;
        if (libraryMaterialInfo != null) {
            Music music2 = LJJLJ().getMusic();
            Long l = null;
            r10 = null;
            r10 = null;
            Music music3 = null;
            if (music2 != null) {
                musicModel = music2.convertToMusicModel();
            } else {
                musicModel = null;
            }
            if (LJJLJ().getStickerIDs() != null) {
                String stickerIDs = LJJLJ().getStickerIDs();
                o.LJIIIIZZ(stickerIDs, "aweme.stickerIDs");
                if (stickerIDs.length() != 0) {
                    boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                    IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
                    Activity activity2 = this.activity;
                    o.LJIIIIZZ(activity2, "activity");
                    String stickerIDs2 = LJJLJ().getStickerIDs();
                    if (stickerIDs2 != null) {
                        list = s.LJLJJI(stickerIDs2, new char[]{','}, false, 6);
                    } else {
                        list = C61878OQg.INSTANCE;
                    }
                    Aweme LJJLJ = LJJLJ();
                    if (LJJLJ != null && (music = LJJLJ.getMusic()) != null && music.isPgc()) {
                        music3 = LJJLJ().getMusic();
                    }
                    int videoLength = LJJLJ().getVideo().getVideoLength();
                    LibraryMaterialInfoSv.Companion.getClass();
                    LJIIJ.LJFF(activity2, list, new C74181T9l(null, "library", music3, HBW.LIZIZ(libraryMaterialInfo), true, "library_auto", null, "library_detail_page", null, null, "library_detail_page", null, null, false, null, Integer.valueOf(videoLength), null, null, null, false, null, null, null, 16709441), downloadEffectOrMusicAfterEnterCamera);
                    return;
                }
            }
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay("library");
            builder.creationId(UUID.randomUUID().toString());
            builder.enterFrom("library_detail_page");
            LibraryMaterialInfoSv.Companion.getClass();
            builder.libraryMaterialInfo(HBW.LIZIZ(libraryMaterialInfo));
            builder.isThroughAnchor(true);
            if (musicModel != null && musicModel.isPgc()) {
                builder.musicModel(musicModel);
                Music music4 = LJJLJ().getMusic();
                if (music4 != null) {
                    l = Long.valueOf(music4.getId());
                }
                builder.autoUseMusic(String.valueOf(l));
                IExternalService LIZ = AVExternalServiceImpl.LIZ();
                Activity activity3 = this.activity;
                o.LJIIIIZZ(activity3, "activity");
                LIZ.asyncService(activity3, "library_detail_page", new IDLCallbackS18S0300000_7(builder, this, musicModel, 1));
                return;
            }
            IExternalService LIZ2 = AVExternalServiceImpl.LIZ();
            Activity activity4 = this.activity;
            o.LJIIIIZZ(activity4, "activity");
            LIZ2.asyncService(activity4, "library_detail_page", new IDLCallbackS106S0200000_7(this, builder, 2));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout parentView) {
        String preview;
        o.LJIIIZ(parentView, "parentView");
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alu, parentView, false);
        LibraryMaterialInfo libraryMaterialInfo = this.LLJLIL;
        if (libraryMaterialInfo != null) {
            View findViewById = view.findViewById(R.id.khy);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.sticker_icon)");
            C62846OlW c62846OlW = (C62846OlW) findViewById;
            UrlModel cover = libraryMaterialInfo.getCover();
            if (cover == null || (preview = cover.getUri()) == null) {
                preview = libraryMaterialInfo.getPreview();
            }
            if (preview != null) {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C47261Igj.LJII(preview));
                urlModel.setUri(Uri.decode(preview));
                C78765Uvh.LJFF(c62846OlW, urlModel);
            }
            View findViewById2 = view.findViewById(R.id.d81);
            o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.feed_marquee_desc)");
            C81156VtA c81156VtA = (C81156VtA) findViewById2;
            String materialName = libraryMaterialInfo.getMaterialName();
            if (materialName != null && C78857UxB.LJJJIL(materialName)) {
                LLIL(c81156VtA, libraryMaterialInfo.getMaterialName());
            } else {
                LLIL(c81156VtA, getContext().getString(R.string.hrp));
            }
        }
        o.LJIIIIZZ(view, "view");
        return view;
    }
}
