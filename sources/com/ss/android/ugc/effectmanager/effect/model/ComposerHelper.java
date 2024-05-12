package com.ss.android.ugc.effectmanager.effect.model;

import X.C16880lQ;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class ComposerHelper {
    public static List<String> serverURLs = new ArrayList();

    public static List<String> getServerUrls() {
        return serverURLs;
    }

    public static void setServerUrls(List<String> list) {
        serverURLs = list;
    }

    public static int versionCompare(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i < split.length && i < split2.length) {
            return Integer.signum(CastIntegerProtector.valueOf(split[i]).compareTo(CastIntegerProtector.valueOf(split2[i])));
        }
        return Integer.signum(split.length - split2.length);
    }

    public static ComposerNode parseComposerMaterial(String str, String str2, String str3) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        String str4 = File.separator;
        LIZ.append(str4);
        LIZ.append("config.json");
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(new JSONObject(fileUtils.getFileContent(X1D.LIZIZ(LIZ))), "effect"), "Link");
            if (jSONArray.length() <= 0) {
                return null;
            }
            String string = JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), "path");
            if (!JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), "type").toLowerCase().equals("composer")) {
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str4);
            LIZ2.append(string);
            LIZ2.append("content.json");
            JSONObject jSONObject = new JSONObject(fileUtils.getFileContent(X1D.LIZIZ(LIZ2)));
            ComposerNode composerNode = new ComposerNode();
            composerNode.tag_name = "root";
            composerNode.UI_name = "Composer";
            composerNode.type = 4;
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content");
            composerNode.children = new ArrayList();
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "nodes");
            for (int i = 0; i < jSONArray2.length(); i++) {
                ComposerNode parseComposerNode = parseComposerNode(JSONArrayProtectorUtils.getJSONObject(jSONArray2, i), str2, str3);
                if (parseComposerNode != null) {
                    parseComposerNode.parent = composerNode;
                }
                composerNode.children.add(parseComposerNode);
            }
            return composerNode;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static ComposerNode parseComposerNode(JSONObject jSONObject, String str, String str2) {
        try {
            ComposerNode composerNode = new ComposerNode();
            composerNode.type = JSONObjectProtectorUtils.getInt(jSONObject, "type");
            composerNode.file = jSONObject.optString("file", "");
            if (!CollectionUtil.isListEmpty(getServerUrls())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((String) ListProtector.get(getServerUrls(), 0));
                LIZ.append(jSONObject.optString("icon", null));
                composerNode.icon = X1D.LIZIZ(LIZ);
                composerNode.UI_name = jSONObject.optString("UI_name", null);
                composerNode.tag_name = JSONObjectProtectorUtils.getString(jSONObject, "tag_name");
                composerNode.default_value = (float) jSONObject.optDouble("default_value", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                composerNode.min_value = (float) jSONObject.optDouble("min_value", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                composerNode.max_value = (float) jSONObject.optDouble("max_value", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                composerNode.switch_mode = jSONObject.optInt("switch_mode", 0);
                if (jSONObject.has("nodes")) {
                    composerNode.children = new ArrayList();
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "nodes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        ComposerNode parseComposerNode = parseComposerNode(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), str, str2);
                        if (parseComposerNode != null) {
                            parseComposerNode.parent = composerNode;
                            composerNode.children.add(parseComposerNode);
                        }
                    }
                    if (composerNode.children.size() == 0 || (composerNode.children.size() == 1 && ((ComposerNode) ListProtector.get(composerNode.children, 0)).type == -1)) {
                        return null;
                    }
                } else {
                    List<String> serverUrls = getServerUrls();
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : serverUrls) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str3);
                        LIZ2.append(composerNode.file);
                        arrayList.add(X1D.LIZIZ(LIZ2));
                    }
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(arrayList);
                    urlModel.setUri(composerNode.file);
                    Effect effect = new Effect();
                    effect.setFileUrl(urlModel);
                    effect.setId(composerNode.file);
                    effect.setEffectId(composerNode.file);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    String str4 = File.separator;
                    LIZ3.append(str4);
                    LIZ3.append(effect.getId());
                    LIZ3.append(".zip");
                    effect.setZipPath(X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str2);
                    LIZ4.append(str4);
                    LIZ4.append(effect.getId());
                    effect.setUnzipPath(X1D.LIZIZ(LIZ4));
                    composerNode.effect = effect;
                    JSONObject optJSONObject = jSONObject.optJSONObject("extra_info");
                    String str5 = CardStruct.IStatusCode.DEFAULT;
                    if (optJSONObject != null) {
                        str5 = optJSONObject.optString("version", CardStruct.IStatusCode.DEFAULT);
                    }
                    if (versionCompare(str, str5) < 0) {
                        return null;
                    }
                }
                return composerNode;
            }
            throw new IllegalArgumentException("serverURLs list is empty, call setServerUrls first.");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
