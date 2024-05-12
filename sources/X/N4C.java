package X;

import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;

/* loaded from: classes11.dex */
public final class N4C extends C56587MIt {
    public static final N4C LIZ = new N4C();
    public static final C56588MIu LIZIZ;
    public static final C56588MIu LIZJ;
    public static final C56588MIu LIZLLL;
    public static final C56588MIu LJ;
    public static final C56588MIu LJFF;
    public static final C56588MIu LJI;
    public static final C56588MIu LJII;
    public static final C56588MIu LJIIIIZZ;
    public static final C56588MIu LJIIIZ;
    public static final C56588MIu LJIIJ;
    public static final C56588MIu LJIIJJI;
    public static final C56588MIu LJIIL;
    public static final C56588MIu LJIILIIL;

    static {
        N4D.LIZ.getClass();
        N20<EnumC58714N2o, Integer> n20 = N4D.LIZIZ;
        C56593MIz c56593MIz = N4D.LIZJ;
        C56593MIz c56593MIz2 = N4D.LIZLLL;
        LIZIZ = C56587MIt.LIZ("ttelite_BA_enter_music_detail", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2});
        C56593MIz c56593MIz3 = N4D.LJ;
        C56593MIz c56593MIz4 = N4D.LJFF;
        C56593MIz c56593MIz5 = N4D.LJI;
        LIZJ = C56587MIt.LIZ("ttelite_BA_enter_music_detail_video_show", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2, c56593MIz3, c56593MIz4, c56593MIz5});
        LIZLLL = C56587MIt.LIZ("ttelite_BA_enter_music_detail_video_click", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2, c56593MIz3, c56593MIz4, c56593MIz5});
        LJ = C56587MIt.LIZ("ttelite_BA_music_detail_video_play", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2, c56593MIz3, c56593MIz4, N4D.LJII, N4D.LJIIIIZZ, c56593MIz5});
        LJFF = C56587MIt.LIZ("ttelite_BA_music_detail_use_sound_click", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2, N4D.LJIIIZ, N4D.LJIIJ, c56593MIz5});
        N21<EnumC58762N4k, String> n21 = N4D.LJIIJJI;
        LJI = C56587MIt.LIZ("ttelite_BA_music_detail_cml_page_show", new InterfaceC58602MzG[]{n21, c56593MIz, c56593MIz2});
        C56593MIz c56593MIz6 = N4D.LJIIL;
        C56593MIz c56593MIz7 = N4D.LJIILIIL;
        LJII = C56587MIt.LIZ("ttelite_BA_music_detail_cml_page_video_show", new InterfaceC58602MzG[]{c56593MIz6, c56593MIz7, c56593MIz3, c56593MIz4, c56593MIz5});
        LJIIIIZZ = C56587MIt.LIZ("ttelite_BA_music_detail_cml_video_play", new InterfaceC58602MzG[]{c56593MIz, c56593MIz2, c56593MIz3, c56593MIz6, c56593MIz7, c56593MIz4, N4D.LJIIZILJ, N4D.LJIJ, c56593MIz5});
        C56593MIz c56593MIz8 = N4D.LJIILJJIL;
        LJIIIZ = new C56588MIu("ttelite_BA_music_detail_cml_album_show", new InterfaceC58602MzG[]{c56593MIz, c56593MIz2, c56593MIz6, c56593MIz7, c56593MIz5, c56593MIz8}, N4E.LIZ);
        LJIIJ = C56587MIt.LIZ("ttelite_BA_music_detail_cml_album_play", new InterfaceC58602MzG[]{c56593MIz, c56593MIz2, c56593MIz6, c56593MIz8, c56593MIz7, N4D.LJIILL, N4D.LJIILLIIL, c56593MIz5});
        LJIIJJI = C56587MIt.LIZ("ttelite_BA_music_detail_cml_blank_click", new InterfaceC58602MzG[]{c56593MIz, c56593MIz2, c56593MIz6, c56593MIz7, c56593MIz5});
        LJIIL = C56587MIt.LIZ("ttelite_BA_music_detail_cml_shoot", new InterfaceC58602MzG[]{n21, c56593MIz6, c56593MIz7, N4D.LJIJI, c56593MIz3, c56593MIz4, c56593MIz5});
        LJIILIIL = C56587MIt.LIZ("ttelite_BA_music_detail_publish", new InterfaceC58602MzG[]{n20, c56593MIz, c56593MIz2, c56593MIz6, c56593MIz7, n21, c56593MIz5});
    }

    public static void LIZIZ(ShootExtraData shootExtraData, java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        N4D.LIZ.getClass();
        shootExtraData.setCommercialUse((Integer) map.get(N4D.LIZIZ.LIZ));
        shootExtraData.setClipId((Long) map.get(N4D.LIZJ.LIZ));
        shootExtraData.setMetaSongId((String) map.get(N4D.LIZLLL.LIZ));
        shootExtraData.setCmlClipId((Long) map.get(N4D.LJIIL.LIZ));
        shootExtraData.setCmlMetaSongId((String) map.get(N4D.LJIILIIL.LIZ));
        shootExtraData.setVersion((String) map.get(N4D.LJIIJJI.LIZ));
        shootExtraData.setSuggestionId((Long) map.get(N4D.LJI.LIZ));
    }
}
