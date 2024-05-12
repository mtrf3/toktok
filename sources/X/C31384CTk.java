package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CTk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31384CTk extends AbstractC31386CTm {
    public int LJJJIL;
    public int LJJJJ;
    public long LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public long LJJJJZ;
    public int LJJJJZI;
    public long LJJJLIIL;
    public int LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public int LJJLJ;
    public int LJJLJLI;
    public int LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public int LJL;
    public int LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public long LLFF;
    public long LLFFF;
    public long LLFII;
    public long LLFZ;
    public long LLI;
    public long LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public long LLIIIILZ;
    public long LLIIIJ;

    @Override // X.AbstractC31385CTl
    public final void LJJIL() {
        String str;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_public_screen_message_metrics")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("room_id", LJJIJIIJIL().LJIIJJI);
                jSONObject.put("anchor_id", LJJIJIIJIL().LJIILLIIL);
                jSONObject.put("msg_comment_cnt", this.LIZJ);
                jSONObject.put("msg_quick_comment_cnt", this.LJ);
                jSONObject.put("msg_emote_comment_cnt", this.LIZLLL);
                jSONObject.put("msg_comment_chathead_loaded", this.LJIIZILJ);
                jSONObject.put("admin_type", LJJIJIL());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jSONObject.put("hot_duration", timeUnit.toSeconds(this.LJJIJLIJ));
                jSONObject.put("folded_show_msg_cnt", this.LJIJI);
                jSONObject.put("unfolded_show_msg_cnt", this.LJIJJ);
                jSONObject.put("show_msg_cnt", this.LJIJI + this.LJIJJ);
                jSONObject.put("msg_like_cnt", this.LJFF);
                jSONObject.put("msg_gift_cnt", this.LJI);
                jSONObject.put("msg_share_cnt", this.LJII);
                jSONObject.put("msg_follow_cnt", this.LJIIIIZZ);
                jSONObject.put("drop_like_cnt", this.LJIIJ);
                jSONObject.put("drop_gift_cnt", this.LJIIJJI);
                jSONObject.put("drop_share_cnt", this.LJIIL);
                jSONObject.put("drop_follow_cnt", this.LJIILIIL);
                jSONObject.put("drop_comment_cnt", this.LJIILJJIL);
                jSONObject.put("drop_quick_comment_cnt", this.LJIILLIIL);
                jSONObject.put("drop_emote_comment_cnt", this.LJIILL);
                jSONObject.put("msg_received_total_cnt", this.LJJJIL);
                jSONObject.put("msg_create_total_cnt", this.LJJLJLI);
                jSONObject.put("msg_filtered_total_cnt", this.LJJJJ);
                jSONObject.put("model_convert_total_cnt", this.LJJIJIIJIL);
                jSONObject.put("msg_bind_total_duration", this.LJJJJI);
                jSONObject.put("msg_bind_total_cnt", this.LJJJJIZL);
                jSONObject.put("msg_member_enter_cnt", this.LJIJJLI);
                jSONObject.put("drop_member_enter_cnt", this.LJIL);
                jSONObject.put("drop_total_cnt", this.LJJJJJ);
                jSONObject.put("drop_anchor_msg_cnt", this.LJJJJJL);
                jSONObject.put("drop_anchor_comment_cnt", this.LJJJJL);
                jSONObject.put("drop_following_user_msg_cnt", this.LJJJJLI);
                jSONObject.put("drop_following_user_comment_cnt", this.LJJJJLL);
                jSONObject.put("msg_buffer_total_duration", this.LJJJJZ);
                jSONObject.put("msg_others_buffer_cnt", 0);
                jSONObject.put("msg_fold_buffer_cnt", 0);
                jSONObject.put("msg_buffer_total_cnt", this.LJJJJZI);
                jSONObject.put("receive_comment_cnt", this.LJJJZ);
                jSONObject.put("receive_quick_comment_cnt", this.LJJLI);
                jSONObject.put("receive_emote_comment_cnt", this.LJJL);
                jSONObject.put("receive_like_cnt", this.LJJLIIIIJ);
                jSONObject.put("receive_gift_cnt", this.LJJLIIIJ);
                jSONObject.put("receive_share_cnt", this.LJJLIIIJILLIZJL);
                jSONObject.put("receive_follow_cnt", this.LJJLIIIJJI);
                jSONObject.put("receive_member_enter_cnt", this.LJJLIIIJJIZ);
                jSONObject.put("create_comment_cnt", this.LJJLIIIJL);
                jSONObject.put("create_like_cnt", this.LJJLIIIJLJLI);
                jSONObject.put("create_gift_cnt", this.LJJLIIIJLLLLLLLZ);
                jSONObject.put("create_share_cnt", this.LJJLIIJ);
                jSONObject.put("create_follow_cnt", this.LJJLIL);
                jSONObject.put("create_member_enter_cnt", this.LJJLJ);
                jSONObject.put("unconsume_comment_cnt", this.LJJLL);
                jSONObject.put("unconsume_like_cnt", this.LJJZ);
                jSONObject.put("unconsume_gift_cnt", this.LJJZZI);
                jSONObject.put("unconsume_share_cnt", this.LJJZZIII);
                jSONObject.put("unconsume_follow_cnt", this.LJL);
                jSONObject.put("unconsume_member_enter_cnt", this.LJLI);
                jSONObject.put("unshow_like_cnt", this.LJLIIIL);
                jSONObject.put("unshow_gift_cnt", this.LJLIIL);
                jSONObject.put("unshow_share_cnt", this.LJLIL);
                jSONObject.put("unshow_follow_cnt", this.LJLILLLLZI);
                jSONObject.put("unshow_member_enter_cnt", this.LJLJI);
                jSONObject.put("msg_comment_effective_cnt", this.LJJ);
                jSONObject.put("msg_member_enter_effective_cnt", this.LJJIJIIJI);
                jSONObject.put("msg_follow_effective_cnt", this.LJJIIJZLJL);
                jSONObject.put("msg_share_effective_cnt", this.LJJIIJ);
                jSONObject.put("msg_gift_effective_cnt", this.LJJIII);
                jSONObject.put("msg_like_effective_cnt", this.LJJII);
                jSONObject.put("show_msg_effective_cnt", this.LJJIIZ + this.LJJIIZI);
                jSONObject.put("folded_show_msg_effective_cnt", this.LJJIIZ);
                jSONObject.put("unfolded_show_msg_effective_cnt", this.LJJIIZI);
                jSONObject.put("msg_quick_comment_effective_cnt", this.LJJIFFI);
                jSONObject.put("msg_emote_comment_effective_cnt", this.LJJI);
                jSONObject.put("msg_comment_effective_u_cnt", this.LJLLL);
                jSONObject.put("msg_member_enter_effective_u_cnt", this.LLF);
                jSONObject.put("msg_follow_effective_u_cnt", this.LJZL);
                jSONObject.put("msg_share_effective_u_cnt", this.LJZI);
                jSONObject.put("msg_gift_effective_u_cnt", this.LJZ);
                jSONObject.put("msg_like_effective_u_cnt", this.LJLZ);
                jSONObject.put("show_msg_effective_u_cnt", this.LL + this.LLD);
                jSONObject.put("folded_show_msg_effective_u_cnt", this.LL);
                jSONObject.put("unfolded_show_msg_effective_u_cnt", this.LLD);
                jSONObject.put("msg_quick_comment_effective_u_cnt", this.LJLLLLLL);
                jSONObject.put("msg_emote_comment_effective_u_cnt", this.LJLLLL);
                jSONObject.put("msg_comment_u_cnt", this.LJLJJI);
                jSONObject.put("msg_member_enter_u_cnt", this.LJLLJ);
                jSONObject.put("msg_follow_u_cnt", this.LJLL);
                jSONObject.put("msg_share_u_cnt", this.LJLJLLL);
                jSONObject.put("msg_gift_u_cnt", this.LJLJLJ);
                jSONObject.put("msg_like_u_cnt", this.LJLJL);
                jSONObject.put("show_msg_u_cnt", this.LJLLI + this.LJLLILLLL);
                jSONObject.put("folded_show_msg_u_cnt", this.LJLLI);
                jSONObject.put("unfolded_show_msg_u_cnt", this.LJLLILLLL);
                jSONObject.put("msg_quick_comment_u_cnt", this.LJLJJLL);
                jSONObject.put("msg_emote_comment_u_cnt", this.LJLJJL);
                jSONObject.put("msg_comment_duration", this.LLFF);
                jSONObject.put("msg_member_enter_duration", this.LLIIIJ);
                jSONObject.put("msg_follow_duration", this.LLII);
                jSONObject.put("msg_share_duration", this.LLIFFJFJJ);
                jSONObject.put("msg_gift_duration", this.LLI);
                jSONObject.put("msg_like_duration", this.LLFZ);
                jSONObject.put("show_msg_duration", this.LLIIII + this.LLIIIILZ);
                jSONObject.put("folded_show_msg_duration", this.LLIIII);
                jSONObject.put("unfolded_show_msg_duration", this.LLIIIILZ);
                jSONObject.put("msg_quick_comment_duration", this.LLFII);
                jSONObject.put("msg_emote_comment_duration", this.LLFFF);
                if (LJJIJIIJIL().LJIIZILJ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_extended_comment_filed", str);
                long seconds = timeUnit.toSeconds(SystemClock.uptimeMillis() - this.LJJJLIIL);
                jSONObject.put("msg_others_buffer_avg_cnt", this.LJJJLL / seconds);
                jSONObject.put("msg_fold_buffer_avg_cnt", this.LJJJLZIJ / seconds);
                jSONObject.put("fold_msg_max_buffer_size", LJJIJIIJIL().LJIJI);
                jSONObject.put("fold_msg_consume_interval", LJJIJIIJIL().LJIJJ);
                jSONObject.put("msg_comment_avatar_preload_cnt", this.LJIJ);
            } catch (Exception unused) {
            }
            C0K2.LIZLLL("ttlive_public_screen_message_metrics", new JSONObject(), null, jSONObject);
        }
        this.LJJJIL = 0;
        this.LJJJJ = 0;
        this.LJJJJI = 0L;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        this.LJJJJL = 0;
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJJJZ = 0L;
        this.LJJJJIZL = 0;
        this.LJJJLIIL = 0L;
        this.LJJJLL = 0;
        this.LJJJLZIJ = 0;
        this.LJJJJZI = 0;
        this.LJJJZ = 0;
        this.LJJL = 0;
        this.LJJLI = 0;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0;
        this.LJJLIIIJILLIZJL = 0;
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJJIZ = 0;
        this.LJJLIIIJL = 0;
        this.LJJLIIIJLJLI = 0;
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJLIIJ = 0;
        this.LJJLIL = 0;
        this.LJJLJ = 0;
        this.LJJLJLI = 0;
        this.LJJLL = 0;
        this.LJJZ = 0;
        this.LJJZZI = 0;
        this.LJJZZIII = 0;
        this.LJL = 0;
        this.LJLI = 0;
        this.LJLIIIL = 0;
        this.LJLIIL = 0;
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = 0;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LJLLLL = 0;
        this.LJLLLLLL = 0;
        this.LJLZ = 0;
        this.LJZ = 0;
        this.LJZI = 0;
        this.LJZL = 0;
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = 0L;
        this.LLFFF = 0L;
        this.LLFII = 0L;
        this.LLFZ = 0L;
        this.LLI = 0L;
        this.LLIFFJFJJ = 0L;
        this.LLII = 0L;
        this.LLIIII = 0L;
        this.LLIIIILZ = 0L;
        this.LLIIIJ = 0L;
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void n6() {
        super.n6();
        if (this.LJJJLIIL == 0) {
            this.LJJJLIIL = SystemClock.uptimeMillis();
        }
        this.LJJJLL = LJJIJIIJIL().LJIIJ.LJJIZ() + this.LJJJLL;
        this.LJJJLZIJ = LJJIJIIJIL().LJIIJ.LJIIJJI() + this.LJJJLZIJ;
    }

    @Override // X.CRC, X.CR8
    public final void LIZJ(CRD model) {
        o.LJIIIZ(model, "model");
        if (!(model instanceof CQO)) {
            return;
        }
        MESSAGE message = ((CQO) model).LJIJJLI;
        if (message instanceof LikeMessage) {
            this.LJLIIIL++;
            return;
        }
        if (message instanceof GiftMessage) {
            this.LJLIIL++;
            return;
        }
        if (message instanceof SocialMessage) {
            if (((int) ((SocialMessage) message).action) == 3) {
                this.LJLIL++;
                return;
            } else if (((int) ((SocialMessage) message).action) == 1) {
                this.LJLILLLLZI++;
                return;
            }
        }
        if (!(message instanceof MemberMessage) || ((MemberMessage) message).action != 1) {
            return;
        }
        this.LJLJI++;
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIIIIZZ(CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIIIIZZ(model);
        if (model.LJJIFFI().LJII == 1) {
            if (model instanceof CQ6) {
                this.LJLJL++;
            } else if (model instanceof C31290CPu) {
                this.LJLJLJ++;
            } else {
                if (model instanceof CQ7) {
                    if (((CQ7) model).LLFFF()) {
                        this.LJLJLLL++;
                    } else if (((CQ7) model).LLFF()) {
                        this.LJLL++;
                    }
                }
                if ((model instanceof C31276CPg) && ((MemberMessage) ((CQO) model).LJIJJLI).action == 1) {
                    this.LJLLJ++;
                }
            }
            if (model instanceof CQK) {
                this.LJLJJI++;
                if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                    this.LJLJJLL++;
                }
                if (model instanceof CQN) {
                    this.LJLJJL++;
                }
            }
            if (model.LJJJLL().LIZ) {
                this.LJLLI++;
            } else {
                this.LJLLILLLL++;
            }
        }
        long j = model.LJJIFFI().LJFF;
        if (model instanceof CQ6) {
            this.LLFZ += j;
        } else if (model instanceof C31290CPu) {
            this.LLI += j;
        } else {
            if (model instanceof CQ7) {
                if (((CQ7) model).LLFFF()) {
                    this.LLIFFJFJJ += j;
                } else if (((CQ7) model).LLFF()) {
                    this.LLII += j;
                }
            }
            if ((model instanceof C31276CPg) && ((MemberMessage) ((CQO) model).LJIJJLI).action == 1) {
                this.LLIIIJ += j;
            }
        }
        if (model instanceof CQK) {
            this.LLFF += j;
            if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                this.LLFII += j;
            }
            if (model instanceof CQN) {
                this.LLFFF += j;
            }
        }
        if (model.LJJJLL().LIZ) {
            this.LLIIII += j;
        } else {
            this.LLIIIILZ += j;
        }
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIILIIL(CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIILIIL(model);
        if (model.LJJIFFI().LJIIIIZZ == 1) {
            if (model instanceof CQ6) {
                this.LJLZ++;
            } else if (model instanceof C31290CPu) {
                this.LJZ++;
            } else {
                if (model instanceof CQ7) {
                    if (((CQ7) model).LLFFF()) {
                        this.LJZI++;
                    } else if (((CQ7) model).LLFF()) {
                        this.LJZL++;
                    }
                }
                if ((model instanceof C31276CPg) && ((MemberMessage) ((CQO) model).LJIJJLI).action == 1) {
                    this.LLF++;
                }
            }
            if (model instanceof CQK) {
                this.LJLLL++;
                if ((model instanceof CQJ) && ((ChatMessage) ((CQO) model).LJIJJLI).LIZ()) {
                    this.LJLLLLLL++;
                }
                if (model instanceof CQN) {
                    this.LJLLLL++;
                }
            }
            if (model.LJJJLL().LIZ) {
                this.LL++;
            } else {
                this.LLD++;
            }
        }
    }

    @Override // X.CRC, X.CR8
    public final void LJIILJJIL(CR6 message) {
        o.LJIIIZ(message, "message");
        if (message instanceof ChatMessage) {
            this.LJJJZ++;
            if (((ChatMessage) message).LIZ()) {
                this.LJJLI++;
            }
        } else if (message instanceof EmoteChatMessage) {
            this.LJJL++;
        } else if (message instanceof LikeMessage) {
            this.LJJLIIIIJ++;
        } else if (message instanceof GiftMessage) {
            this.LJJLIIIJ++;
        } else {
            if (message instanceof SocialMessage) {
                if (((int) ((SocialMessage) message).action) == 3) {
                    this.LJJLIIIJILLIZJL++;
                } else if (((int) ((SocialMessage) message).action) == 1) {
                    this.LJJLIIIJJI++;
                }
            }
            if ((message instanceof MemberMessage) && ((MemberMessage) message).action == 1) {
                this.LJJLIIIJJIZ++;
            }
        }
        this.LJJJIL++;
    }

    @Override // X.CRC, X.CR8
    public final void LJIJI(CRD model) {
        o.LJIIIZ(model, "model");
        this.LJJJJZI++;
    }

    @Override // X.CRC, X.CR8
    public final void LJJIII(CRD crd) {
        if (crd.LIZLLL().LIZ) {
            this.LJJJJZ = (crd.LIZLLL().LIZJ - crd.LIZLLL().LIZIZ) + this.LJJJJZ;
        }
    }

    @Override // X.CRC, X.CR8
    public final void LJJIIJ(CRD model) {
        o.LJIIIZ(model, "model");
        if (!(model instanceof CQO)) {
            return;
        }
        MESSAGE message = ((CQO) model).LJIJJLI;
        if (message instanceof ChatMessage) {
            this.LJJLL++;
            return;
        }
        if (message instanceof LikeMessage) {
            this.LJJZ++;
            return;
        }
        if (message instanceof GiftMessage) {
            this.LJJZZI++;
            return;
        }
        if (message instanceof SocialMessage) {
            if (((int) ((SocialMessage) message).action) == 3) {
                this.LJJZZIII++;
                return;
            } else if (((int) ((SocialMessage) message).action) == 1) {
                this.LJL++;
                return;
            }
        }
        if (!(message instanceof MemberMessage) || ((MemberMessage) message).action != 1) {
            return;
        }
        this.LJLI++;
    }

    @Override // X.CRC, X.CR8
    public final void LJIIJ(InterfaceC31330CRi<? extends IMessage> interfaceC31330CRi, CR6 message) {
        o.LJIIIZ(message, "message");
        this.LJJJJ++;
    }

    @Override // X.AbstractC31386CTm, X.CRC, X.CR8
    public final void LJIIZILJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIIZILJ(j, model);
        if (!(model instanceof CQO)) {
            return;
        }
        MESSAGE message = ((CQO) model).LJIJJLI;
        if (message instanceof ChatMessage) {
            this.LJJLIIIJL++;
        } else if (message instanceof LikeMessage) {
            this.LJJLIIIJLJLI++;
        } else if (message instanceof GiftMessage) {
            this.LJJLIIIJLLLLLLLZ++;
        } else {
            if (message instanceof SocialMessage) {
                if (((int) ((SocialMessage) message).action) == 3) {
                    this.LJJLIIJ++;
                } else if (((int) ((SocialMessage) message).action) == 1) {
                    this.LJJLIL++;
                }
            }
            if ((message instanceof MemberMessage) && ((MemberMessage) message).action == 1) {
                this.LJJLJ++;
            }
        }
        this.LJJLJLI++;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, O] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, O] */
    @Override // X.AbstractC31386CTm, X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIJJ(long j, CRD model) {
        o.LJIIIZ(model, "model");
        super.LJIJJ(j, model);
        this.LJJJJI = (model.LJJIFFI().LIZJ - model.LJJIFFI().LIZIZ) + this.LJJJJI;
        this.LJJJJIZL++;
        if (j != 0 || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_public_screen_metrics", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", LJJIJIIJIL().LJIIJJI);
            jSONObject.put("anchor_id", LJJIJIIJIL().LJIILLIIL);
            jSONObject.put("admin_type", LJJIJIL());
            if (!LJJIJIIJIL().LJFF) {
                EnterRoomConfig.TimeStamp timeStamp = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null) {
                    long j2 = timeStamp.enterRoomStarTime;
                    jSONObject.put("public_screen_load_duration", this.LJJIZ - j2);
                    DataChannel dataChannel = LJJIJIIJIL().LJIIIIZZ;
                    if (dataChannel != null) {
                        ((C32536Cpo) dataChannel.gv0(C28421BDl.class)).LIZ = Long.valueOf(this.LJJIZ - j2);
                    }
                    jSONObject.put("public_screen_first_message_total_duration", this.LJJJI - j2);
                }
            } else {
                Long qo = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).qo(LJJIJIIJIL().LJIIJJI);
                if (qo != null) {
                    long longValue = qo.longValue();
                    DataChannel dataChannel2 = LJJIJIIJIL().LJIIIIZZ;
                    if (dataChannel2 != null) {
                        ((C32536Cpo) dataChannel2.gv0(C28421BDl.class)).LIZ = Long.valueOf(this.LJJIZ - longValue);
                    }
                    jSONObject.put("public_screen_load_duration", this.LJJIZ - longValue);
                    jSONObject.put("public_screen_first_message_total_duration", this.LJJJI - longValue);
                }
            }
            jSONObject.put("public_screen_first_message_receive_duration", this.LJJJ - this.LJJIZ);
            jSONObject.put("public_screen_first_message_show_duration", this.LJJJI - this.LJJJ);
        } catch (Exception unused) {
        }
        if (!LJJIJIIJIL().LJIIZILJ) {
            C0K2.LIZLLL("ttlive_public_screen_metrics", new JSONObject(), null, jSONObject);
        }
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJIJ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        super.LJJIJ(model, z);
        if (model instanceof CQO) {
            CQL cql = (CQL) model;
            if (cql.LJLJJLL()) {
                this.LJJJJJL++;
                if (model instanceof CQJ) {
                    this.LJJJJL++;
                }
            }
            User user = cql.getUser();
            if (user != null && user.isFollowing) {
                this.LJJJJLI++;
                if (model instanceof CQJ) {
                    this.LJJJJLL++;
                }
            }
        }
        this.LJJJJJ++;
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJ(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, boolean z, User user, boolean z2) {
        o.LJIIIZ(message, "message");
        super.LJJ(message, abstractC31313CQr, z, user, z2);
        User LIZ = abstractC31313CQr.LIZ(message, user);
        if (LIZ != null) {
            long id = LIZ.getId();
            if (user != null && id == user.getId()) {
                this.LJJJJJL++;
                if (message instanceof ChatMessage) {
                    this.LJJJJL++;
                }
            }
        }
        User LIZ2 = abstractC31313CQr.LIZ(message, user);
        if (LIZ2 != null && LIZ2.isFollowing) {
            this.LJJJJLI++;
            if (message instanceof ChatMessage) {
                this.LJJJJLL++;
            }
        }
        this.LJJJJJ++;
    }

    @Override // X.AbstractC31386CTm, X.CRC, X.CR8
    public final void LJJII(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, long j, boolean z, User user) {
        o.LJIIIZ(message, "message");
        super.LJJII(message, abstractC31313CQr, j, z, user);
        if (message instanceof ChatMessage) {
            this.LJJLIIIJL++;
        } else if (message instanceof LikeMessage) {
            this.LJJLIIIJLJLI++;
        } else if (message instanceof GiftMessage) {
            this.LJJLIIIJLLLLLLLZ++;
        } else {
            if (message instanceof SocialMessage) {
                if (((int) ((SocialMessage) message).action) == 3) {
                    this.LJJLIIJ++;
                } else if (((int) ((SocialMessage) message).action) == 1) {
                    this.LJJLIL++;
                }
            }
            if ((message instanceof MemberMessage) && ((MemberMessage) message).action == 1) {
                this.LJJLJ++;
            }
        }
        this.LJJLJLI++;
    }
}
