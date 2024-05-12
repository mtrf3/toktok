package com.ss.ugc.effectplatform.model;

import X.C48464J0i;
import X.ESW;
import X.InterfaceC58592Mz6;
import X.N2E;
import X.UC7;
import X.X1D;
import X.XAQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes16.dex */
public class Effect implements AndroidParcelable {
    public String _model_names;
    public List<String> _requirements;
    public List<String> _type;
    public String ad_raw_data;
    public List<String> bind_ids;
    public List<String> challenge;
    public List<? extends Effect> child_effects;
    public List<String> children;
    public List<String> composerPath;
    public String composer_params;
    public String designer_encrypted_id;
    public String designer_id;
    public String device_platform;
    public String doc_id;
    public String effect_id;
    public String effect_source_id;
    public int effect_type;
    public String extra;
    public DiffEffect file_diff;
    public UrlModel file_url;
    public String grade_key;
    public String hint;
    public UrlModel hint_file;
    public int hint_file_format;
    public UrlModel hint_icon;
    public UrlModel icon_url;
    public String id;
    public String iop_id;
    public boolean isDownloaded;
    public boolean is_busi;
    public boolean is_iop;
    public String model_names;
    public String model_names_sec;
    public List<String> music;
    public String name;
    public String original_effect_id;
    public String panel;
    public String parent;
    public long ptime;
    public String recId;
    public long rec_tag;
    public List<String> requirements;
    public List<String> requirements_sec;
    public String resource_id;
    public String schema;
    public String sdk_extra;
    public String searchType;
    public String server_extra;
    public int source;
    public List<String> tags;
    public String tags_updated_at;
    public TemplateEffectExtra template_effect_extra;
    public String template_effect_id;
    public String transResPath;
    public UrlModel trans_file_url;
    public List<String> types;
    public List<String> types_sec;
    public String unzipPath;
    public long use_number;
    public String zipPath;
    public static final C48464J0i Companion = new C48464J0i();
    public static final Parcelable.Creator CREATOR = new ESW();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Effect() {
        /*
            r64 = this;
            r1 = 0
            r11 = 0
            r35 = 0
            r61 = -1
            r62 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r64
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r11
            r20 = r11
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r11
            r31 = r1
            r32 = r11
            r33 = r1
            r34 = r1
            r37 = r1
            r38 = r1
            r39 = r35
            r41 = r1
            r42 = r1
            r43 = r1
            r44 = r1
            r45 = r1
            r46 = r11
            r47 = r1
            r48 = r1
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r1
            r53 = r1
            r54 = r1
            r55 = r1
            r56 = r35
            r58 = r1
            r59 = r1
            r60 = r1
            r63 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.Effect.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getModel_names() {
        String model_names_sec;
        String str;
        String str2 = this._model_names;
        if ((str2 == null || o.LJJJJJL(str2)) && (model_names_sec = getModel_names_sec()) != null && !o.LJJJJJL(model_names_sec)) {
            InterfaceC58592Mz6 interfaceC58592Mz6 = XAQ.LIZ;
            if (interfaceC58592Mz6 != null) {
                str = interfaceC58592Mz6.decrypt(getModel_names_sec());
            } else {
                str = null;
            }
            this._model_names = str;
        }
        String str3 = this._model_names;
        if (str3 == null || o.LJJJJJL(str3)) {
            return this.model_names;
        }
        return this._model_names;
    }

    public List<String> getRequirements() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.requirements_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.requirements_sec) == null || list.size() != this._requirements.size())) {
            InterfaceC58592Mz6 interfaceC58592Mz6 = XAQ.LIZ;
            if (interfaceC58592Mz6 == null || (arrayList = N2E.LIZ(interfaceC58592Mz6, this.requirements_sec)) == null) {
                arrayList = new ArrayList<>();
            }
            this._requirements = arrayList;
        }
        if (this._requirements.isEmpty()) {
            return this.requirements;
        }
        return this._requirements;
    }

    public List<String> getTypes() {
        List<String> list;
        List<String> arrayList;
        List<String> list2 = this.types_sec;
        if (list2 != null && !list2.isEmpty() && ((list = this.types_sec) == null || list.size() != this._type.size())) {
            InterfaceC58592Mz6 interfaceC58592Mz6 = XAQ.LIZ;
            if (interfaceC58592Mz6 == null || (arrayList = N2E.LIZ(interfaceC58592Mz6, this.types_sec)) == null) {
                arrayList = new ArrayList<>();
            }
            this._type = arrayList;
        }
        if (this._type.isEmpty()) {
            return this.types;
        }
        return this._type;
    }

    public int hashCode() {
        return getResource_id().hashCode() + ((getEffect_id().hashCode() + (getId().hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect(name='");
        LIZ.append(getName());
        LIZ.append("', _requirements=");
        LIZ.append(this._requirements);
        LIZ.append(", requirements_sec=");
        LIZ.append(this.requirements_sec);
        LIZ.append(", ");
        LIZ.append("hint='");
        LIZ.append(getHint());
        LIZ.append("', id='");
        LIZ.append(getId());
        LIZ.append("', effect_id='");
        LIZ.append(getEffect_id());
        LIZ.append("', file_url=");
        LIZ.append(getFile_url());
        LIZ.append(", icon_url=");
        LIZ.append(getIcon_url());
        LIZ.append(", ");
        LIZ.append("hint_icon=");
        LIZ.append(getHint_icon());
        LIZ.append(", hint_file=");
        LIZ.append(getHint_file());
        LIZ.append(", hint_file_format=");
        LIZ.append(getHint_file_format());
        LIZ.append(", ");
        LIZ.append("_type=");
        LIZ.append(this._type);
        LIZ.append(", types_sec=");
        LIZ.append(this.types_sec);
        LIZ.append(", tags=");
        LIZ.append(getTags());
        LIZ.append(", tags_updated_at='");
        LIZ.append(getTags_updated_at());
        LIZ.append("', ");
        LIZ.append("children=");
        LIZ.append(getChildren());
        LIZ.append(", child_effects=");
        LIZ.append(getChild_effects());
        LIZ.append(", parent=");
        LIZ.append(getParent());
        LIZ.append(", effect_type=");
        LIZ.append(getEffect_type());
        LIZ.append(", ");
        LIZ.append("source=");
        LIZ.append(getSource());
        LIZ.append(", designer_id='");
        LIZ.append(getDesigner_id());
        LIZ.append("', designer_encrypted_id='");
        LIZ.append(getDesigner_encrypted_id());
        LIZ.append("', ");
        LIZ.append("device_platform='");
        LIZ.append(getDevice_platform());
        LIZ.append("', schema='");
        LIZ.append(getSchema());
        LIZ.append("', music=");
        LIZ.append(getMusic());
        LIZ.append(", extra=");
        LIZ.append(getExtra());
        LIZ.append(", ");
        LIZ.append("sdk_extra='");
        LIZ.append(getSdk_extra());
        LIZ.append("', ad_raw_data='");
        LIZ.append(getAd_raw_data());
        LIZ.append("', composer_params='");
        LIZ.append(getComposer_params());
        LIZ.append("', ");
        LIZ.append("is_busi=");
        LIZ.append(is_busi());
        LIZ.append(", iop_id='");
        LIZ.append(getIop_id());
        LIZ.append("', is_iop=");
        LIZ.append(is_iop());
        LIZ.append(", resource_id='");
        LIZ.append(getResource_id());
        LIZ.append("', ");
        LIZ.append("bind_ids=");
        LIZ.append(getBind_ids());
        LIZ.append(", ptime=");
        LIZ.append(getPtime());
        LIZ.append(", grade_key='");
        LIZ.append(getGrade_key());
        LIZ.append("', challenge=");
        LIZ.append(getChallenge());
        LIZ.append(", ");
        LIZ.append("composerPath=");
        LIZ.append(getComposerPath());
        LIZ.append(", zipPath='");
        LIZ.append(getZipPath());
        LIZ.append("', unzipPath='");
        LIZ.append(getUnzipPath());
        LIZ.append("', ");
        LIZ.append("transResPath='");
        LIZ.append(getTransResPath());
        LIZ.append("', isDownloaded=");
        LIZ.append(isDownloaded());
        LIZ.append(", panel='");
        LIZ.append(getPanel());
        LIZ.append("', ");
        LIZ.append("searchType='");
        LIZ.append(getSearchType());
        LIZ.append("', recId=");
        LIZ.append(getRecId());
        LIZ.append(", _model_names=");
        LIZ.append(this._model_names);
        LIZ.append(", ");
        LIZ.append("model_names_sec=");
        LIZ.append(getModel_names_sec());
        LIZ.append(", original_effect_id=");
        LIZ.append(getOriginal_effect_id());
        LIZ.append(", ");
        LIZ.append("trans_file_url=");
        LIZ.append(getTrans_file_url());
        LIZ.append(", template_effect_id=");
        LIZ.append(getTemplate_effect_id());
        LIZ.append(", doc_id=");
        LIZ.append(getDoc_id());
        LIZ.append(", ");
        LIZ.append("rec_tag=");
        LIZ.append(getRec_tag());
        LIZ.append(", requirements=");
        LIZ.append(getRequirements());
        LIZ.append(", types=");
        LIZ.append(getTypes());
        LIZ.append(", model_names=");
        LIZ.append(getModel_names());
        LIZ.append(", template_effect_extra=");
        LIZ.append(getTemplate_effect_extra());
        LIZ.append(", server_extra=");
        LIZ.append(getServer_extra());
        LIZ.append(", file_diff=");
        LIZ.append(getFile_diff());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public List<String> getBind_ids() {
        return this.bind_ids;
    }

    public List<String> getChallenge() {
        return this.challenge;
    }

    public List<Effect> getChild_effects() {
        return this.child_effects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getComposer_params() {
        return this.composer_params;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public String getDevice_platform() {
        return this.device_platform;
    }

    public String getDoc_id() {
        return this.doc_id;
    }

    public String getEffect_id() {
        return this.effect_id;
    }

    public String getEffect_source_id() {
        return this.effect_source_id;
    }

    public int getEffect_type() {
        return this.effect_type;
    }

    public String getExtra() {
        return this.extra;
    }

    public DiffEffect getFile_diff() {
        return this.file_diff;
    }

    public UrlModel getFile_url() {
        return this.file_url;
    }

    public String getGrade_key() {
        return this.grade_key;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHint_file() {
        return this.hint_file;
    }

    public int getHint_file_format() {
        return this.hint_file_format;
    }

    public UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public UrlModel getIcon_url() {
        return this.icon_url;
    }

    public String getId() {
        return this.id;
    }

    public final String getInternalModelNames$effect_model_release() {
        return this._model_names;
    }

    public final List<String> getInternalRequirements$effect_model_release() {
        return this._requirements;
    }

    public final List<String> getInternalType$effect_model_release() {
        return this._type;
    }

    public String getIop_id() {
        return this.iop_id;
    }

    public String getModel_names_sec() {
        return this.model_names_sec;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginal_effect_id() {
        return this.original_effect_id;
    }

    public String getPanel() {
        return this.panel;
    }

    public String getParent() {
        return this.parent;
    }

    public long getPtime() {
        return this.ptime;
    }

    public String getRecId() {
        return this.recId;
    }

    public long getRec_tag() {
        return this.rec_tag;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public String getResource_id() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdk_extra() {
        return this.sdk_extra;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public String getServer_extra() {
        return this.server_extra;
    }

    public int getSource() {
        return this.source;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public TemplateEffectExtra getTemplate_effect_extra() {
        return this.template_effect_extra;
    }

    public String getTemplate_effect_id() {
        return this.template_effect_id;
    }

    public String getTransResPath() {
        return this.transResPath;
    }

    public UrlModel getTrans_file_url() {
        return this.trans_file_url;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public long getUse_number() {
        return this.use_number;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public boolean isDownloaded() {
        return this.isDownloaded;
    }

    public boolean is_busi() {
        return this.is_busi;
    }

    public boolean is_iop() {
        return this.is_iop;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Effect)) {
            return false;
        }
        Effect effect = (Effect) obj;
        if (!(!kotlin.jvm.internal.o.LJ(getId(), effect.getId())) && !(!kotlin.jvm.internal.o.LJ(getEffect_id(), effect.getEffect_id())) && !(!kotlin.jvm.internal.o.LJ(getResource_id(), effect.getResource_id()))) {
            return true;
        }
        return false;
    }

    public void setAd_raw_data(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.ad_raw_data = str;
    }

    public void setBind_ids(List<String> list) {
        this.bind_ids = list;
    }

    public void setChallenge(List<String> list) {
        this.challenge = list;
    }

    public void setChild_effects(List<? extends Effect> list) {
        kotlin.jvm.internal.o.LJIIJ(list, "<set-?>");
        this.child_effects = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setComposer_params(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.composer_params = str;
    }

    public void setDesigner_encrypted_id(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.designer_id = str;
    }

    public void setDevice_platform(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.device_platform = str;
    }

    public void setDoc_id(String str) {
        this.doc_id = str;
    }

    public void setDownloaded(boolean z) {
        this.isDownloaded = z;
    }

    public void setEffect_id(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.effect_id = str;
    }

    public void setEffect_source_id(String str) {
        this.effect_source_id = str;
    }

    public void setEffect_type(int i) {
        this.effect_type = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFile_diff(DiffEffect diffEffect) {
        this.file_diff = diffEffect;
    }

    public void setFile_url(UrlModel urlModel) {
        kotlin.jvm.internal.o.LJIIJ(urlModel, "<set-?>");
        this.file_url = urlModel;
    }

    public void setGrade_key(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.grade_key = str;
    }

    public void setHint(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.hint = str;
    }

    public void setHint_file(UrlModel urlModel) {
        kotlin.jvm.internal.o.LJIIJ(urlModel, "<set-?>");
        this.hint_file = urlModel;
    }

    public void setHint_file_format(int i) {
        this.hint_file_format = i;
    }

    public void setHint_icon(UrlModel urlModel) {
        kotlin.jvm.internal.o.LJIIJ(urlModel, "<set-?>");
        this.hint_icon = urlModel;
    }

    public void setIcon_url(UrlModel urlModel) {
        kotlin.jvm.internal.o.LJIIJ(urlModel, "<set-?>");
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.id = str;
    }

    public void setIop_id(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.iop_id = str;
    }

    public final void setModel_names(String str) {
        this.model_names = str;
    }

    public void setModel_names_sec(String str) {
        this.model_names_sec = str;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setName(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.name = str;
    }

    public void setOriginal_effect_id(String str) {
        this.original_effect_id = str;
    }

    public void setPanel(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.panel = str;
    }

    public void setParent(String str) {
        this.parent = str;
    }

    public void setPtime(long j) {
        this.ptime = j;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRec_tag(long j) {
        this.rec_tag = j;
    }

    public void setRequirements(List<String> list) {
        kotlin.jvm.internal.o.LJIIJ(list, "<set-?>");
        this.requirements = list;
    }

    public final void setRequirements_sec(List<String> list) {
        this.requirements_sec = list;
    }

    public void setResource_id(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.resource_id = str;
    }

    public void setSchema(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.schema = str;
    }

    public void setSdk_extra(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.sdk_extra = str;
    }

    public void setSearchType(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.searchType = str;
    }

    public void setServer_extra(String str) {
        this.server_extra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTags_updated_at(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.tags_updated_at = str;
    }

    public void setTemplate_effect_extra(TemplateEffectExtra templateEffectExtra) {
        this.template_effect_extra = templateEffectExtra;
    }

    public void setTemplate_effect_id(String str) {
        this.template_effect_id = str;
    }

    public void setTransResPath(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.transResPath = str;
    }

    public void setTrans_file_url(UrlModel urlModel) {
        this.trans_file_url = urlModel;
    }

    public void setTypes(List<String> list) {
        kotlin.jvm.internal.o.LJIIJ(list, "<set-?>");
        this.types = list;
    }

    public final void setTypes_sec(List<String> list) {
        this.types_sec = list;
    }

    public void setUnzipPath(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.unzipPath = str;
    }

    public void setUse_number(long j) {
        this.use_number = j;
    }

    public void setZipPath(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.zipPath = str;
    }

    public void set_busi(boolean z) {
        this.is_busi = z;
    }

    public void set_iop(boolean z) {
        this.is_iop = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.o.LJIIJ(parcel, "parcel");
        Companion.getClass();
        parcel.writeString(getName());
        parcel.writeStringList(getInternalRequirements$effect_model_release());
        parcel.writeStringList(getRequirements_sec());
        parcel.writeString(getHint());
        parcel.writeString(getId());
        parcel.writeString(getEffect_id());
        parcel.writeParcelable(getFile_url(), i);
        parcel.writeParcelable(getIcon_url(), i);
        parcel.writeParcelable(getHint_icon(), i);
        parcel.writeParcelable(getHint_file(), i);
        parcel.writeInt(getHint_file_format());
        parcel.writeStringList(getInternalType$effect_model_release());
        parcel.writeStringList(getTypes_sec());
        parcel.writeStringList(getTags());
        parcel.writeString(getTags_updated_at());
        parcel.writeStringList(getChildren());
        Iterator LIZJ = UC7.LIZJ(getChild_effects(), parcel);
        while (LIZJ.hasNext()) {
            parcel.writeParcelable((Effect) LIZJ.next(), i);
        }
        parcel.writeString(getParent());
        parcel.writeInt(getEffect_type());
        parcel.writeInt(getSource());
        parcel.writeString(getDesigner_id());
        parcel.writeString(getDesigner_encrypted_id());
        parcel.writeString(getDevice_platform());
        parcel.writeString(getSchema());
        parcel.writeStringList(getMusic());
        parcel.writeString(getExtra());
        parcel.writeString(getSdk_extra());
        parcel.writeString(getAd_raw_data());
        parcel.writeString(getComposer_params());
        parcel.writeInt(is_busi() ? 1 : 0);
        parcel.writeString(getIop_id());
        parcel.writeInt(is_iop() ? 1 : 0);
        parcel.writeString(getResource_id());
        parcel.writeStringList(getBind_ids());
        parcel.writeLong(getPtime());
        parcel.writeString(getGrade_key());
        parcel.writeStringList(getChallenge());
        parcel.writeLong(getUse_number());
        parcel.writeString(getEffect_source_id());
        parcel.writeStringList(getComposerPath());
        parcel.writeString(getZipPath());
        parcel.writeString(getUnzipPath());
        parcel.writeString(getTransResPath());
        parcel.writeInt(isDownloaded() ? 1 : 0);
        parcel.writeString(getPanel());
        parcel.writeString(getSearchType());
        parcel.writeString(getRecId());
        parcel.writeString(getInternalModelNames$effect_model_release());
        parcel.writeString(getModel_names_sec());
        parcel.writeString(getOriginal_effect_id());
        parcel.writeParcelable(getTrans_file_url(), i);
        parcel.writeString(getTemplate_effect_id());
        parcel.writeString(getDoc_id());
        parcel.writeLong(getRec_tag());
        parcel.writeParcelable(getTemplate_effect_extra(), i);
        parcel.writeString(getServer_extra());
        parcel.writeParcelable(getFile_diff(), i);
        parcel.writeStringList(getRequirements());
        parcel.writeStringList(getTypes());
        parcel.writeString(getModel_names());
    }

    public Effect(String name, List<String> _requirements, List<String> list, String hint, String id, String effect_id, UrlModel file_url, UrlModel icon_url, UrlModel hint_icon, UrlModel hint_file, int i, List<String> _type, List<String> list2, List<String> list3, String tags_updated_at, List<String> list4, List<? extends Effect> child_effects, String str, int i2, int i3, String designer_id, String designer_encrypted_id, String device_platform, String schema, List<String> list5, String str2, String sdk_extra, String ad_raw_data, String composer_params, boolean z, String iop_id, boolean z2, String resource_id, List<String> list6, long j, String grade_key, List<String> list7, long j2, String str3, List<String> list8, String zipPath, String unzipPath, String transResPath, boolean z3, String panel, String searchType, String str4, String str5, String str6, String str7, UrlModel urlModel, String str8, String str9, long j3, TemplateEffectExtra templateEffectExtra, String str10, DiffEffect diffEffect) {
        kotlin.jvm.internal.o.LJIIJ(name, "name");
        kotlin.jvm.internal.o.LJIIJ(_requirements, "_requirements");
        kotlin.jvm.internal.o.LJIIJ(hint, "hint");
        kotlin.jvm.internal.o.LJIIJ(id, "id");
        kotlin.jvm.internal.o.LJIIJ(effect_id, "effect_id");
        kotlin.jvm.internal.o.LJIIJ(file_url, "file_url");
        kotlin.jvm.internal.o.LJIIJ(icon_url, "icon_url");
        kotlin.jvm.internal.o.LJIIJ(hint_icon, "hint_icon");
        kotlin.jvm.internal.o.LJIIJ(hint_file, "hint_file");
        kotlin.jvm.internal.o.LJIIJ(_type, "_type");
        kotlin.jvm.internal.o.LJIIJ(tags_updated_at, "tags_updated_at");
        kotlin.jvm.internal.o.LJIIJ(child_effects, "child_effects");
        kotlin.jvm.internal.o.LJIIJ(designer_id, "designer_id");
        kotlin.jvm.internal.o.LJIIJ(designer_encrypted_id, "designer_encrypted_id");
        kotlin.jvm.internal.o.LJIIJ(device_platform, "device_platform");
        kotlin.jvm.internal.o.LJIIJ(schema, "schema");
        kotlin.jvm.internal.o.LJIIJ(sdk_extra, "sdk_extra");
        kotlin.jvm.internal.o.LJIIJ(ad_raw_data, "ad_raw_data");
        kotlin.jvm.internal.o.LJIIJ(composer_params, "composer_params");
        kotlin.jvm.internal.o.LJIIJ(iop_id, "iop_id");
        kotlin.jvm.internal.o.LJIIJ(resource_id, "resource_id");
        kotlin.jvm.internal.o.LJIIJ(grade_key, "grade_key");
        kotlin.jvm.internal.o.LJIIJ(zipPath, "zipPath");
        kotlin.jvm.internal.o.LJIIJ(unzipPath, "unzipPath");
        kotlin.jvm.internal.o.LJIIJ(transResPath, "transResPath");
        kotlin.jvm.internal.o.LJIIJ(panel, "panel");
        kotlin.jvm.internal.o.LJIIJ(searchType, "searchType");
        this.name = name;
        this._requirements = _requirements;
        this.requirements_sec = list;
        this.hint = hint;
        this.id = id;
        this.effect_id = effect_id;
        this.file_url = file_url;
        this.icon_url = icon_url;
        this.hint_icon = hint_icon;
        this.hint_file = hint_file;
        this.hint_file_format = i;
        this._type = _type;
        this.types_sec = list2;
        this.tags = list3;
        this.tags_updated_at = tags_updated_at;
        this.children = list4;
        this.child_effects = child_effects;
        this.parent = str;
        this.effect_type = i2;
        this.source = i3;
        this.designer_id = designer_id;
        this.designer_encrypted_id = designer_encrypted_id;
        this.device_platform = device_platform;
        this.schema = schema;
        this.music = list5;
        this.extra = str2;
        this.sdk_extra = sdk_extra;
        this.ad_raw_data = ad_raw_data;
        this.composer_params = composer_params;
        this.is_busi = z;
        this.iop_id = iop_id;
        this.is_iop = z2;
        this.resource_id = resource_id;
        this.bind_ids = list6;
        this.ptime = j;
        this.grade_key = grade_key;
        this.challenge = list7;
        this.use_number = j2;
        this.effect_source_id = str3;
        this.composerPath = list8;
        this.zipPath = zipPath;
        this.unzipPath = unzipPath;
        this.transResPath = transResPath;
        this.isDownloaded = z3;
        this.panel = panel;
        this.searchType = searchType;
        this.recId = str4;
        this._model_names = str5;
        this.model_names_sec = str6;
        this.original_effect_id = str7;
        this.trans_file_url = urlModel;
        this.template_effect_id = str8;
        this.doc_id = str9;
        this.rec_tag = j3;
        this.template_effect_extra = templateEffectExtra;
        this.server_extra = str10;
        this.file_diff = diffEffect;
        this.requirements = new ArrayList();
        this.types = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Effect(String str, List list, List list2, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, int i, List list3, List list4, List list5, String str5, List list6, List list7, String str6, int i2, int i3, String str7, String str8, String str9, String str10, List list8, String str11, String str12, String str13, String str14, boolean z, String str15, boolean z2, String str16, List list9, long j, String str17, List list10, long j2, String str18, List list11, String str19, String str20, String str21, boolean z3, String str22, String str23, String str24, String str25, String str26, String str27, UrlModel urlModel5, String str28, String str29, long j3, TemplateEffectExtra templateEffectExtra, String str30, DiffEffect diffEffect, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? new ArrayList() : list, (i4 & 4) != 0 ? null : list2, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : urlModel, (i4 & 128) != 0 ? new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : urlModel2, (i4 & 256) != 0 ? new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : urlModel3, (i4 & 512) != 0 ? new UrlModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : urlModel4, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? new ArrayList() : list3, (i4 & 4096) != 0 ? null : list4, (i4 & FileUtils.BUFFER_SIZE) != 0 ? new ArrayList() : list5, (i4 & 16384) != 0 ? "" : str5, (i4 & 32768) != 0 ? null : list6, (i4 & 65536) != 0 ? new ArrayList() : list7, (i4 & 131072) != 0 ? null : str6, (262144 & i4) != 0 ? 0 : i2, (524288 & i4) != 0 ? 0 : i3, (1048576 & i4) != 0 ? "" : str7, (2097152 & i4) != 0 ? "" : str8, (4194304 & i4) != 0 ? "" : str9, (8388608 & i4) != 0 ? "" : str10, (16777216 & i4) != 0 ? null : list8, (33554432 & i4) != 0 ? null : str11, (67108864 & i4) != 0 ? "" : str12, (134217728 & i4) != 0 ? "" : str13, (268435456 & i4) != 0 ? "" : str14, (536870912 & i4) != 0 ? false : z, (1073741824 & i4) != 0 ? "" : str15, (i4 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? false : z2, (i5 & 1) != 0 ? "" : str16, (i5 & 2) != 0 ? null : list9, (i5 & 4) != 0 ? 0L : j, (i5 & 8) != 0 ? "" : str17, (i5 & 16) != 0 ? null : list10, (i5 & 32) != 0 ? 0L : j2, (i5 & 64) != 0 ? null : str18, (i5 & 128) != 0 ? null : list11, (i5 & 256) != 0 ? "" : str19, (i5 & 512) != 0 ? "" : str20, (i5 & 1024) != 0 ? "" : str21, (i5 & 2048) != 0 ? false : z3, (i5 & 4096) != 0 ? "" : str22, (i5 & FileUtils.BUFFER_SIZE) == 0 ? str23 : "", (i5 & 16384) != 0 ? null : str24, (i5 & 32768) != 0 ? null : str25, (i5 & 65536) != 0 ? null : str26, (i5 & 131072) != 0 ? null : str27, (262144 & i5) != 0 ? null : urlModel5, (524288 & i5) != 0 ? null : str28, (1048576 & i5) != 0 ? null : str29, (2097152 & i5) == 0 ? j3 : 0L, (4194304 & i5) != 0 ? null : templateEffectExtra, (8388608 & i5) != 0 ? null : str30, (i5 & 16777216) != 0 ? null : diffEffect);
    }
}
