package X;

import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameRoundChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessRoundSummaryDialog;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.interaction.pictionary.PictionaryRankResponse;
import webcast.api.interaction.pictionary.RankEntry;

/* loaded from: classes6.dex */
public final class BAJ<T> implements InterfaceC64592gB {
    public final /* synthetic */ DrawGuessRoundSummaryDialog LJLIL;

    public BAJ(DrawGuessRoundSummaryDialog drawGuessRoundSummaryDialog) {
        this.LJLIL = drawGuessRoundSummaryDialog;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Boolean bool;
        int i;
        String string;
        int i2;
        Integer num;
        String str;
        Boolean bool2;
        DrawGuessWord drawGuessWord;
        String str2;
        Boolean bool3;
        String valueOf;
        int i3;
        ImageModel imageModel;
        DrawGuessRoundSummaryDialog drawGuessRoundSummaryDialog = this.LJLIL;
        PictionaryRankResponse.ResponseData responseData = (PictionaryRankResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData == null) {
            return;
        }
        drawGuessRoundSummaryDialog.LJLILLLLZI = responseData;
        drawGuessRoundSummaryDialog.LJLIL = C29306Beo.LJIIJ(drawGuessRoundSummaryDialog.dataChannel);
        DataChannel dataChannel = drawGuessRoundSummaryDialog.dataChannel;
        Boolean bool4 = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(DrawGuessInGameRoundChannel.class);
        } else {
            bool = null;
        }
        C29306Beo.LJJIFFI(bool);
        PictionaryRankResponse.ResponseData responseData2 = drawGuessRoundSummaryDialog.LJLILLLLZI;
        if (responseData2 != null) {
            PictionaryStatistics pictionaryStatistics = responseData2.pictionaryStatistics;
            if (pictionaryStatistics != null) {
                i = (int) pictionaryStatistics.guessCorrectUv;
            } else {
                i = 0;
            }
            TextView textView = (TextView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.title);
            if (drawGuessRoundSummaryDialog.LJLIL) {
                string = C15380j0.LJIIIIZZ(R.plurals.km, i, Integer.valueOf(i));
            } else {
                string = drawGuessRoundSummaryDialog.getString(R.string.krm);
            }
            textView.setText(string);
            if (!drawGuessRoundSummaryDialog.LJLIL) {
                ((ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.arv)).setLayoutResource(R.layout.d_y);
                ((ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.arv)).inflate();
                TextView textView2 = (TextView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.mg8);
                PictionaryRankResponse.ResponseData responseData3 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                if (responseData3 != null) {
                    if (!responseData3.isCorrect) {
                        valueOf = "-";
                    } else {
                        long j = responseData3.currUserRank;
                        if (j > 99) {
                            valueOf = "99+";
                        } else {
                            valueOf = String.valueOf(j);
                        }
                    }
                    textView2.setText(valueOf);
                    PictionaryRankResponse.ResponseData responseData4 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                    if (responseData4 != null) {
                        long j2 = responseData4.currUserRank;
                        if (1 <= j2 && j2 < 4) {
                            C87277YNd.LJJIIJZLJL((C47121t6) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.mg8), R.color.a_l);
                        }
                        TextView textView3 = (TextView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.gvs);
                        PictionaryRankResponse.ResponseData responseData5 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                        if (responseData5 != null) {
                            textView3.setText(C05170If.LIZ(responseData5.currUser));
                            View _$_findCachedViewById = drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.time);
                            PictionaryRankResponse.ResponseData responseData6 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                            if (responseData6 != null) {
                                C29306Beo.LJJLIIIJJI(_$_findCachedViewById, responseData6.isCorrect);
                                TextView textView4 = (TextView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.time);
                                Object[] objArr = new Object[1];
                                PictionaryRankResponse.ResponseData responseData7 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                                if (responseData7 != null) {
                                    objArr[0] = String.valueOf(responseData7.currUserDuration);
                                    textView4.setText(C15380j0.LJIILL(R.string.lm7, objArr));
                                    TextView textView5 = (TextView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.dze);
                                    PictionaryRankResponse.ResponseData responseData8 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                                    if (responseData8 != null) {
                                        if (responseData8.isCorrect) {
                                            i3 = R.string.krs;
                                        } else {
                                            i3 = R.string.krt;
                                        }
                                        textView5.setText(i3);
                                        BQO LIZ = C15650jR.LIZ();
                                        PictionaryRankResponse.ResponseData responseData9 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                                        if (responseData9 != null) {
                                            User user = responseData9.currUser;
                                            if (user != null) {
                                                imageModel = user.getAvatarThumb();
                                            } else {
                                                imageModel = null;
                                            }
                                            C78720Uuy LJIIIZ = LIZ.LJIIIZ(imageModel);
                                            LJIIIZ.LJIIL = Boolean.TRUE;
                                            LJIIIZ.LIZLLL(ImageView.ScaleType.CENTER_CROP);
                                            LJIIIZ.LJIIIIZZ = R.drawable.cul;
                                            LJIIIZ.LJIIJJI(drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.e35));
                                            C16880lQ.LJIL((ConstraintLayout) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.jn9), new ACListenerS25S0100000_5(drawGuessRoundSummaryDialog, 282));
                                            C29306Beo.LJJJJJL(C15380j0.LIZ(68.0f), drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.isn));
                                            C29306Beo.LJJJJJL(C15380j0.LIZ(68.0f), drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.cvu));
                                        } else {
                                            o.LJIJI("responseData");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("responseData");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("responseData");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("responseData");
                                throw null;
                            }
                        } else {
                            o.LJIJI("responseData");
                            throw null;
                        }
                    } else {
                        o.LJIJI("responseData");
                        throw null;
                    }
                } else {
                    o.LJIJI("responseData");
                    throw null;
                }
            }
            if (C29306Beo.LJIIJ(drawGuessRoundSummaryDialog.dataChannel)) {
                DataChannel dataChannel2 = drawGuessRoundSummaryDialog.dataChannel;
                if (dataChannel2 != null) {
                    bool3 = (Boolean) dataChannel2.kv0(DrawGuessInGameRoundChannel.class);
                } else {
                    bool3 = null;
                }
                if (C29306Beo.LJIILLIIL(bool3)) {
                    ((ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.arv)).setLayoutResource(R.layout.d_z);
                    ((ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.arv)).inflate();
                    C16880lQ.LJJIIZ((C47121t6) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.njt), new ACListenerS25S0100000_5(drawGuessRoundSummaryDialog, 278));
                    C16880lQ.LJJII((LiveIconView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.cq_), new ACListenerS25S0100000_5(drawGuessRoundSummaryDialog, 279));
                    C16880lQ.LJJII((LiveIconView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.b9d), new ACListenerS25S0100000_5(drawGuessRoundSummaryDialog, 280));
                    DrawGuessWord drawGuessWord2 = BFI.LJ;
                    if (drawGuessWord2 == null) {
                        drawGuessWord2 = BFI.LIZ();
                    }
                    drawGuessRoundSummaryDialog.wl(drawGuessWord2);
                    C16880lQ.LJJIII((C2A7) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.kcq), new ACListenerS25S0100000_5(drawGuessRoundSummaryDialog, 281));
                    C29306Beo.LJJJJJL(C15380j0.LIZ(68.0f), drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.isn));
                    C29306Beo.LJJJJJL(C15380j0.LIZ(68.0f), drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.cvu));
                }
            }
            if (i > 0) {
                C29306Beo.LJJLJLI(drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.isn));
                RecyclerView recyclerView = (RecyclerView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.isn);
                PictionaryRankResponse.ResponseData responseData10 = drawGuessRoundSummaryDialog.LJLILLLLZI;
                if (responseData10 != null) {
                    List<RankEntry> list = responseData10.rankList;
                    if (list != null) {
                        recyclerView.setAdapter(new C28310B9e(list));
                        RecyclerView recyclerView2 = (RecyclerView) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.isn);
                        drawGuessRoundSummaryDialog.getContext();
                        recyclerView2.setLayoutManager(new LinearLayoutManager());
                    }
                } else {
                    o.LJIJI("responseData");
                    throw null;
                }
            } else {
                ViewStub viewStub = (ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.cvu);
                if (drawGuessRoundSummaryDialog.LJLIL) {
                    i2 = R.layout.dac;
                } else {
                    i2 = R.layout.dad;
                }
                viewStub.setLayoutResource(i2);
                ((ViewStub) drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.cvu)).inflate();
                C15490jB.LJ(drawGuessRoundSummaryDialog._$_findCachedViewById(R.id.ajr), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_bg_draw_guess_free.png");
            }
            long j3 = 0;
            String str3 = "";
            if (drawGuessRoundSummaryDialog.LJLIL) {
                DataChannel dataChannel3 = drawGuessRoundSummaryDialog.dataChannel;
                Bundle arguments = drawGuessRoundSummaryDialog.getArguments();
                if (arguments != null) {
                    bool2 = Boolean.valueOf(arguments.getBoolean("argument_is_auto_show"));
                } else {
                    bool2 = null;
                }
                boolean LJJIFFI = C29306Beo.LJJIFFI(bool2);
                if (dataChannel3 != null) {
                    drawGuessWord = (DrawGuessWord) dataChannel3.kv0(DrawGuessCurrentWordChannel.class);
                } else {
                    drawGuessWord = null;
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_correct_answers_panel_show");
                BAI.LIZIZ(LIZ2, dataChannel3);
                BAI.LIZ(LIZ2);
                if (drawGuessWord != null) {
                    j3 = drawGuessWord.id;
                }
                LIZ2.LJIJJ(Long.valueOf(j3), "word_id");
                if (drawGuessWord != null && (str2 = drawGuessWord.word) != null) {
                    str3 = str2;
                }
                LIZ2.LJIJJ(str3, "word");
                if (dataChannel3 != null) {
                    bool4 = (Boolean) dataChannel3.kv0(DrawGuessInGameRoundChannel.class);
                }
                LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIL(bool4))) ? 1 : 0), "is_end");
                LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(LJJIFFI)) ? 1 : 0), "is_auto");
                LIZ2.LJIJJ(Integer.valueOf(i), "correct_ucnt");
                LIZ2.LJJIIJZLJL();
                return;
            }
            DataChannel dataChannel4 = drawGuessRoundSummaryDialog.dataChannel;
            PictionaryRankResponse.ResponseData responseData11 = drawGuessRoundSummaryDialog.LJLILLLLZI;
            if (responseData11 != null) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_audience_pictionary_correct_answers_panel_show");
                BAI.LIZIZ(LIZ3, dataChannel4);
                BAI.LIZ(LIZ3);
                PictionaryInfo pictionaryInfo = responseData11.pictionaryInfo;
                if (pictionaryInfo != null && (str = pictionaryInfo.word) != null) {
                    str3 = str;
                }
                LIZ3.LJIJJ(str3, "word");
                PictionaryInfo pictionaryInfo2 = responseData11.pictionaryInfo;
                if (pictionaryInfo2 != null) {
                    num = Integer.valueOf(pictionaryInfo2.pictionaryType);
                } else {
                    num = null;
                }
                LIZ3.LJIJJ(num, "is_customized");
                if (dataChannel4 != null) {
                    bool4 = (Boolean) dataChannel4.kv0(DrawGuessInGameRoundChannel.class);
                }
                LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIL(bool4))) ? 1 : 0), "is_end");
                LIZ3.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(responseData11.isCorrect)) ? 1 : 0), "is_correct");
                LIZ3.LJIJJ(Long.valueOf(responseData11.currUserRank), "rank");
                PictionaryStatistics pictionaryStatistics2 = responseData11.pictionaryStatistics;
                if (pictionaryStatistics2 != null) {
                    j3 = pictionaryStatistics2.guessCorrectUv;
                }
                C30869C9p.LIZ(j3, LIZ3, "correct_ucnt");
                return;
            }
            o.LJIJI("responseData");
            throw null;
        }
        o.LJIJI("responseData");
        throw null;
    }
}
