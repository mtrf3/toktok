package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.preload.PreloadComponent;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.ugctemplate.bizmodel.TextStickerBizModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQW extends AbstractC65781Prl implements InterfaceC88476Ynw<String, String, Long, String, String, String, C76800UCe> {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ PreloadComponent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HQW(C68322mC<String> c68322mC, PreloadComponent preloadComponent) {
        super(6);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = preloadComponent;
    }

    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(String str, String str2, Long l, String str3, String str4, String str5) {
        int i;
        String str6 = str;
        String str7 = str2;
        l.longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadComponent, preload: getTemplate success, templateId=");
        LIZ.append(this.LJLIL.element);
        LIZ.append(" templateUrl=");
        LIZ.append(str6);
        H78.LJI(X1D.LIZIZ(LIZ));
        PreloadComponent preloadComponent = this.LJLILLLLZI;
        if (str6 == null) {
            str6 = "";
        }
        preloadComponent.LJLJI = str6;
        if (str7 == null) {
            str7 = "";
        }
        preloadComponent.LJLJJI = str7;
        if (C78685UuP.LJJJZ(str6) && C78685UuP.LJJJZ(this.LJLILLLLZI.LJLJJI)) {
            final PreloadComponent preloadComponent2 = this.LJLILLLLZI;
            String str8 = this.LJLIL.element;
            String str9 = preloadComponent2.LJLJI;
            String str10 = preloadComponent2.LJLJJI;
            HQU hqu = preloadComponent2.LJLIL;
            if (hqu.LIZJ) {
                i = 5;
            } else {
                i = 1;
            }
            if (hqu instanceof HQZ) {
                i = 3;
            }
            H82 h82 = H89.LIZ;
            if (h82 != null) {
                ActivityC86117Xqz activityC86117Xqz = preloadComponent2.LJLILLLLZI;
                if (activityC86117Xqz != null) {
                    h82.LIZ(activityC86117Xqz, true, i, str8, str9, str10, new InterfaceC172786qI() { // from class: X.5Wz
                        @Override // X.InterfaceC172786qI
                        public final void onError(int i2, String str11) {
                        }

                        @Override // X.InterfaceC172786qI
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC172786qI
                        public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                            OSZ<String, String> LIZJ;
                            String second;
                            NLESegment nLESegment;
                            if (nLETemplateModel == null) {
                                return;
                            }
                            C5X0 c5x0 = new C5X0();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                            ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
                            Iterator<NLETrack> it = tracks.iterator();
                            while (it.hasNext()) {
                                NLETrack next = it.next();
                                NLETrack nLETrack = next;
                                if (nLETrack.LJIIZILJ() == EnumC123864ta.STICKER) {
                                    NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack.LJIILL());
                                    if (nLETrackSlot != null) {
                                        nLESegment = nLETrackSlot.LJI();
                                    } else {
                                        nLESegment = null;
                                    }
                                    if (NLESegmentTextSticker.LJFF(nLESegment) != null) {
                                        LIZ2.add(next);
                                    }
                                }
                            }
                            Iterator it2 = LIZ2.iterator();
                            while (it2.hasNext()) {
                                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        TextStickerBizModel textStickerBizModel = (TextStickerBizModel) C60903NvH.LJIIJJI().LIZ().LJI(it3.next().getExtra("biz_data"), TextStickerBizModel.class);
                                        if (textStickerBizModel != null && (LIZJ = C134305Ow.LIZJ(textStickerBizModel.ttsInfo.voiceResId)) != null && (second = LIZJ.getSecond()) != null && second.length() > 0) {
                                            linkedHashSet.add(second);
                                        }
                                    } catch (Exception e) {
                                        H78.LJ(e);
                                    }
                                }
                            }
                            if (!linkedHashSet.isEmpty()) {
                                ((InterfaceC84498XEg) c5x0.LIZ.getValue()).LJJJIL(ORZ.LLJI(linkedHashSet), C0JU.LIZ("panel", "speaking-voice"), new IFetchEffectListByIdsListener() { // from class: X.5X3
                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                                    public final void onFail(ExceptionResult exceptionResult) {
                                        Integer num;
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("fetch voice res failed,code: ");
                                        String str11 = null;
                                        if (exceptionResult != null) {
                                            num = Integer.valueOf(exceptionResult.getErrorCode());
                                        } else {
                                            num = null;
                                        }
                                        LIZ3.append(num);
                                        LIZ3.append(" msg: ");
                                        if (exceptionResult != null) {
                                            str11 = exceptionResult.getMsg();
                                        }
                                        LIZ3.append(str11);
                                        H78.LJII(X1D.LIZIZ(LIZ3));
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final void onSuccess(EffectListResponse effectListResponse) {
                                        List<Effect> data;
                                        EffectListResponse effectListResponse2 = effectListResponse;
                                        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null) {
                                            for (Effect effect : data) {
                                                C172656q5.LIZ().LIZIZ(effect, "speaking-voice", effect.getResourceId());
                                            }
                                            if (C76800UCe.LIZ != null) {
                                                return;
                                            }
                                        }
                                        H78.LJII("fetch voice res success but data is empty");
                                    }
                                });
                            }
                            ((InterfaceC84498XEg) c5x0.LIZ.getValue()).fetchList("editingeffect", false, new IFetchEffectChannelListener() { // from class: X.5X2
                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    Integer num;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("fetch effect list failed,code: ");
                                    String str11 = null;
                                    if (exceptionResult != null) {
                                        num = Integer.valueOf(exceptionResult.getErrorCode());
                                    } else {
                                        num = null;
                                    }
                                    LIZ3.append(num);
                                    LIZ3.append(" msg: ");
                                    if (exceptionResult != null) {
                                        str11 = exceptionResult.getMsg();
                                    }
                                    LIZ3.append(str11);
                                    H78.LJII(X1D.LIZIZ(LIZ3));
                                }

                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                                    if (effectChannelResponse != null) {
                                        C5WP LIZ3 = C172656q5.LIZ();
                                        LIZ3.getClass();
                                        LIZ3.LIZIZ.put("editingeffect", effectChannelResponse);
                                        if (C76800UCe.LIZ != null) {
                                            return;
                                        }
                                    }
                                    H78.LJII("fetch effect list success but rsp is null");
                                }
                            });
                        }

                        @Override // X.InterfaceC172786qI
                        public final void onSuccess(NLETemplateModel nLETemplateModel) {
                            if (nLETemplateModel == null) {
                                return;
                            }
                            VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                            o.LJIIIIZZ(tracks, "model.tracks");
                            PreloadComponent preloadComponent3 = PreloadComponent.this;
                            Iterator<NLETrack> it = tracks.iterator();
                            while (it.hasNext()) {
                                Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
                                while (it2.hasNext()) {
                                    NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(it2.next().LJI());
                                    if (LIZLLL != null && NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(LIZLLL.LJ().LIZLLL())) {
                                        preloadComponent3.LJLJJL = LIZLLL.LJ().LIZJ();
                                        return;
                                    }
                                }
                            }
                        }
                    });
                } else {
                    o.LJIJI("activity");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
