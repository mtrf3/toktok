package com.ss.android.ugc.aweme.cell;

import X.C06490Nh;
import X.C16880lQ;
import X.C17N;
import X.C214298b3;
import X.C27740Aue;
import X.C45804HyK;
import X.C62846OlW;
import X.C63044Ooi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72095SRf;
import X.C72096SRg;
import X.C72097SRh;
import X.C72098SRi;
import X.C72099SRj;
import X.C72100SRk;
import X.C78765Uvh;
import X.C9BD;
import X.C9BE;
import X.C9QW;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.KL2;
import X.YE1;
import Y.ACListenerS32S0100000_12;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicVideoCell extends BaseVideoCell<C9QW> {
    public final String LJLLI = "MusicVideoCell";
    public final String LJLLILLLL = "Preview music video";
    public final C214298b3 LJLLJ;
    public TextView LJLLL;
    public TextView LJLLLL;
    public TextView LJLLLLLL;
    public C62846OlW LJLZ;

    public final MentionMusicVideoVM U() {
        return (MentionMusicVideoVM) this.LJLLJ.getValue();
    }

    public MusicVideoCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MentionMusicVideoVM.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 122);
        C72098SRi c72098SRi = C72098SRi.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72096SRg.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 123), new AqS162S0100000_12((InterfaceC93923mO) this, 124), C72100SRk.INSTANCE, c72098SRi, new AqS162S0100000_12((InterfaceC93923mO) this, 125), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72097SRh.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 126), new AqS162S0100000_12((InterfaceC93923mO) this, 117), C72099SRj.INSTANCE, c72098SRi, new AqS162S0100000_12((InterfaceC93923mO) this, 118), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, C72095SRf.INSTANCE, new AqS162S0100000_12((InterfaceC93923mO) this, 119), new AqS162S0100000_12((InterfaceC93923mO) this, LiveTryModeCountDownThresholdSetting.DEFAULT), new AqS162S0100000_12((InterfaceC93923mO) this, 121), c72098SRi, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLLJ = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJJIJLIJ(N(), new ACListenerS32S0100000_12(this, 32));
        C16880lQ.LJJJJ(L(), new ACListenerS32S0100000_12(this, 33));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C9QW c9qw) {
        C9QW t = c9qw;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        N().setContentDescription("");
        Aweme aweme = t.LJLIL;
        o.LJIIIZ(aweme, "<set-?>");
        this.LJLJL = aweme;
        C62846OlW c62846OlW = this.LJLZ;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(4);
            TextView textView = this.LJLLLLLL;
            if (textView != null) {
                textView.setVisibility(8);
                TextView textView2 = this.LJLLL;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    TextView textView3 = this.LJLLLL;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        View view = this.LJLJJLL;
                        if (view != null) {
                            C45804HyK.LJJLIIIJILLIZJL(view, t.LJLIL);
                            if (t.LJLIL.getMusicStarter() != null) {
                                TextView textView4 = this.LJLLLL;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    if (!TextUtils.isEmpty(t.LJLIL.getLabelMusicStarterText())) {
                                        TextView textView5 = this.LJLLLL;
                                        if (textView5 != null) {
                                            textView5.setText(t.LJLIL.getLabelMusicStarterText());
                                        } else {
                                            o.LJIJI("ivStarter");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("ivStarter");
                                    throw null;
                                }
                            }
                            Q(t);
                            Aweme aweme2 = this.LJLJL;
                            if (aweme2 != null) {
                                Video video = aweme2.getVideo();
                                if (video != null) {
                                    UrlModel cover = video.getCover();
                                    String str = this.LJLLI;
                                    Aweme aweme3 = this.LJLJL;
                                    if (aweme3 != null) {
                                        T(cover, str, aweme3);
                                    } else {
                                        o.LJIJI("mData");
                                        throw null;
                                    }
                                }
                                if (t.LJLIL.isPgcShow()) {
                                    if (t.LJLIL.getTextTopLabels() != null && t.LJLIL.getTextTopLabels().size() > 0) {
                                        TextView textView6 = this.LJLLLLLL;
                                        if (textView6 != null) {
                                            textView6.setVisibility(0);
                                            C62846OlW c62846OlW2 = this.LJLZ;
                                            if (c62846OlW2 != null) {
                                                c62846OlW2.setVisibility(8);
                                                TextView textView7 = this.LJLLLLLL;
                                                if (textView7 != null) {
                                                    Object obj = ListProtector.get(t.LJLIL.getTextTopLabels(), 0);
                                                    o.LJIIIIZZ(obj, "t.data.getTextTopLabels().get(0)");
                                                    V(textView7, (AwemeTextLabelModel) obj);
                                                    return;
                                                }
                                                o.LJIJI("mIvTag");
                                                throw null;
                                            }
                                            o.LJIJI("mIvDemonstration");
                                            throw null;
                                        }
                                        o.LJIJI("mIvTag");
                                        throw null;
                                    }
                                    return;
                                }
                                if (t.LJLIL.getMusicStarter() != null || t.LJLIL.getOriginAuthor() != null || !TextUtils.equals(this.LJLLILLLL, "challenge") || t.LJLIL.getIsTop() != 1) {
                                    return;
                                }
                                if (t.LJLIL.getTextTopLabels() != null && t.LJLIL.getTextTopLabels().size() > 0) {
                                    TextView textView8 = this.LJLLLLLL;
                                    if (textView8 != null) {
                                        textView8.setVisibility(0);
                                        C62846OlW c62846OlW3 = this.LJLZ;
                                        if (c62846OlW3 != null) {
                                            c62846OlW3.setVisibility(8);
                                            TextView textView9 = this.LJLLLLLL;
                                            if (textView9 != null) {
                                                Object obj2 = ListProtector.get(t.LJLIL.getTextTopLabels(), 0);
                                                o.LJIIIIZZ(obj2, "t.data.getTextTopLabels().get(0)");
                                                V(textView9, (AwemeTextLabelModel) obj2);
                                                return;
                                            }
                                            o.LJIJI("mIvTag");
                                            throw null;
                                        }
                                        o.LJIJI("mIvDemonstration");
                                        throw null;
                                    }
                                    o.LJIJI("mIvTag");
                                    throw null;
                                }
                                TextView textView10 = this.LJLLLLLL;
                                if (textView10 != null) {
                                    textView10.setVisibility(8);
                                    C62846OlW c62846OlW4 = this.LJLZ;
                                    if (c62846OlW4 != null) {
                                        c62846OlW4.setVisibility(0);
                                        C62846OlW c62846OlW5 = this.LJLZ;
                                        if (c62846OlW5 != null) {
                                            C78765Uvh.LJI(c62846OlW5, t.LJLIL.getLabelTop(), (int) KL2.LIZJ(M(), 6.0f), (int) KL2.LIZJ(M(), 6.0f), null);
                                            return;
                                        } else {
                                            o.LJIJI("mIvDemonstration");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("mIvDemonstration");
                                    throw null;
                                }
                                o.LJIJI("mIvTag");
                                throw null;
                            }
                            o.LJIJI("mData");
                            throw null;
                        }
                        o.LJIJI("mVideoMask");
                        throw null;
                    }
                    o.LJIJI("ivStarter");
                    throw null;
                }
                o.LJIJI("ivSponser");
                throw null;
            }
            o.LJIJI("mIvTag");
            throw null;
        }
        o.LJIJI("mIvDemonstration");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bsp, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.cover);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.cover)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.f1m);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_demo)");
        this.LJLZ = (C62846OlW) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.b_o);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.checkbox)");
        this.LJLJJL = (C63044Ooi) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.n66);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.video_info_container)");
        this.LJLJJI = (ViewGroup) findViewById4;
        View findViewById5 = LIZIZ.findViewById(R.id.me4);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.tv_play_count)");
        this.LJLJI = (TuxTextView) findViewById5;
        View findViewById6 = LIZIZ.findViewById(R.id.fab);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.iv_sponser)");
        this.LJLLL = (TextView) findViewById6;
        View findViewById7 = LIZIZ.findViewById(R.id.fad);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.iv_starter)");
        this.LJLLLL = (TextView) findViewById7;
        View findViewById8 = LIZIZ.findViewById(R.id.fb0);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.iv_tag)");
        this.LJLLLLLL = (TextView) findViewById8;
        View findViewById9 = LIZIZ.findViewById(R.id.n54);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.video_cover_mask)");
        this.LJLJJLL = findViewById9;
        findViewById9.setVisibility(8);
        return LIZIZ;
    }

    public final void V(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, C17N.LJIILL(12.0d));
        textView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(C27740Aue.LIZJ(C17N.LJIILL(2.0d), ColorProtector.parseColor(awemeTextLabelModel.getBgColor())));
        textView.setSingleLine();
    }
}
