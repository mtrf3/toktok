package X;

import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS30S0101000_13;
import Y.ARunnableS21S0110000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XX7 extends C8HS<C84934XVa> {
    public static final List<String> LLFFF = Arrays.asList("search_result_list_tag", "local_music_list", "local_music_list_edit", "local_music_list_shoot");
    public Fragment LJLIL;
    public XY4 LJLILLLLZI;
    public final C72H<XYM> LJLJI;
    public Pair<Long, Long> LJLJJI;
    public RecyclerView LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public XVG LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public XVG LJLZ;
    public final EnumC84975XWp LJZ;
    public final int LJZI;
    public boolean LJZL;
    public final java.util.Set<Integer> LL;
    public final java.util.Set<String> LLD;
    public final XX2 LLF;
    public final XYP LLFF;

    public final void LJZ() {
        if (this.LJLJJLL < 0) {
            this.LJLJL = null;
            return;
        }
        MediaPlayer LIZ = XUN.LIZ();
        int i = this.LJLJJLL;
        if (i != -1) {
            RecyclerView.ViewHolder LJJIZ = this.LJLJJL.LJJIZ(i);
            if (LJJIZ instanceof C84987XXb) {
                ((XXG) LJJIZ).V(false, false, false);
            }
            int i2 = this.LJLJJLL;
            this.LJLJJLL = -1;
            this.LJLJL = null;
            if (LJJIZ == null) {
                notifyItemChanged(i2);
            }
        }
        if (LIZ != null && LIZ.isPlaying()) {
            LIZ.pause();
        }
        XY4 xy4 = this.LJLILLLLZI;
        if (xy4 != null) {
            xy4.k2(null);
        }
    }

    public final void LL() {
        MusicModel musicModel;
        int i = -1;
        if (TextUtils.isEmpty(this.LJLJL) || C79004UzY.LJJIFFI(getData())) {
            this.LJLJJLL = -1;
            return;
        }
        for (C84934XVa c84934XVa : getData()) {
            i++;
            if (c84934XVa != null && (musicModel = c84934XVa.LIZIZ) != null && TextUtils.equals(musicModel.getMusicId(), this.LJLJL)) {
                this.LJLJJLL = i;
                return;
            }
        }
        this.LJLJJLL = i;
    }

    @Override // X.MK7
    public final void showLoadMoreEmpty() {
        super.showLoadMoreEmpty();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_shoot_page");
        FMX.LJIIL("music_search_feedback_show", c188727au.LIZ);
    }

    public final XVG LJLLLLLL(MusicModel musicModel) {
        boolean z;
        String str;
        String str2;
        if (musicModel != null) {
            z = musicModel.getIsPropOrChallenge();
        } else {
            z = false;
        }
        XVG xvg = this.LJLJLJ;
        if (this.LJLZ == null && (str2 = this.LJLLLLLL) != null && !str2.isEmpty()) {
            XVG clone = this.LJLJLJ.clone();
            this.LJLZ = clone;
            clone.LJI = this.LJLLLLLL;
            clone.LIZIZ = "attached_song";
        }
        if (this.LJLZ == null && (str = this.LJLLLL) != null && !str.isEmpty()) {
            XVG clone2 = this.LJLJLJ.clone();
            this.LJLZ = clone2;
            clone2.LJFF = this.LJLLLL;
            clone2.LIZIZ = "prop";
        }
        XVG xvg2 = this.LJLZ;
        if (xvg2 != null && z) {
            return xvg2;
        }
        return xvg;
    }

    public final void LJZL(Pair<Integer, Float> pair) {
        if (pair != null) {
            int intValue = ((Integer) pair.first).intValue();
            float floatValue = ((Float) pair.second).floatValue();
            if (this.LJLJJLL < 0) {
                return;
            }
            this.LJLJJL.post(new ARunnableS51S0100000_15(this, intValue, floatValue, 78));
        }
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        MusicModel musicModel;
        int i2 = ((C84934XVa) ListProtector.get(this.mmItems, i)).LIZ;
        if (i2 != -1) {
            if (i2 == 0) {
                List<T> list = this.mmItems;
                if (list != 0 && (musicModel = ((C84934XVa) ListProtector.get(list, i)).LIZIZ) != null) {
                    int i3 = C84976XWq.LIZ[musicModel.getMusicItemType().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                return 0;
                            }
                            return 105;
                        }
                        return 104;
                    }
                    return 103;
                }
                return -100;
            }
            return i2;
        }
        return -100;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
        registerAdapterDataObserver(this.LLFF);
    }

    @Override // X.MK7, X.C4II
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
            this.mmLoadMoreState.LIZIZ = viewGroup.getContext().getText(R.string.dnd);
        }
        return super.onCreateFooterViewHolder(viewGroup);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.LLFF);
        this.LJLJJL = null;
    }

    public XX7(C72H<XYM> c72h, EnumC84975XWp enumC84975XWp) {
        this.LJLJJI = new Pair<>(0, 0);
        this.LJLJJLL = -1;
        this.LJLLILLLL = true;
        this.LJLLL = 0;
        this.LJLZ = null;
        this.LJZ = EnumC84975XWp.UNSET;
        this.LJZI = 0;
        this.LJZL = false;
        this.LL = new HashSet();
        this.LLD = new HashSet();
        this.LLF = new XX2(this);
        this.LLFF = new XYP(this);
        this.LJLJI = c72h;
        this.LJZ = enumC84975XWp;
    }

    public final void LJLZ(final C84987XXb c84987XXb, MusicModel musicModel) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mOldPlayingPosition == itemView.getPosition: ");
        if (this.LJLJJLL == c84987XXb.getPosition()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        ChooseMusicSelectView chooseMusicSelectView = XVI.LIZ;
        if (chooseMusicSelectView != null) {
            chooseMusicSelectView.LIZIZ();
        }
        if (this.LJLJJLL == c84987XXb.getPosition()) {
            if (this.LJLILLLLZI != null) {
                LJZ();
                return;
            }
            return;
        }
        if (this.LJLILLLLZI == null) {
            return;
        }
        LJZ();
        this.LJLJJLL = c84987XXb.getPosition();
        this.LJLJL = musicModel.getMusicId();
        if (musicModel.isLocalMusic()) {
            MediaPlayer LIZ2 = XUN.LIZ();
            try {
                XVF.LJIIJ(this.LJLJLJ, musicModel, ((HashSet) this.LL).contains(Integer.valueOf(c84987XXb.LLI)));
                LIZ2.reset();
                if (musicModel.getLocalPath().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    LIZ2.setDataSource(this.LJLJJL.getContext(), UriProtector.parse(musicModel.getLocalPath()));
                } else {
                    LIZ2.setDataSource(musicModel.getLocalPath());
                }
                LIZ2.setAudioStreamType(3);
                LIZ2.prepareAsync();
                LIZ2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.XXp
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        XX7 xx7 = XX7.this;
                        C84987XXb c84987XXb2 = c84987XXb;
                        xx7.getClass();
                        mediaPlayer.start();
                        c84987XXb2.V(false, true, !xx7.LJZL);
                    }
                });
                LIZ2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.XYO
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        XX7.this.LJZ();
                    }
                });
                LIZ2.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: X.XUO
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (XUN.LIZ != null) {
                            XUN.LIZ.release();
                            XUN.LIZ = null;
                            return false;
                        }
                        return false;
                    }
                });
                return;
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        this.LJLILLLLZI.za0(new XUP() { // from class: X.XXq
            @Override // X.XUP
            public final void LIZ() {
                XX7 xx7 = XX7.this;
                if (xx7.LJLJJLL < 0) {
                    return;
                }
                xx7.LJLJJL.post(new ARunnableS21S0110000_15(xx7, false, 1));
            }
        });
        this.LJLILLLLZI.oj0(musicModel, LJLLLLLL(musicModel));
        XVF.LIZLLL = c84987XXb.getPosition();
    }

    public final void LJZI(MusicModel musicModel, int i) {
        boolean z;
        XVG LJLLLLLL = LJLLLLLL(musicModel);
        if (musicModel != null) {
            NAU nau = new NAU(this.LJLJJL, musicModel, i);
            Fragment fragment = this.LJLIL;
            boolean z2 = this.LJLLILLLL;
            if (musicModel.getMatchedPGCSoundInfo() != null) {
                z = true;
            } else {
                z = false;
            }
            XVF.LJIIL(nau, fragment, LJLLLLLL, musicModel, i, z2, z);
            if (musicModel.getNeedRecordConsumption()) {
                C72834SiE.LIZIZ(musicModel);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x0322. Please report as an issue. */
    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        XVG xvg;
        MusicModel musicModel;
        String singer;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        boolean z3;
        Pair<Long, Long> pair;
        boolean z4;
        int i5;
        TuxTextView tuxTextView;
        int i6;
        boolean z5 = true;
        if ((viewHolder instanceof XY3) && this.LJLJI != null) {
            XY3 xy3 = (XY3) viewHolder;
            ACListenerS30S0101000_13 aCListenerS30S0101000_13 = new ACListenerS30S0101000_13(1, this, 3);
            xy3.getClass();
            C16880lQ.LJIIJ(aCListenerS30S0101000_13, xy3.LJLIL);
            return;
        }
        if (viewHolder instanceof MSE) {
            ((MSE) viewHolder).L();
            return;
        }
        if ((viewHolder instanceof XY2) && this.LJLJI != null) {
            XY2 xy2 = (XY2) viewHolder;
            ACListenerS26S0101000_8 aCListenerS26S0101000_8 = new ACListenerS26S0101000_8(0, this, 4);
            xy2.getClass();
            C16880lQ.LJIIJ(aCListenerS26S0101000_8, xy2.LJLIL);
            C16880lQ.LJIIJ(new ACListenerS30S0101000_13(0, this, 0), xy2.LJLILLLLZI);
            return;
        }
        if ((viewHolder instanceof XY8) && this.LJLJI != null) {
            XY8 xy8 = (XY8) viewHolder;
            xy8.LJLIL.setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS24S0101000_5(3, this, 0), xy8.LJLIL);
            return;
        }
        if ((viewHolder instanceof C84999XXn) && this.LJLJI != null) {
            C84999XXn c84999XXn = (C84999XXn) viewHolder;
            List<C84934XVa> data = getData();
            if (data != null) {
                ArrayList arrayList = new ArrayList();
                for (C84934XVa c84934XVa : data) {
                    if (c84934XVa.LIZ == 0) {
                        arrayList.add(c84934XVa);
                    }
                }
                i6 = arrayList.size();
            } else {
                i6 = 0;
            }
            boolean z6 = this.LJZL;
            c84999XXn.LJLIL.setText(c84999XXn.itemView.getContext().getResources().getQuantityString(R.plurals.bb, i6, Integer.valueOf(i6)));
            if (z6) {
                c84999XXn.LJLJJI.setVisibility(8);
                c84999XXn.LJLJI.setVisibility(0);
            } else {
                c84999XXn.LJLJJI.setVisibility(0);
                c84999XXn.LJLJI.setVisibility(8);
            }
            C16880lQ.LJIIJ(new ACListenerS22S0101000_3(0, this, 0), c84999XXn.LJLILLLLZI);
            return;
        }
        if (i >= getData().size()) {
            return;
        }
        C69590RSw c69590RSw = ((C84934XVa) ListProtector.get(getData(), i)).LIZLLL;
        String str = "";
        if ((viewHolder instanceof C84986XXa) && c69590RSw != null) {
            C84986XXa c84986XXa = (C84986XXa) viewHolder;
            c84986XXa.getClass();
            Challenge challenge = c69590RSw.LIZJ;
            if (challenge != null) {
                String challengeName = challenge.getChallengeName();
                o.LJIIIIZZ(challengeName, "challenge.challengeName");
                TuxTextView tuxTextView2 = c84986XXa.LJLILLLLZI;
                if (tuxTextView2 != null) {
                    String string = c84986XXa.itemView.getContext().getString(R.string.rg5);
                    o.LJIIIIZZ(string, "itemView.context.getStri…ick_page_challenge_title)");
                    tuxTextView2.setText(ujb.o.LJJJJZ(string, "%s", "", false));
                }
                if (C90193gN.LIZIZ(c84986XXa.itemView.getContext()) && (tuxTextView = c84986XXa.LJLJJI) != null) {
                    tuxTextView.setGravity(5);
                }
                String LIZIZ = QZZ.LIZIZ('#', challengeName);
                UrlModel LJIJ = CommerceChallengeServiceImpl.LIZIZ().LJIJ(LIZIZ, true, true);
                if (LJIJ != null) {
                    LIZIZ = C42398GkU.LIZIZ(LIZIZ, ' ');
                }
                SpannableString spannableString = new SpannableString(LIZIZ);
                if (LJIJ != null) {
                    TuxTextView tuxTextView3 = c84986XXa.LJLJJI;
                    if (tuxTextView3 != null) {
                        ICommerceChallengeService LIZIZ2 = CommerceChallengeServiceImpl.LIZIZ();
                        Context context = c84986XXa.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        LIZIZ2.LJIILJJIL(context, challengeName, LJIJ, spannableString, tuxTextView3, "basedon_music_hashtag");
                    }
                } else {
                    TuxTextView tuxTextView4 = c84986XXa.LJLJJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(spannableString);
                    }
                }
            } else {
                if (c69590RSw.LIZIZ == null) {
                    SmartImageView smartImageView = c84986XXa.LJLIL;
                    if (smartImageView != null) {
                        smartImageView.setVisibility(8);
                    }
                } else {
                    SmartImageView smartImageView2 = c84986XXa.LJLIL;
                    if (smartImageView2 != null) {
                        smartImageView2.setVisibility(0);
                    }
                    W5F LIZLLL = C40084FoG.LIZLLL(c69590RSw.LIZIZ, "MusicBlockTitleItemViewHolder");
                    LIZLLL.LJJIIJ = c84986XXa.LJLIL;
                    C16880lQ.LLJJJ(LIZLLL);
                }
                Integer num = c69590RSw.LIZ;
                if (num != null) {
                    int intValue = num.intValue();
                    TuxTextView tuxTextView5 = c84986XXa.LJLILLLLZI;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(intValue);
                    }
                }
            }
        }
        C84934XVa c84934XVa2 = (C84934XVa) ListProtector.get(getData(), i);
        if ((viewHolder instanceof XXY) && c84934XVa2 != null && c84934XVa2.LIZ == 901) {
            XXY xxy = (XXY) viewHolder;
            int i7 = this.LJLLJ;
            xxy.getClass();
            List<MusicCollectionItem> list = c84934XVa2.LIZJ;
            if (list != null && list.size() >= 9) {
                xxy.itemView.setVisibility(0);
                RecyclerView recyclerView = xxy.LJLJJI;
                if (recyclerView != null) {
                    if (list.size() > 9) {
                        i5 = 4;
                    } else {
                        i5 = 3;
                    }
                    recyclerView.setAdapter(new NB6(i7, xxy, list, i5));
                }
            } else {
                xxy.itemView.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = xxy.itemView.getLayoutParams();
                layoutParams.height = 0;
                layoutParams.width = 0;
            }
            xxy.LJLIL = new XXS(this);
            xxy.LJLILLLLZI = new C32789Ctt(this);
        }
        MusicModel musicModel2 = ((C84934XVa) ListProtector.get(getData(), i)).LIZIZ;
        if (musicModel2 != null) {
            if (musicModel2.isRealMusicItem().booleanValue()) {
                XVG LJLLLLLL = LJLLLLLL(musicModel2);
                if (viewHolder instanceof C84987XXb) {
                    if (this.LJZL) {
                        if (musicModel2.getMusicType() != MusicModel.MusicType.VIDEO_EXTRACT && !C45813HyT.LIZ()) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                    } else {
                        i3 = 0;
                    }
                    if (this.LJLL) {
                        z = C52536Kjc.LIZIZ();
                        z2 = C52536Kjc.LIZ();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    EnumC84975XWp enumC84975XWp = this.LJZ;
                    EnumC84975XWp enumC84975XWp2 = EnumC84975XWp.DEVICE_SOUNDS;
                    if (enumC84975XWp == enumC84975XWp2) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    XXG xxg = (XXG) viewHolder;
                    boolean z7 = this.LJLJLLL;
                    boolean z8 = this.LJLLI;
                    if (i == this.LJLJJLL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Fragment fragment = this.LJLIL;
                    if ((fragment != null && fragment.getTag() != null && LLFFF.contains(this.LJLIL.getTag())) || (pair = this.LJLJJI) == null || (((Long) pair.first).longValue() == 0 && ((Long) this.LJLJJI.second).longValue() == 0)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    boolean contains = ((HashSet) this.LL).contains(Integer.valueOf(i));
                    if (((HashSet) this.LLD).contains(musicModel2.getLocalPath())) {
                        z5 = true;
                    } else if (this.LJZ != enumC84975XWp2 || ((HashSet) this.LL).size() < 100 || ((HashSet) this.LL).contains(Integer.valueOf(i))) {
                        z5 = false;
                    }
                    xvg = LJLLLLLL;
                    musicModel = musicModel2;
                    xxg.L(new XXW(musicModel2, null, z7, z8, z3, z4, i4, 0, i, LJLLLLLL, 0, z, z2, i3, contains, z5));
                    XX2 xx2 = this.LLF;
                    C72H<XYM> c72h = this.LJLJI;
                    xxg.LLIIJLIL = xx2;
                    xxg.LLIIZ = c72h;
                } else {
                    xvg = LJLLLLLL;
                    musicModel = musicModel2;
                    if (viewHolder instanceof C84988XXc) {
                        C84988XXc c84988XXc = (C84988XXc) viewHolder;
                        c84988XXc.LJLL = this.LJLJLLL;
                        c84988XXc.LJLJLLL = i;
                        c84988XXc.LJLJLJ = musicModel2;
                        if (!TextUtils.isEmpty(musicModel2.getName())) {
                            c84988XXc.LJLJJI.setText(c84988XXc.LJLJLJ.getName());
                        } else {
                            c84988XXc.LJLJJI.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, c84988XXc.LJLJL));
                            TextView textView = c84988XXc.LJLJJI;
                            if (!TextUtils.isEmpty(c84988XXc.LJLJLJ.getName())) {
                                str = c84988XXc.LJLJLJ.getName();
                            }
                            textView.setText(str);
                        }
                        c84988XXc.LJLILLLLZI.setVisibility(8);
                        C72115SRz.LIZ(c84988XXc.LJLJJI, c84988XXc.LJLJLJ.getMusic());
                        TextView textView2 = c84988XXc.LJLJJL;
                        if (TextUtils.isEmpty(c84988XXc.LJLJLJ.getSinger())) {
                            singer = c84988XXc.LJLJL.getString(R.string.tel);
                        } else {
                            singer = c84988XXc.LJLJLJ.getSinger();
                        }
                        textView2.setText(singer);
                        C72395Sb9.LIZIZ(c84988XXc.LJLIL, c84988XXc.LJLJLJ);
                        c84988XXc.LJLJJLL.setText(C78929UyL.LJIIIZ(c84988XXc.LJLJLJ.getPresenterDuration()));
                        if (c84988XXc.LJLL && c84988XXc.LJLJLLL < 12) {
                            c84988XXc.LJLJI.setVisibility(0);
                            switch (c84988XXc.LJLJLLL) {
                                case 0:
                                    i2 = R.drawable.bks;
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 0.0f);
                                    marginLayoutParams.topMargin = LIZJ;
                                    marginLayoutParams.leftMargin = LIZJ;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 1:
                                    i2 = R.drawable.bkw;
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ2 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 0.0f);
                                    marginLayoutParams2.topMargin = LIZJ2;
                                    marginLayoutParams2.leftMargin = LIZJ2;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 2:
                                    i2 = R.drawable.bkx;
                                    ViewGroup.MarginLayoutParams marginLayoutParams22 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ22 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 0.0f);
                                    marginLayoutParams22.topMargin = LIZJ22;
                                    marginLayoutParams22.leftMargin = LIZJ22;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 3:
                                    i2 = R.drawable.bky;
                                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ3 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams3.topMargin = LIZJ3;
                                    marginLayoutParams3.leftMargin = LIZJ3;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 4:
                                    i2 = R.drawable.bkz;
                                    ViewGroup.MarginLayoutParams marginLayoutParams32 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ32 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams32.topMargin = LIZJ32;
                                    marginLayoutParams32.leftMargin = LIZJ32;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 5:
                                    i2 = R.drawable.bl0;
                                    ViewGroup.MarginLayoutParams marginLayoutParams322 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ322 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams322.topMargin = LIZJ322;
                                    marginLayoutParams322.leftMargin = LIZJ322;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 6:
                                    i2 = R.drawable.bl1;
                                    ViewGroup.MarginLayoutParams marginLayoutParams3222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ3222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams3222.topMargin = LIZJ3222;
                                    marginLayoutParams3222.leftMargin = LIZJ3222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 7:
                                    i2 = R.drawable.bl2;
                                    ViewGroup.MarginLayoutParams marginLayoutParams32222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ32222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams32222.topMargin = LIZJ32222;
                                    marginLayoutParams32222.leftMargin = LIZJ32222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 8:
                                    i2 = R.drawable.bl3;
                                    ViewGroup.MarginLayoutParams marginLayoutParams322222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ322222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams322222.topMargin = LIZJ322222;
                                    marginLayoutParams322222.leftMargin = LIZJ322222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 9:
                                    i2 = R.drawable.bkt;
                                    ViewGroup.MarginLayoutParams marginLayoutParams3222222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ3222222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams3222222.topMargin = LIZJ3222222;
                                    marginLayoutParams3222222.leftMargin = LIZJ3222222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case 10:
                                    i2 = R.drawable.bku;
                                    ViewGroup.MarginLayoutParams marginLayoutParams32222222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ32222222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams32222222.topMargin = LIZJ32222222;
                                    marginLayoutParams32222222.leftMargin = LIZJ32222222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    i2 = R.drawable.bkv;
                                    ViewGroup.MarginLayoutParams marginLayoutParams322222222 = (ViewGroup.MarginLayoutParams) c84988XXc.LJLJI.getLayoutParams();
                                    int LIZJ322222222 = (int) KL2.LIZJ(c84988XXc.LJLJI.getContext(), 2.0f);
                                    marginLayoutParams322222222.topMargin = LIZJ322222222;
                                    marginLayoutParams322222222.leftMargin = LIZJ322222222;
                                    c84988XXc.LJLJI.setImageResource(i2);
                                    break;
                            }
                        } else {
                            c84988XXc.LJLJI.setVisibility(8);
                        }
                    }
                }
                xvg.LJIIIIZZ = musicModel.getLogPb();
                LJZI(musicModel, i);
                return;
            }
            if (viewHolder instanceof C84997XXl) {
                C84997XXl c84997XXl = (C84997XXl) viewHolder;
                C72H<XYM> onInternalEventListener = this.LJLJI;
                c84997XXl.getClass();
                o.LJIIIZ(onInternalEventListener, "onInternalEventListener");
                c84997XXl.LJLIL = onInternalEventListener;
                return;
            }
            if (viewHolder instanceof C84996XXk) {
                C84996XXk c84996XXk = (C84996XXk) viewHolder;
                C72H<XYM> onInternalEventListener2 = this.LJLJI;
                c84996XXk.getClass();
                o.LJIIIZ(onInternalEventListener2, "onInternalEventListener");
                c84996XXk.LJLIL = onInternalEventListener2;
                return;
            }
            if (!(viewHolder instanceof XY9)) {
                return;
            }
            XY9 xy9 = (XY9) viewHolder;
            C223338pd c223338pd = xy9.LJLIL;
            if (c223338pd != null) {
                c223338pd.LIZIZ();
            }
            C223338pd c223338pd2 = xy9.LJLIL;
            if (c223338pd2 == null) {
                return;
            }
            c223338pd2.setVisibility(0);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        boolean z2;
        if (this.LJLL) {
            z = C52536Kjc.LIZIZ();
            z2 = C52536Kjc.LIZ();
        } else {
            z = false;
            z2 = false;
        }
        if (i != 0) {
            switch (i) {
                case 103:
                    C84996XXk c84996XXk = new C84996XXk(C28289B8j.LIZ(viewGroup, R.layout.bd3, viewGroup, false));
                    C72H<XYM> onInternalEventListener = this.LJLJI;
                    o.LJIIIZ(onInternalEventListener, "onInternalEventListener");
                    c84996XXk.LJLIL = onInternalEventListener;
                    return c84996XXk;
                case 104:
                    C84997XXl c84997XXl = new C84997XXl(C28289B8j.LIZ(viewGroup, R.layout.bd9, viewGroup, false));
                    C72H<XYM> onInternalEventListener2 = this.LJLJI;
                    o.LJIIIZ(onInternalEventListener2, "onInternalEventListener");
                    c84997XXl.LJLIL = onInternalEventListener2;
                    return c84997XXl;
                case 105:
                    return new XY9(C28289B8j.LIZ(viewGroup, R.layout.bcy, viewGroup, false));
                default:
                    switch (i) {
                        case 861:
                            return new C85016XYe(C28289B8j.LIZ(viewGroup, R.layout.bcj, viewGroup, false));
                        case 862:
                            return new C84999XXn(C28289B8j.LIZ(viewGroup, R.layout.bce, viewGroup, false));
                        case 863:
                            return new XY3(C28289B8j.LIZ(viewGroup, R.layout.bcg, viewGroup, false));
                        case 864:
                            return new XY8(C28289B8j.LIZ(viewGroup, R.layout.bdd, viewGroup, false));
                        case 865:
                            return new C85015XYd(C28289B8j.LIZ(viewGroup, R.layout.bci, viewGroup, false));
                        case 866:
                            return new XY2(C28289B8j.LIZ(viewGroup, R.layout.bch, viewGroup, false));
                        default:
                            switch (i) {
                                case 900:
                                    C84987XXb c84987XXb = new C84987XXb(C28289B8j.LIZ(viewGroup, R.layout.bcp, viewGroup, false), this.LJLLJ, z, z2);
                                    c84987XXb.LJLLLL.setPadding(0, C17N.LJIILL(8.0d), 0, 0);
                                    XX2 xx2 = this.LLF;
                                    C72H<XYM> c72h = this.LJLJI;
                                    c84987XXb.LLIIJLIL = xx2;
                                    c84987XXb.LLIIZ = c72h;
                                    return c84987XXb;
                                case 901:
                                    return new XXY(C28289B8j.LIZ(viewGroup, R.layout.bd1, viewGroup, false));
                                case 902:
                                    C84986XXa c84986XXa = new C84986XXa(C28289B8j.LIZ(viewGroup, R.layout.bbz, viewGroup, false));
                                    c84986XXa.L();
                                    return c84986XXa;
                                case 903:
                                case 905:
                                    C84987XXb c84987XXb2 = new C84987XXb(C28289B8j.LIZ(viewGroup, R.layout.bcp, viewGroup, false), this.LJLLJ, z, z2);
                                    Context context = c84987XXb2.itemView.getContext();
                                    if (context != null) {
                                        ViewGroup viewGroup2 = c84987XXb2.LJLLLL;
                                        C110614Vt c110614Vt = new C110614Vt();
                                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dd);
                                        viewGroup2.setBackground(c110614Vt.LIZ(context));
                                    }
                                    XX2 xx22 = this.LLF;
                                    C72H<XYM> c72h2 = this.LJLJI;
                                    c84987XXb2.LLIIJLIL = xx22;
                                    c84987XXb2.LLIIZ = c72h2;
                                    return c84987XXb2;
                                case 904:
                                    C84986XXa c84986XXa2 = new C84986XXa(C28289B8j.LIZ(viewGroup, R.layout.bbg, viewGroup, false));
                                    c84986XXa2.L();
                                    return c84986XXa2;
                                default:
                                    return new C84988XXc(C28289B8j.LIZ(viewGroup, R.layout.bd0, viewGroup, false));
                            }
                    }
            }
        }
        C84987XXb c84987XXb3 = new C84987XXb(C28289B8j.LIZ(viewGroup, R.layout.bcp, viewGroup, false), this.LJLLJ, z, z2);
        XX2 xx23 = this.LLF;
        C72H<XYM> c72h3 = this.LJLJI;
        c84987XXb3.LLIIJLIL = xx23;
        c84987XXb3.LLIIZ = c72h3;
        return c84987XXb3;
    }

    public XX7(C72H c72h, int i, EnumC84975XWp enumC84975XWp) {
        this.LJLJJI = new Pair<>(0, 0);
        this.LJLJJLL = -1;
        this.LJLLILLLL = true;
        this.LJLLL = 0;
        this.LJLZ = null;
        this.LJZ = EnumC84975XWp.UNSET;
        this.LJZI = 0;
        this.LJZL = false;
        this.LL = new HashSet();
        this.LLD = new HashSet();
        this.LLF = new XX2(this);
        this.LLFF = new XYP(this);
        this.LJLJI = c72h;
        this.LJZI = i;
        this.LJZ = enumC84975XWp;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        if (list.isEmpty()) {
            onBindBasicViewHolder(viewHolder, i);
            return;
        }
        MusicModel musicModel = ((C84934XVa) ListProtector.get(getData(), i)).LIZIZ;
        if (musicModel == null || !musicModel.isRealMusicItem().booleanValue() || !(viewHolder instanceof C84987XXb) || !(ListProtector.get(list, 0) instanceof MusicModel.CollectionType)) {
            return;
        }
        XXG xxg = (XXG) viewHolder;
        if (ListProtector.get(list, 0) != null) {
            xxg.getClass();
            xxg.LLF = MusicModel.CollectionType.COLLECTED.equals(xxg.LLFII.getCollectionType());
        }
        xxg.getClass();
        XVJ.LIZ(xxg.LJLJL, !xxg.LLF ? 1 : 0);
    }
}
