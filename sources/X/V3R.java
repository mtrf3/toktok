package X;

import com.ss.android.ugc.aweme.im.message.template.card.AnswerStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.card.BotAnswerCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V3R {
    public static final String LIZ(AnswerStatusComponent answerStatusComponent) {
        int i = V3S.LIZ[answerStatusComponent.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "risk_question";
                    }
                    throw new C162476Zf();
                }
                return "badword";
            }
            return "timeout";
        }
        return "normal";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final BotAnswerCardTemplate LIZIZ(C79131V3v c79131V3v) {
        ArrayList arrayList;
        TextComponent textComponent;
        AnswerStatusComponent answerStatusComponent;
        PreviewHintComponent LIZ;
        List list;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        long longValue;
        long longValue2;
        ImageComponent LIZ2;
        ImageComponent LIZ3;
        Integer num = c79131V3v.card_type;
        List<Integer> content_types = c79131V3v.content_types;
        List<C63714OzW> list2 = c79131V3v.link_infos;
        ArrayList arrayList2 = null;
        if (list2 != null) {
            arrayList = new ArrayList(C32I.LJJL(list2, 10));
            for (C63714OzW it : list2) {
                o.LJIIIIZZ(it, "it");
                arrayList.add(C62814Ol0.LJJIIZI(it));
            }
        } else {
            arrayList = null;
        }
        RUF ruf = c79131V3v.answer;
        if (ruf != null) {
            textComponent = C17N.LJJL(ruf);
        } else {
            textComponent = null;
        }
        V3T v3t = c79131V3v.answer_status;
        if (v3t == null) {
            answerStatusComponent = AnswerStatusComponent.ANSWER_NORMAL;
        } else {
            AnswerStatusComponent[] values = AnswerStatusComponent.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    answerStatusComponent = values[i];
                    if (answerStatusComponent.getValue() == v3t.getValue()) {
                        break;
                    }
                    i++;
                } else {
                    answerStatusComponent = AnswerStatusComponent.ANSWER_NORMAL;
                    break;
                }
            }
        }
        List<V4U> list3 = c79131V3v.recommend_items;
        if (list3 != null) {
            arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
            for (V4U it2 : list3) {
                o.LJIIIIZZ(it2, "it");
                Long l = it2.item_id;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                Long l2 = it2.digg_count;
                if (l2 == null) {
                    longValue2 = 0;
                } else {
                    longValue2 = l2.longValue();
                }
                C79135V3z c79135V3z = it2.cover;
                if (c79135V3z != null) {
                    LIZ2 = C79081V1x.LJJIZ(c79135V3z);
                } else {
                    ImageComponent.Companion.getClass();
                    LIZ2 = C79095V2l.LIZ();
                }
                C79135V3z c79135V3z2 = it2.fallback;
                if (c79135V3z2 != null) {
                    LIZ3 = C79081V1x.LJJIZ(c79135V3z2);
                } else {
                    ImageComponent.Companion.getClass();
                    LIZ3 = C79095V2l.LIZ();
                }
                arrayList2.add(new BotAnswerCardItemComponent(longValue, longValue2, LIZ2, LIZ3));
            }
        }
        V4L v4l = c79131V3v.preview_hint;
        if (v4l != null) {
            LIZ = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ = C79087V2d.LIZ();
        }
        List<C79129V3t> list4 = c79131V3v.recommend_users;
        if (list4 != null) {
            list = new ArrayList(C32I.LJJL(list4, 10));
            for (C79129V3t it3 : list4) {
                o.LJIIIIZZ(it3, "it");
                list.add(C79004UzY.LJJJJLI(it3));
            }
        } else {
            list = C61878OQg.INSTANCE;
        }
        RU2 ru2 = c79131V3v.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = c79131V3v.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        o.LJIIIIZZ(content_types, "content_types");
        return new BotAnswerCardTemplate(num, content_types, arrayList, textComponent, arrayList2, answerStatusComponent, list, LIZ, baseRequestComponent, baseResponseComponent);
    }
}
