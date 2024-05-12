package X;

import Y.ACListenerS28S0100000_8;
import Y.ACListenerS34S0300000_8;
import Y.ACListenerS43S0200000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS3S0001000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.performance.core.config.UserHorizontalVideoPreloadConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJG extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static String LJLJLLL;
    public final JJK LJLIL;
    public JQA LJLILLLLZI;
    public final RecyclerView LJLJI;
    public List<? extends Aweme> LJLJJI;
    public C48946JIw LJLJJL;
    public final C49002JLa<Aweme> LJLJJLL;
    public JIB LJLJL;
    public final C8YF<InterfaceC212998Xn<?, ?>, C8RL> LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj;
        Aweme aweme = (Aweme) ListProtector.get(this.LJLJJI, i);
        if (aweme.isLive()) {
            return 3;
        }
        if (aweme.isPhotoMode()) {
            return 4;
        }
        C48946JIw c48946JIw = this.LJLJJL;
        if (c48946JIw == null || (obj = c48946JIw.LIZ) == null) {
            obj = C48947JIx.LIZJ;
        }
        if (o.LJ(obj, C48947JIx.LIZJ)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (holder instanceof JIG) {
            JIB jib = this.LJLJL;
            if (jib == null) {
                jib = C1DF.LJIIJ(holder.itemView);
                this.LJLJL = jib;
                if (jib == null) {
                    throw new NullPointerException("Cannot find ContainerStatusProvider");
                }
            }
            ((JIG) holder).LL(jib);
        }
        if (bindingAdapterPosition != -1) {
            Aweme aweme = (Aweme) ListProtector.get(this.LJLJJI, bindingAdapterPosition);
            JJK jjk = this.LJLIL;
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            jjk.LIZIZ(bindingAdapterPosition, view, aweme, this.LJLJJI);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof UserPhotoHolder) {
            ((UserPhotoHolder) holder).LJLJL.LJLIIIL();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String aid;
        C48881JGj dataProvider;
        boolean z;
        int i2;
        int i3;
        C48881JGj dataProvider2;
        C48881JGj dataProvider3;
        C48881JGj dataProvider4;
        VideoTag videoTag;
        int i4;
        Drawable LIZIZ;
        UrlModel avatarLarger;
        int i5;
        C86393XvR LJJIJIL;
        String LIZ;
        Long l;
        UrlModel urlModel;
        String str;
        TopFrameSummary topFrameSummary;
        String totalUserDes;
        long j;
        VideoTag videoTag2;
        int i6;
        Drawable LIZIZ2;
        o.LJIIIZ(holder, "holder");
        Aweme aweme = (Aweme) ListProtector.get(this.LJLJJI, i);
        JVW.LIZIZ(i);
        holder.itemView.post(new ARunnableS3S0001000_8(i, 3));
        Long l2 = null;
        UrlModel urlModel2 = null;
        Long l3 = null;
        l2 = null;
        if (holder instanceof JJH) {
            JJH jjh = (JJH) holder;
            JQA itemMobParam = this.LJLILLLLZI;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(itemMobParam, "itemMobParam");
            jjh.LJLJJLL.getLayoutParams().height = (int) C78847Ux1.LJJIFFI(32);
            jjh.LJLJJLL.setBackground(C04270Et.LIZIZ(jjh.itemView.getContext(), R.drawable.c32));
            TuxTextView tuxTextView = jjh.LJLJJI;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            tuxTextView.setText(C77123UOp.LJJIIJ(j));
            Drawable LIZ2 = C242689fk.LIZ(jjh.itemView.getContext(), aweme, R.drawable.c2k);
            if (jjh.LJLJL) {
                jjh.LJLJJI.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ2, (Drawable) null);
            } else {
                jjh.LJLJJI.setCompoundDrawablesWithIntrinsicBounds(LIZ2, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (aweme.getNewLabel() == 1) {
                jjh.LJLJJL.setVisibility(0);
                Video video = aweme.getVideo();
                if (video != null && (videoTag2 = video.getVideoTag()) != null) {
                    String title = videoTag2.getTitle();
                    if (title == null || title.length() == 0) {
                        jjh.LJLJJL.setVisibility(8);
                    } else {
                        Integer LJJJIL = C78897Uxp.LJJJIL(videoTag2.getBackgroundColor());
                        Integer LJJJIL2 = C78897Uxp.LJJJIL(videoTag2.getFontColor());
                        TuxTextView tuxTextView2 = jjh.LJLJJL;
                        tuxTextView2.setText(videoTag2.getTitle());
                        tuxTextView2.setAlpha(C78842Uww.LJIIL(videoTag2.getOpacity(), 0, 100) / 100.0f);
                        if (LJJJIL2 != null) {
                            i6 = LJJJIL2.intValue();
                        } else {
                            i6 = -1;
                        }
                        tuxTextView2.setTextColor(i6);
                        if (LJJJIL != null) {
                            LIZIZ2 = C51763KTf.LIZIZ(JJH.LJLJLJ, LJJJIL.intValue());
                        } else {
                            LIZIZ2 = C04270Et.LIZIZ(tuxTextView2.getContext(), R.drawable.c25);
                        }
                        tuxTextView2.setBackground(LIZIZ2);
                        JJQ.LIZIZ(aweme);
                    }
                }
            } else {
                jjh.LJLJJL.setVisibility(8);
            }
            Video video2 = aweme.getVideo();
            if (video2 != null) {
                urlModel2 = video2.getCover();
            }
            W5F LIZLLL = C40084FoG.LIZLLL(urlModel2, "AwemeCardListAdapter");
            LIZLLL.LJJIIJ = jjh.LJLJI;
            LIZLLL.LJ();
            C16880lQ.LJIIJ(new ACListenerS43S0200000_8(jjh, aweme, 16), jjh.LJLILLLLZI);
            C78897Uxp.LJJJJJL(jjh.LJLILLLLZI, 0.0f);
        } else {
            String str2 = "";
            if (holder instanceof C48948JIy) {
                C48948JIy c48948JIy = (C48948JIy) holder;
                JQA itemMobParam2 = this.LJLILLLLZI;
                o.LJIIIZ(aweme, "aweme");
                o.LJIIIZ(itemMobParam2, "itemMobParam");
                c48948JIy.LJLLLLLL = aweme;
                JQA jqa = new JQA();
                String enterFrom = itemMobParam2.LJFF;
                o.LJIIIZ(enterFrom, "enterFrom");
                jqa.LJFF = enterFrom;
                String enterMethod = itemMobParam2.LJI;
                o.LJIIIZ(enterMethod, "enterMethod");
                jqa.LJI = enterMethod;
                jqa.LIZIZ(itemMobParam2.LJIIIIZZ);
                jqa.LIZJ(itemMobParam2.LJII);
                jqa.LIZLLL(itemMobParam2.LJ);
                String str3 = itemMobParam2.LJIILJJIL;
                if (str3 != null) {
                    jqa.LJIILJJIL = str3;
                }
                String searchTypeStr = itemMobParam2.LIZJ;
                o.LJIIIZ(searchTypeStr, "searchTypeStr");
                jqa.LIZJ = searchTypeStr;
                User author = aweme.getAuthor();
                if (author != null) {
                    l = Long.valueOf(C78934UyQ.LJIILJJIL(author));
                } else {
                    l = null;
                }
                jqa.LJIILL = String.valueOf(l);
                jqa.LJI = "live_cover";
                java.util.Map<String, String> map = itemMobParam2.LJJIIJ;
                o.LJIIIZ(map, "<set-?>");
                jqa.LJJIIJ = map;
                c48948JIy.LJLJLLL.LJIIIIZZ(aweme, jqa);
                c48948JIy.LJLL.setBackgroundColor(0);
                AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(c48948JIy, 240);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    urlModel = author2.roomCover;
                } else {
                    urlModel = null;
                }
                aqS174S0100000_8.invoke(urlModel);
                LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                if (newLiveRoomData == null || (str = newLiveRoomData.getUserCountDes()) == null) {
                    str = "";
                }
                LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
                if (newLiveRoomData2 != null && (topFrameSummary = newLiveRoomData2.topFrameSummary) != null && topFrameSummary.getId() != 0) {
                    LiveRoomStruct newLiveRoomData3 = aweme.getNewLiveRoomData();
                    if (newLiveRoomData3 != null && (totalUserDes = newLiveRoomData3.getTotalUserDes()) != null) {
                        str2 = totalUserDes;
                    }
                    str = str2;
                }
                Object value = c48948JIy.LJLLILLLL.getValue();
                o.LJIIIIZZ(value, "<get-personText>(...)");
                ((TextView) value).setText(str);
                JON jon = c48948JIy.LJLLJ;
                if (jon != null) {
                    jon.setVisibility(8);
                }
                if (C46314IFq.LIZIZ()) {
                    c48948JIy.LJLLJ = (JON) c48948JIy.itemView.findViewById(R.id.k7p);
                }
                JON jon2 = c48948JIy.LJLLJ;
                if (jon2 != null) {
                    C16880lQ.LJJJLZIJ(jon2, new ACListenerS28S0100000_8(c48948JIy, 87));
                }
                JON jon3 = c48948JIy.LJLLJ;
                if (jon3 != null) {
                    C78897Uxp.LJJJJLI(jon3, null);
                }
                C48936JIm c48936JIm = c48948JIy.LJLJLLL;
                JJI jji = new JJI(c48948JIy, c48948JIy.itemView.getContext());
                jji.LJLJLLL = JJM.LJLIL;
                c48936JIm.setOnTouchListener(jji);
            } else {
                long j2 = 0;
                if (holder instanceof JJJ) {
                    JJJ jjj = (JJJ) holder;
                    JQA itemMobParam3 = this.LJLILLLLZI;
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(itemMobParam3, "itemMobParam");
                    User author3 = aweme.getAuthor();
                    if (author3 == null || (avatarLarger = author3.roomCover) == null) {
                        avatarLarger = aweme.getAuthor().getAvatarLarger();
                    }
                    W5F LIZLLL2 = C40084FoG.LIZLLL(avatarLarger, "AwemeCardListAdapter");
                    LIZLLL2.LJJIIJ = jjj.LJLJI;
                    LIZLLL2.LJ();
                    C16880lQ.LJIIJ(new ACListenerS34S0300000_8(jjj, aweme, itemMobParam3, 10), jjj.LJLILLLLZI);
                    HashMap hashMap = new HashMap();
                    ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                    if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LIZ = LJJIJIL.LIZ()) != null) {
                        str2 = LIZ;
                    }
                    hashMap.put("sdk_version", str2);
                    hashMap.put("_param_live_platform", "live");
                    User author4 = aweme.getAuthor();
                    o.LJIIIIZZ(author4, "aweme.author");
                    hashMap.put("list_item_id", String.valueOf(C78934UyQ.LJIILJJIL(author4)));
                    C49006JLe c49006JLe = new C49006JLe();
                    c49006JLe.LJIIZILJ("enter_from_merge", itemMobParam3.LJFF);
                    c49006JLe.LJIIZILJ("enter_method", "live_cover");
                    User author5 = aweme.getAuthor();
                    if (author5 != null) {
                        l3 = Long.valueOf(C78934UyQ.LJIILJJIL(author5));
                    }
                    c49006JLe.LJIIZILJ("room_id", String.valueOf(l3));
                    c49006JLe.LJIIZILJ("anchor_id", aweme.getAuthor().getUid());
                    c49006JLe.LJIIZILJ("action_type", "click");
                    c49006JLe.LJIIZILJ("search_id", itemMobParam3.LJII);
                    c49006JLe.LJIIZILJ("search_type", itemMobParam3.LIZJ);
                    c49006JLe.LJIIZILJ("search_keyword", itemMobParam3.LJ);
                    c49006JLe.LJIJ("search_result_id", aweme.getAuthor().getUid());
                    c49006JLe.LJIIZILJ("request_id", aweme.getRequestId());
                    User author6 = aweme.getAuthor();
                    if (author6 != null) {
                        i5 = author6.getFollowStatus();
                    } else {
                        i5 = 0;
                    }
                    c49006JLe.LJJIII(i5);
                    c49006JLe.LIZ(hashMap);
                    c49006JLe.LJIILIIL();
                    C78897Uxp.LJJJJL(jjj.LJLILLLLZI, 0.0f);
                } else if (holder instanceof JI9) {
                    JI9 ji9 = (JI9) holder;
                    JQA itemMobParam4 = this.LJLILLLLZI;
                    o.LJIIIZ(aweme, "aweme");
                    o.LJIIIZ(itemMobParam4, "itemMobParam");
                    ji9.LJZ = i;
                    ji9.LJZI = aweme;
                    ((C49045JMr) ji9.LLF.getValue()).LJLJLJ = aweme;
                    if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZIZ.getValue()).userImageAsyncLoad) {
                        C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(aweme, ji9, 53));
                    } else {
                        ji9.P(aweme);
                    }
                    TextView textView = ji9.LJLLI;
                    if (textView != null) {
                        AwemeStatistics statistics2 = aweme.getStatistics();
                        if (statistics2 != null) {
                            j2 = statistics2.getDiggCount();
                        }
                        textView.setText(C77123UOp.LJJIIJ(j2));
                        SY9 LIZIZ3 = C242689fk.LIZIZ(ji9.itemView.getContext(), aweme);
                        if (((Boolean) ji9.LJLJLJ.getValue()).booleanValue()) {
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZIZ3, (Drawable) null);
                        } else {
                            textView.setCompoundDrawablesWithIntrinsicBounds(LIZIZ3, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        if (aweme.getNewLabel() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            TextView textView2 = ji9.LJLLJ;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                                Video video3 = aweme.getVideo();
                                if (video3 != null && (videoTag = video3.getVideoTag()) != null) {
                                    String title2 = videoTag.getTitle();
                                    if (title2 == null || title2.length() == 0) {
                                        TextView textView3 = ji9.LJLLJ;
                                        if (textView3 != null) {
                                            textView3.setVisibility(8);
                                        } else {
                                            o.LJIJI("videoLabelText");
                                            throw null;
                                        }
                                    } else {
                                        Integer LJJJIL3 = C78897Uxp.LJJJIL(videoTag.getBackgroundColor());
                                        Integer LJJJIL4 = C78897Uxp.LJJJIL(videoTag.getFontColor());
                                        C49098JOs.LIZ.getClass();
                                        Integer valueOf = Integer.valueOf(C49098JOs.LIZIZ());
                                        if (valueOf.intValue() <= 0) {
                                            valueOf = 3;
                                        }
                                        float LJIIZILJ = C32151Nz.LJIIZILJ(valueOf);
                                        TextView textView4 = ji9.LJLLJ;
                                        if (textView4 != null) {
                                            textView4.setText(videoTag.getTitle());
                                            if (LJJJIL4 != null) {
                                                i4 = LJJJIL4.intValue();
                                            } else {
                                                i4 = -1;
                                            }
                                            textView4.setTextColor(i4);
                                            if (LJJJIL3 != null) {
                                                LIZIZ = C51763KTf.LIZIZ(LJIIZILJ, LJJJIL3.intValue());
                                            } else {
                                                LIZIZ = C04270Et.LIZIZ(textView4.getContext(), R.drawable.c25);
                                            }
                                            textView4.setBackground(LIZIZ);
                                            textView4.getBackground().setAlpha((int) (Float.valueOf(C78842Uww.LJIIL(videoTag.getOpacity(), 0, 100) / 100.0f).floatValue() * 255));
                                            JJQ.LIZIZ(aweme);
                                        } else {
                                            o.LJIJI("videoLabelText");
                                            throw null;
                                        }
                                    }
                                }
                            } else {
                                o.LJIJI("videoLabelText");
                                throw null;
                            }
                        } else {
                            TextView textView5 = ji9.LJLLJ;
                            if (textView5 != null) {
                                textView5.setVisibility(8);
                            } else {
                                o.LJIJI("videoLabelText");
                                throw null;
                            }
                        }
                        C48887JGp c48887JGp = ji9.LJLLL;
                        if (c48887JGp != null) {
                            c48887JGp.LIZ(aweme);
                        }
                        C48887JGp c48887JGp2 = ji9.LJLLL;
                        if (c48887JGp2 != null && (dataProvider4 = c48887JGp2.getDataProvider()) != null) {
                            dataProvider4.LJIJJLI = itemMobParam4;
                        }
                        TextView textView6 = ji9.LJLLI;
                        if (textView6 != null) {
                            C71898SJq c71898SJq = ji9.LJLLLL;
                            if (c71898SJq != null) {
                                c71898SJq.setVisibility(8);
                            }
                            TextView textView7 = ji9.LJLLI;
                            if (textView7 != null) {
                                if (textView7.getVisibility() == 0) {
                                    TextView textView8 = ji9.LJLLI;
                                    if (textView8 != null) {
                                        CharSequence text = textView8.getText();
                                        if (text != null && text.length() != 0) {
                                            textView6.setPadding(textView6.getPaddingLeft(), 0, textView6.getPaddingRight(), textView6.getPaddingBottom());
                                            textView6.post(new ARunnableS44S0100000_8(ji9, 79));
                                        }
                                    } else {
                                        o.LJIJI("likeCountText");
                                        throw null;
                                    }
                                }
                                JON jon4 = ji9.LL;
                                if (jon4 != null) {
                                    jon4.setVisibility(8);
                                }
                                View view = ji9.LJLZ;
                                if (view != null) {
                                    if (C220858ld.LJIIIZ(aweme)) {
                                        i2 = 0;
                                    } else {
                                        i2 = 8;
                                    }
                                    view.setVisibility(i2);
                                }
                                ConstraintLayout constraintLayout = ji9.LJLLLLLL;
                                if (constraintLayout != null) {
                                    C78897Uxp.LJJJJL(constraintLayout, 4.0f);
                                }
                                JON jon5 = ji9.LL;
                                if (jon5 != null) {
                                    C78897Uxp.LJJJJLI(jon5, null);
                                }
                                ConstraintLayout constraintLayout2 = ji9.LJLLLLLL;
                                if (constraintLayout2 != null) {
                                    Integer num = (Integer) ji9.LJLJLLL.getValue();
                                    if (num != null) {
                                        i3 = num.intValue();
                                    } else {
                                        i3 = 4;
                                    }
                                    constraintLayout2.setOutlineProvider(new C43251GyF((int) C78847Ux1.LJJIFFI(i3)));
                                }
                                if (i == 0 && !C49922JiY.LIZIZ) {
                                    C48887JGp c48887JGp3 = ji9.LJLLL;
                                    if (c48887JGp3 != null && (dataProvider3 = c48887JGp3.getDataProvider()) != null) {
                                        dataProvider3.LJJIJIIJI = Long.valueOf(C49922JiY.LIZ);
                                    }
                                    C49922JiY.LIZIZ = true;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("clickSearchTime:");
                                    C48887JGp c48887JGp4 = ji9.LJLLL;
                                    if (c48887JGp4 != null && (dataProvider2 = c48887JGp4.getDataProvider()) != null) {
                                        l2 = dataProvider2.LJJIJIIJI;
                                    }
                                    LIZ3.append(l2);
                                    LIZ3.append(" clearCreateActivityTime");
                                    X1D.LIZIZ(LIZ3);
                                }
                            } else {
                                o.LJIJI("likeCountText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("likeCountText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("likeCountText");
                        throw null;
                    }
                } else if (holder instanceof UserPhotoHolder) {
                    UserPhotoHolder userPhotoHolder = (UserPhotoHolder) holder;
                    userPhotoHolder.LJLJL.LJJZ(i, new JJL(aweme, this.LJLILLLLZI));
                    userPhotoHolder.LLLLIIIILLL(this.LJLILLLLZI);
                    JQA itemMobParam5 = this.LJLILLLLZI;
                    o.LJIIIZ(itemMobParam5, "itemMobParam");
                    userPhotoHolder.LJLLI = aweme;
                    JHC jhc = userPhotoHolder.LJLJLLL;
                    if (jhc != null) {
                        jhc.LIZ(aweme);
                    }
                    JHC jhc2 = userPhotoHolder.LJLJLLL;
                    if (jhc2 != null && (dataProvider = jhc2.getDataProvider()) != null) {
                        dataProvider.LJIJJLI = itemMobParam5;
                    }
                    JON jon6 = userPhotoHolder.LJLLJ;
                    if (jon6 != null) {
                        jon6.setVisibility(8);
                    }
                    userPhotoHolder.LJLLL.getValue().getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", itemMobParam5.LJFF);
                    linkedHashMap.put("search_id", itemMobParam5.LJII);
                    linkedHashMap.put("search_keyword", itemMobParam5.LJ);
                    linkedHashMap.put("search_result_id", itemMobParam5.LJIILJJIL);
                    linkedHashMap.put("token_type", itemMobParam5.LJIJJLI);
                    Aweme aweme2 = userPhotoHolder.LJLLI;
                    if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                        str2 = aid;
                    }
                    linkedHashMap.put("list_item_id", str2);
                    JHC jhc3 = userPhotoHolder.LJLJLLL;
                    if (jhc3 != null) {
                        jhc3.setExtraParams(linkedHashMap);
                    }
                }
            }
        }
        JVW.LIZJ(i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder viewHolder;
        C46338IGo c46338IGo;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(parent, "parent");
        JVZ jvz = JVW.LIZ;
        if (jvz != null) {
            jvz.LJ = i;
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C48946JIw c48946JIw = this.LJLJJL;
                        C8YF<InterfaceC212998Xn<?, ?>, C8RL> proxyer = this.LJLJLJ;
                        Fragment LJIIIZ = C79234V7u.LJIIIZ(parent);
                        IDqS433S0100000_8 iDqS433S0100000_8 = new IDqS433S0100000_8(this, 9);
                        o.LJIIIZ(proxyer, "proxyer");
                        View LIZIZ = C50365Jph.LIZIZ(R.layout.ciz, parent);
                        UserPhotoHolder userPhotoHolder = new UserPhotoHolder(LIZIZ, proxyer, LJIIIZ);
                        if (c48946JIw == null) {
                            c48946JIw = UserPhotoHolder.LJZ;
                        }
                        userPhotoHolder.LJLJLJ = c48946JIw;
                        userPhotoHolder.LJLLILLLL = iDqS433S0100000_8;
                        userPhotoHolder.LJLJLLL = (JHC) LIZIZ.findViewById(R.id.n04);
                        userPhotoHolder.LJLL = (ConstraintLayout) LIZIZ.findViewById(R.id.n01);
                        C49098JOs.LIZ.getClass();
                        Integer valueOf = Integer.valueOf(C49098JOs.LJ());
                        if (valueOf.intValue() > 0) {
                            int intValue = valueOf.intValue();
                            ConstraintLayout constraintLayout = userPhotoHolder.LJLL;
                            if (constraintLayout != null) {
                                V1B.LJLJLJ((int) C78847Ux1.LJJIFFI(intValue), constraintLayout);
                            }
                        }
                        C48966JJq.LIZIZ(LIZIZ, new AqS174S0100000_8(userPhotoHolder, 173));
                        Context context = LIZIZ.getContext();
                        o.LJIIIIZZ(context, "context");
                        Integer num = (Integer) userPhotoHolder.LJLLLL.getValue();
                        if (num != null) {
                            i4 = num.intValue();
                        } else {
                            i4 = 2;
                        }
                        LIZIZ.setOutlineProvider(new C43251GyF((int) C79043V0l.LIZIZ(context, i4)));
                        LIZIZ.setClipToOutline(true);
                        JJ8.LIZ.getClass();
                        if (JJ8.LIZ()) {
                            View findViewById = LIZIZ.findViewById(R.id.n01);
                            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.u…r_photo_container_layout)");
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById;
                            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                            anonymousClass064.LJII(constraintLayout2);
                            anonymousClass064.LJI(R.id.ho_, 6);
                            anonymousClass064.LJIIIIZZ(R.id.ho_, 7, 0, 7);
                            anonymousClass064.LJIIIIZZ(R.id.ho_, 3, 0, 3);
                            anonymousClass064.LIZIZ(constraintLayout2);
                        }
                        if (C46314IFq.LIZIZ()) {
                            userPhotoHolder.LJLLJ = (JON) LIZIZ.findViewById(R.id.k7p);
                        }
                        JON jon = userPhotoHolder.LJLLJ;
                        if (jon != null) {
                            C16880lQ.LJJJLZIJ(jon, new ACListenerS28S0100000_8(userPhotoHolder, 56));
                        }
                        JHC jhc = userPhotoHolder.LJLJLLL;
                        viewHolder = userPhotoHolder;
                        if (jhc != null) {
                            C79043V0l.LJJIIZI(jhc);
                            jhc.setEnableLifecycleObserver(true);
                            jhc.setEnableHideCoverAnim(true);
                            jhc.setMCoverView(null);
                            jhc.setPhotoSoundIcon(userPhotoHolder.LJLLJ);
                            Integer num2 = (Integer) userPhotoHolder.LJLLLL.getValue();
                            if (num2 != null) {
                                i5 = num2.intValue();
                            } else {
                                i5 = 4;
                            }
                            jhc.setOutlineProvider(new C43251GyF((int) C78847Ux1.LJJIFFI(i5)));
                            jhc.setClipToOutline(true);
                            AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8(jhc, userPhotoHolder, 24);
                            C48909JHl c48909JHl = new C48909JHl();
                            aqS139S0200000_8.invoke(c48909JHl);
                            jhc.setMScrollStateObserver(c48909JHl);
                            C48946JIw c48946JIw2 = userPhotoHolder.LJLJLJ;
                            if (c48946JIw2 != null) {
                                jhc.setMScrollStateManager(c48946JIw2.LIZLLL);
                                ConstraintLayout constraintLayout3 = userPhotoHolder.LJLL;
                                if (constraintLayout3 != null) {
                                    C16880lQ.LJIL(constraintLayout3, new ACListenerS34S0300000_8(jhc, userPhotoHolder, jhc, 3));
                                }
                                JGI core = jhc.getCore();
                                viewHolder = userPhotoHolder;
                                if (core != null) {
                                    core.getDataProvider().LIZ = userPhotoHolder.itemView;
                                    viewHolder = userPhotoHolder;
                                }
                            } else {
                                o.LJIJI("videoConfig");
                                throw null;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException(KMP.LJ("Unknown Aweme view type ", i));
                    }
                } else if (C50452Jr6.LIZ()) {
                    C48946JIw c48946JIw3 = this.LJLJJL;
                    IDqS433S0100000_8 iDqS433S0100000_82 = new IDqS433S0100000_8(this, 7);
                    View LIZIZ2 = C50365Jph.LIZIZ(R.layout.cj2, parent);
                    if (c48946JIw3 == null) {
                        c48946JIw3 = C48948JIy.LJZ;
                    }
                    viewHolder = new C48948JIy(LIZIZ2, c48946JIw3, iDqS433S0100000_82);
                } else {
                    viewHolder = new JJJ(C50365Jph.LIZIZ(R.layout.cgt, parent), new IDqS433S0100000_8(this, 8));
                }
            } else {
                C46337IGn.LJLJLJ.getClass();
                if (((UserHorizontalVideoPreloadConfig) C46337IGn.LJLL.getValue()).enableUserVideoPreload && C46442IKo.LIZ()) {
                    c46338IGo = new C46338IGo(this.LJLJI);
                } else {
                    c46338IGo = null;
                }
                C48946JIw c48946JIw4 = this.LJLJJL;
                IDqS433S0100000_8 iDqS433S0100000_83 = new IDqS433S0100000_8(this, 10);
                View LIZIZ3 = C50365Jph.LIZIZ(R.layout.cj1, parent);
                JI9 ji9 = new JI9(LIZIZ3, c46338IGo);
                if (c48946JIw4 == null) {
                    c48946JIw4 = JI9.LLFZ;
                }
                ji9.LJLL = c48946JIw4;
                ji9.LJZL = iDqS433S0100000_83;
                View findViewById2 = LIZIZ3.findViewById(R.id.n14);
                o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.user_video_like_count)");
                ji9.LJLLI = (TextView) findViewById2;
                View findViewById3 = LIZIZ3.findViewById(R.id.n11);
                o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.user_video_cover)");
                ji9.LJLLILLLL = (C164086cG) findViewById3;
                View findViewById4 = LIZIZ3.findViewById(R.id.n13);
                o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.user_video_label)");
                ji9.LJLLJ = (TextView) findViewById4;
                C48946JIw c48946JIw5 = ji9.LJLL;
                if (c48946JIw5 != null) {
                    if (c48946JIw5.LIZIZ) {
                        ji9.LJLLL = (C48887JGp) LIZIZ3.findViewById(R.id.n17);
                    }
                    ji9.LJLLLL = (C71898SJq) LIZIZ3.findViewById(R.id.n12);
                    ji9.LJLLLLLL = (ConstraintLayout) LIZIZ3.findViewById(R.id.n10);
                    C49098JOs.LIZ.getClass();
                    Integer valueOf2 = Integer.valueOf(C49098JOs.LJ());
                    if (valueOf2.intValue() > 0) {
                        int intValue2 = valueOf2.intValue();
                        ConstraintLayout constraintLayout4 = ji9.LJLLLLLL;
                        if (constraintLayout4 != null) {
                            V1B.LJLJLJ((int) C78847Ux1.LJJIFFI(intValue2), constraintLayout4);
                        }
                    }
                    ji9.LJLZ = LIZIZ3.findViewById(R.id.n6s);
                    C48966JJq.LIZIZ(LIZIZ3, new AqS174S0100000_8(ji9, 162));
                    Context context2 = LIZIZ3.getContext();
                    o.LJIIIIZZ(context2, "context");
                    Integer num3 = (Integer) ji9.LJLJLLL.getValue();
                    if (num3 != null) {
                        i2 = num3.intValue();
                    } else {
                        i2 = 2;
                    }
                    LIZIZ3.setOutlineProvider(new C43251GyF((int) C79043V0l.LIZIZ(context2, i2)));
                    LIZIZ3.setClipToOutline(true);
                    C48946JIw c48946JIw6 = ji9.LJLL;
                    if (c48946JIw6 != null) {
                        if (!c48946JIw6.LIZIZ) {
                            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(ji9, 50), LIZIZ3);
                        }
                        if (C46314IFq.LIZIZ()) {
                            ji9.LL = (JON) LIZIZ3.findViewById(R.id.k7p);
                        }
                        JON jon2 = ji9.LL;
                        if (jon2 != null) {
                            C16880lQ.LJJJLZIJ(jon2, new ACListenerS28S0100000_8(ji9, 51));
                        }
                        C48887JGp c48887JGp = ji9.LJLLL;
                        viewHolder = ji9;
                        if (c48887JGp != null) {
                            C79043V0l.LJJIIZI(c48887JGp);
                            c48887JGp.setEnableLifecycleObserver(true);
                            c48887JGp.setEnableHideCoverAnim(true);
                            C164086cG c164086cG = ji9.LJLLILLLL;
                            if (c164086cG != null) {
                                c48887JGp.setMCoverView(c164086cG);
                                Integer num4 = (Integer) ji9.LJLJLLL.getValue();
                                if (num4 != null) {
                                    i3 = num4.intValue();
                                } else {
                                    i3 = 4;
                                }
                                c48887JGp.setOutlineProvider(new C43251GyF((int) C78847Ux1.LJJIFFI(i3)));
                                c48887JGp.setClipToOutline(true);
                                AqS139S0200000_8 aqS139S0200000_82 = new AqS139S0200000_8(c48887JGp, ji9, 20);
                                C48909JHl c48909JHl2 = new C48909JHl();
                                aqS139S0200000_82.invoke(c48909JHl2);
                                c48887JGp.setMScrollStateObserver(c48909JHl2);
                                C48946JIw c48946JIw7 = ji9.LJLL;
                                if (c48946JIw7 != null) {
                                    c48887JGp.setMScrollStateManager(c48946JIw7.LIZLLL);
                                    ConstraintLayout constraintLayout5 = ji9.LJLLLLLL;
                                    if (constraintLayout5 != null) {
                                        C16880lQ.LJIL(constraintLayout5, new ACListenerS34S0300000_8(ji9, c48887JGp, c48887JGp, 2));
                                    }
                                    JGI core2 = c48887JGp.getCore();
                                    viewHolder = ji9;
                                    if (core2 != null) {
                                        core2.getDataProvider().LIZ = ji9.itemView;
                                        core2.setVideoUiListener((C49045JMr) ji9.LLF.getValue());
                                        boolean z2 = ji9.LLD;
                                        viewHolder = ji9;
                                        if (z2) {
                                            core2.setVideoLifeCycleListener(ji9.LLFFF);
                                            viewHolder = ji9;
                                        }
                                    }
                                } else {
                                    o.LJIJI("videoConfig");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("coverView");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("videoConfig");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoConfig");
                    throw null;
                }
            }
        } else {
            viewHolder = new JJH(C50365Jph.LIZIZ(R.layout.cgl, parent), new IDqS433S0100000_8(this, 11));
        }
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public JJG(Context context, SearchAwemeCardViewHolder listener, JQA jqa, RecyclerView horizontalRecyclerView) {
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(horizontalRecyclerView, "horizontalRecyclerView");
        this.LJLIL = listener;
        this.LJLILLLLZI = jqa;
        this.LJLJI = horizontalRecyclerView;
        this.LJLJJI = new ArrayList();
        this.LJLJJLL = new C49002JLa<>(this);
        this.LJLJLJ = new C8YF<>(this);
    }
}
